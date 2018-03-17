package com.iglulabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iglulabs.dao.LoginDAO;
import com.iglulabs.model.Login;
import com.iglulabs.model.PasswordResetToken;
import com.iglulabs.model.Person;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
       public Login checkLogin(String mob, String password){
    	   
              return loginDAO.checkLogin(mob, password);
       }

	@Override
	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		return loginDAO.findByEmail(email);
	}

	@Override
	public void save(PasswordResetToken token) {
		// TODO Auto-generated method stub
		loginDAO.save(token);
	}
}