package com.iglulabs.service;

import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.iglulabs.model.PasswordResetToken;
import com.iglulabs.model.Person;

@Service
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	public LoginService loginService;
	
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendMail(String emailId,PasswordResetToken token,HttpServletRequest request)
	{
		System.out.println("mailSender value"+mailSender);
		MimeMessage message =  this.mailSender.createMimeMessage();
		MimeMessageHelper mimeHelper;
		try {
			
			mimeHelper = new MimeMessageHelper(message,true);
			mimeHelper.setTo(emailId);
			
			
			mimeHelper.setFrom("softechnocontesting@gmail.com");
			mimeHelper.setSubject("Password Reset");
			String url=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
			//mimeHelper.setText("<html><body>hi,<br/><a href='http://localhost:3030/ForgotPassword/newPassword/"+emailId+"/'> Click here</a> to reset password</body></html>",true);
			mimeHelper.setText("<html><body>hi,<br/><a href='"+url+"/onlineexam/resetpassword?token=" + token.getToken()+"'> Click here</a> to reset password</body></html>",true);
			mailSender.send(message);
		} catch (MessagingException e) {
			System.out.println("Error Sending email "+ e.getMessage());
		}
		
	}
}
