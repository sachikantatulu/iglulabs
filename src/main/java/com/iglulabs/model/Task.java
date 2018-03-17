package com.iglulabs.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "task_objective")
    private String taskObjective;
	@Column(name = "create_date")
    private Date createDate;
	@Column(name = "start_time")
    private Date startTime;
	@Column(name = "end_time")
   	private Date endTime;
	@Column(name = "status")
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
