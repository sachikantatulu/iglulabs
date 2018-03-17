package com.iglulabs.service;

import java.util.List;

import com.iglulabs.form.LoginForm;
import com.iglulabs.form.PersonForm;
import com.iglulabs.form.TaskForm;
import com.iglulabs.form.TaskRequest;
import com.iglulabs.model.Person;
import com.iglulabs.model.Task;


public interface DataServices {
	public boolean addPerson(Person person) throws Exception;
	//public boolean addBulkStudent(PersonForm personForm)throws Exception;
	//public boolean deleteExam(long examId);
	//public List<LoginForm> getStudentList();
	public Long updateTask(TaskRequest taskform);
	public int addTask(TaskRequest task);
	public List<TaskForm> getTask();
	public boolean deleteTask(long id);
	
}
