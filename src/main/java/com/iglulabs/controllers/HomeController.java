package com.iglulabs.controllers;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iglulabs.constant.Constant;
import com.iglulabs.model.Login;
import com.iglulabs.model.PasswordResetToken;
import com.iglulabs.model.Person;
import com.iglulabs.service.LoginService;
import com.iglulabs.service.MailService;
@Controller
public class HomeController {
	@Autowired
	private MailService mailService; 

	static final Logger logger = Logger.getLogger(RestController.class);

	@Autowired
	public LoginService loginService;
	
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}
	
	@RequestMapping(value= "/resetpassword",method = RequestMethod.GET)
	//@RequestParam Map<String,String> requestParams
	public String resetPassword(HttpServletRequest request,@RequestParam(value="token") String token,Model model) {
		//System.out.println("token is"+token);
		/*for (Map.Entry<String, String> entry : requestParams.entrySet())
		{
		    System.out.println("values" + entry.getValue());
		    String s=entry.getValue();
		    System.out.println("values in string.."+s);
		    String str[]=s.split(",");
		    String token=str[0];
		    String id=str[1];
		    System.out.println("token.."+token);
		    System.out.println("id.."+id);*/
		    model.addAttribute("token", token);
		return "resetpassword";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST) 
    public String resetRequest(HttpServletRequest request,Model model ) {  
		Person user=null;
        String email=request.getParameter("email");
        logger.info("email id is:"+email);
        try{
    
        user = loginService.findByEmail(email);
        
        if(user!=null){
			model.addAttribute("users", user);
			logger.info("valid user!!!"+user.getId());
			
			PasswordResetToken token = new PasswordResetToken();
	        token.setToken(UUID.randomUUID().toString());
	        token.setUser(user);
	        token.setExpiryDate(5);
	        loginService.save(token);
	       // model.addAttribute("token", token.getToken());
	        //HttpSession session=request.getSession();
	        //session.setAttribute("token", token.getToken());
	        //session.setAttribute("users", user.getId());
			mailService.sendMail(email,token,request);
			model.addAttribute("msg1", "You've successfully requested a new password reset...Please check your e-mail...!!!");
	        return "loginform"; 
			
		}else{
			
			model.addAttribute("msg", "We could not find an account for that e-mail address.Please Try Again with registered e-mail");
			 return "loginform";
		}
        }
        catch (Exception e) {
			 e.printStackTrace();
			return "loginform";
		}
		          
    }  
}
