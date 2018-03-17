package com.iglulabs.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.iglulabs.dao.DataDao;
import com.iglulabs.form.LoginForm;
import com.iglulabs.form.PersonForm;
import com.iglulabs.form.TaskForm;
import com.iglulabs.form.TaskRequest;
import com.iglulabs.model.Person;
import com.iglulabs.model.Task;
import com.iglulabs.service.DataServices;
import com.iglulabs.service.LoginService;


@Controller
@RequestMapping("/PersonRestService")
public class RestController {

	@Autowired
	DataServices dataServices;
	
	@Autowired
	DataDao dataDao;
	
	@Autowired
	public LoginService loginService;
	
	static final Logger logger = Logger.getLogger(RestController.class);
		
	@RequestMapping(value = "/UpdatePersonRegistration", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	int addPerson(@RequestBody Person person) {
		try {
			dataServices.addPerson(person);
			return 1;
		} catch (Exception e) {
			 e.printStackTrace();
			return 0;
		}

	}
	@ResponseBody
	@RequestMapping(value = "/createtask", method = RequestMethod.POST)
	public String
	 addTask(@RequestBody TaskRequest task) {
		try {
			dataServices.addTask(task);
			return new Gson().toJson("1");
		} catch (Exception e) {
			 e.printStackTrace();
			 return new Gson().toJson("0");
		}

	}
	
		@RequestMapping(value = "/updatetask", method = RequestMethod.POST)
	public @ResponseBody
	Long updateTask(@RequestBody TaskRequest taskform) {
		Long id=(long) 0;
		try {
			
		 id=dataServices.updateTask(taskform);
		 System.out.println("updateStudent Restcontroller"+id);
		//return new Status().setCode(id);
		return id;
		} catch (Exception e) {
			 e.printStackTrace();
			return id ;
		}

	}
	@ResponseBody
	@RequestMapping(value = "/viewalltask", method = RequestMethod.GET)
	public  
	String getTasks() {
		System.out.println("hii");
		List<TaskForm> taskList = null;
		try {
			taskList = dataServices.getTask();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new Gson().toJson(taskList);
	}
	
	@RequestMapping(value = "deletetask", method = RequestMethod.GET)
	public @ResponseBody
	int deleteTask(@RequestParam("id") long id) {

		try {
			dataServices.deleteTask(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}
		
}
