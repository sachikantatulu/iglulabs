package com.iglulabs.dao;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.iglulabs.controllers.LoginController;
import com.iglulabs.model.Login;
import com.iglulabs.model.PasswordResetToken;
import com.iglulabs.model.Person;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO{
	private static final Logger LOGGER = Logger.getLogger(LoginDAOImpl.class);
			 
       @Resource(name="sessionFactory")
       protected SessionFactory sessionFactory;

       public void setSessionFactory(SessionFactory sessionFactory) {
              this.sessionFactory = sessionFactory;
       }
      
       protected Session getSession(){
              return sessionFactory.openSession();
       }

       public Login checkLogin(String mob, String password){
    	   LOGGER.info("In DAO class Check login");
			Session session = sessionFactory.openSession();
			try{
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Login as o where o.userName=? and o.userPassword=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,mob);
			query.setParameter(1,password);
			Login users = (Login)query.list().get(0);
			session.close();
			return users;
			}catch(Exception exception){
				exception.printStackTrace();
				return null;
			}
       }

	@Override
	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		LOGGER.info("In DAO class Check email");
		Session session = sessionFactory.openSession();
		try{
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Person as p where p.email=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,email);
		
		Person user = (Person)query.uniqueResult();
		session.close();
		return user;
		}catch(Exception exception){
			exception.printStackTrace();
			return null;
		}
	}

	@Override
	public void save(PasswordResetToken token) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session = sessionFactory.openSession();
		session.save(token);
		session.close();
	}
}