package com.bluewhale.daily2weekly.mybatis.entity;

import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 周报信息表
 * @author 张晓睿
 * @version 创建时间   2019年3月14日 下午7:52:03
 */
public class WeeklyInfoEntity {
	
	@ExcelProperty("需求号或任务编号")
	private String taskId;
	@ExcelProperty("任务类型")
	private String taskType;
	@ExcelProperty("任务描述")
	private String taskDes;
	@ExcelProperty("实际开始时间")
	private Date startDate;
	@ExcelProperty("实际结束时间")
	private Date endDate;
	@ExcelProperty("实际工作量")
	private Double workload;
	@ExcelProperty("责任人")
	private String workerName;
	@ExcelProperty("备注")
	private String taskNode;
	@ExcelProperty("完成比率")
	private String completeRatio;
	@ExcelProperty("任务拖延原因/客户评价")
	private String delayReason;
	
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
	public String getCompleteRatio() {
		return completeRatio;
	}
	public void setCompleteRatio(String completeRatio) {
		this.completeRatio = completeRatio;
	}
	public String getDelayReason() {
		return delayReason;
	}
	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}

}
