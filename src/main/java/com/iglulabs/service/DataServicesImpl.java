package com.iglulabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iglulabs.dao.DataDaoImpl;
import com.iglulabs.form.TaskForm;
import com.iglulabs.form.TaskRequest;
import com.iglulabs.model.Person;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDaoImpl dataDao;

	
	@Override
	public boolean addPerson(Person person) throws Exception {
		return dataDao.addPerson(person);
	}

	@Override
	public Long updateTask(TaskRequest taskForm) {
		// TODO Auto-generated method stub
		return dataDao.updateTask(taskForm);
	}

	@Override
	public int addTask(TaskRequest task) {
		// TODO Auto-generated method stub
		return dataDao.addTask(task);
	}


	@Override
	public List<TaskForm> getTask() {
		// TODO Auto-generated method stub
		return dataDao.getTask();
	}

	@Override
	public boolean deleteTask(long id) {
		// TODO Auto-generated method stub
		return dataDao.deleteTask(id);
	}

}
