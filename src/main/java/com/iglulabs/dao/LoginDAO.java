package com.iglulabs.dao;
import com.iglulabs.model.*;

public interface LoginDAO{    
       public Login checkLogin(String mob, String password);

	public Person findByEmail(String email);

	public void save(PasswordResetToken token);
}