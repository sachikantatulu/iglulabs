package com.iglulabs.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iglulabs.constant.Constant;
import com.iglulabs.form.PersonForm;
import com.iglulabs.model.Login;
import com.iglulabs.service.DataServices;
import com.iglulabs.service.LoginService;


@Controller
//@RequestMapping("personForm.html")
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	Login users=null;
	
	@Autowired
	public LoginService loginService;
	@Autowired
	DataServices dataServices;

	
	
	@RequestMapping(value= "/deletestudent",method = RequestMethod.GET)
	public String showForm1() {
				return "deletestudent";
	}
	
	@RequestMapping(value= "/viewallstudents",method = RequestMethod.GET)
	public String showForm13() {
				return "viewallstudents";
	}
	
	// Display the user on the get request
	@RequestMapping(value= "/user",method = RequestMethod.GET)
	public String showForm(HttpServletRequest request) {
		HttpSession session = request.getSession();
		users=(Login)session.getAttribute(Constant.USERSESSION);
	users=null;
	LOGGER.info("user..."+users);
		session.invalidate();
		
		return "loginform";
	}
	
	/*@RequestMapping(value= "/registrationform",method = RequestMethod.GET)
	public String showForm3() {
				return "registrationform";
	}*/
	
	@RequestMapping(value= "/mainhomepagepayment",method = RequestMethod.GET)
	public String showForm1( Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		Login users=(Login)session.getAttribute(Constant.USERSESSION);
		if(users!=null){
			model.addAttribute("users", users);
			session.setAttribute(Constant.USERSESSION, users);
			session.setAttribute("users", users);
			 LOGGER.info("home hhhh!!!");
			 return "mainhomepagepayment";
		}else{
			 LOGGER.info("Login page!!!");
		return "loginform";
		}
	}
	
	
	@RequestMapping(value ="/user",method = RequestMethod.POST)
	public String processForm(@Valid PersonForm personForm,
			Model model,HttpServletRequest request) {
		
		 HttpSession session=request.getSession();
         try{
        	
		//System.out.println("u r in controller class");
		/*if (result.hasErrors()) {
			return "personForm";
		}*/
		users = loginService.checkLogin(personForm.getMob(),personForm.getPassword());
        }catch(Exception e){
    		e.printStackTrace();
    	}
		if(users!=null){
			model.addAttribute("users", users);
			session.setAttribute(Constant.USERSESSION, users);
			session.setAttribute("users", users);
			 LOGGER.info("Login Successfull!!!");
			//logs debug message
		      /*if(LOGGER.isDebugEnabled()){
		         LOGGER.debug("Inside:  LoginController");
		      }*/
		      //logs exception
		      //LOGGER.error("Logging a sample exception", new Exception("Testing"));

		      LOGGER.info("LoginController ended.");
			return "redirect:/mainhomepagepayment";
		}else{
		
			//return "personForm";
			model.addAttribute("msg", "Invalid UserName or Password!! Please try again!!!");
			return "loginform";
		}
	}
}
