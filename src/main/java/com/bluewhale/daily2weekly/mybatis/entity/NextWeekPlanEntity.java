package com.bluewhale.daily2weekly.mybatis.entity;

import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 下周计划表
 * @author 张晓睿
 * @version 创建时间   2019年3月14日 下午8:07:12
 */
public class NextWeekPlanEntity {

	@ExcelProperty("需求或任务编号")
	private String taskId;
	@ExcelProperty("任务类型")
	private String taskType;
	@ExcelProperty("任务名称")
	private String taskDes;
	@ExcelProperty("计划开始时间")
	private Date startDate;
	@ExcelProperty("计划结束时间")
	private Date endDate;
	@ExcelProperty("预计工作量")
	private Double workload;
	@ExcelProperty("责任人")
	private String workerName;
	@ExcelProperty("备注")
	private String taskNode;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskDes() {
		return taskDes;
	}
	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Double getWorkload() {
		return workload;
	}
	public void setWorkload(Double workload) {
		this.workload = workload;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getTaskNode() {
		return taskNode;
	}
	public void setTaskNode(String taskNode) {
		this.taskNode = taskNode;
	}
	
}
