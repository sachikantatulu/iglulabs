package com.iglulabs.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.iglulabs.constant.Constant;
import com.iglulabs.form.TaskForm;
import com.iglulabs.form.TaskRequest;
import com.iglulabs.model.Login;
import com.iglulabs.model.Person;
import com.iglulabs.model.Task;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	private static final Logger LOGGER = Logger.getLogger(LoginDAOImpl.class);
	@Override
	public boolean addPerson(Person person) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Long id=(Long)session.save(person);
		person.setId(id);
		Login users=new Login();
		users.setPerson(person);
		users.setRole(Constant.ROLEUSER);
		users.setUserName(person.getUserId());
		users.setUserPassword(person.getPassword());
		session.save(users);
		tx.commit();
		session.close();
		return false;
	}
	
	@Override
	public Long updateTask(TaskRequest taskForm) {
		// TODO Auto-generated method stub
		try{
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		Task taskk=new Task();
		  String hql = "from  Task as a where  a.id=?";
			Query query = session.createQuery(hql);
			query.setParameter(0,taskForm.getId());
			taskk=(Task)query.uniqueResult();
			taskk=this.getTasks(taskForm, taskk);
			session.update(taskk);
		tx.commit();
		session.close();
		}catch(Exception exception){
		exception.printStackTrace();	
		}
		return 1L;
	}

	private Login getLogin(Long userId){
		Login login=new Login();
		Session session = sessionFactory.openSession();
		  String hql = "from  Login as a where  a.person.id=?";
			Query query = session.createQuery(hql);
			query.setParameter(0,userId);
			login=(Login)query.uniqueResult();
			//session.close();
		return login;
	}

	public boolean deleteTask(long id) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Object o = session.load(Task.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		session.close();
		return true;
	}

public int addTask(TaskRequest task) {
	try {
	Task taskk=new Task();
	taskk=this.getTasks(task,taskk);
	session = sessionFactory.openSession();
	tx = session.beginTransaction();
	session.save(taskk);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	tx.commit();
	session.close();
	return 1;
}

private Task getTasks(TaskRequest task,Task taskk)throws Exception {
	// TODO Auto-generated method stub
	taskk.setTaskObjective(task.getTaskObjective());
	//taskk.setCreateDate(task.getCreateDate());
	String startDate=task.getStartTime();
	String endDate=task.getEndTime();
	SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
	
	java.util.Date date;
	date = sdf1.parse(startDate);
	java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
	taskk.setStartTime(sqlStartDate);
	java.util.Date date1;
	date1 = sdf1.parse(endDate);
	java.sql.Date sqlStartDate1 = new java.sql.Date(date1.getTime());
	taskk.setEndTime(sqlStartDate1);
	taskk.setStatus(task.getStatus());
	return taskk;
}

public List<TaskForm> getTask() {
	// TODO Auto-generated method stub
	
	session=sessionFactory.openSession();
	String hql="from Task";
	Query query=session.createQuery(hql);
	List<Task> taskList=query.list();
	List<TaskForm> taskForms=this.getTaskList(taskList);
	session.close();
	return taskForms;
}

private List<TaskForm> getTaskList(List<Task> taskList) {
	// TODO Auto-generated method stub
	List<TaskForm> taskForms=new ArrayList<TaskForm>();
   for (Task task : taskList) {
	   TaskForm taskForm=new TaskForm();
	   try{
	    this.getTaskForm(taskForm, task);
	   }catch(Exception  exception){
		   exception.printStackTrace();
	   }
	   taskForms.add(taskForm);
	}
	
	return taskForms;
}
   
   private TaskForm getTaskForm(TaskForm task,Task taskk)throws Exception {
		// TODO Auto-generated method stub
	   SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
	   task.setTaskObjective(taskk.getTaskObjective());
	   //task.setCreateDate(taskk.getCreateDate());
		Date startDate=taskk.getStartTime();
		Date endDate=taskk.getEndTime();
		String startdate = sdf1.format(startDate);
		task.setStartTime(startdate);
		String enddate = sdf1.format(endDate);
		task.setEndTime(enddate);
		task.setStatus(taskk.getStatus());
		task.setId(taskk.getId());
		return task;
	}
   
}
