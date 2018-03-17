package com.iglulabs.form;

import java.sql.Time;
import java.util.Date;

public class TaskForm {
	private Long id;
    private String taskObjective;
    private String createDate;
    private String startTime;
   	private String endTime;
   	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskObjective() {
		return taskObjective;
	}
	public void setTaskObjective(String taskObjective) {
		this.taskObjective = taskObjective;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
   	
}
