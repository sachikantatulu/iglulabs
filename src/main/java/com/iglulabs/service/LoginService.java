package com.iglulabs.service;

import com.iglulabs.model.Login;
import com.iglulabs.model.PasswordResetToken;
import com.iglulabs.model.Person;

public interface LoginService{    
       public Login checkLogin(String mob, String password);

	public Person findByEmail(String email);

	public void save(PasswordResetToken token);

	//public Person findByToken(String token);
}