package com.csu.ohio.student.bean;

import java.util.Date;

public class SemesterBean {
	private Integer studentId;
	private String transactionId;
    private String studentName;
    private String semester;
    private Double feePaidAmount;
	private Double balance;
	private Date paidDate;
	private String status;
	
	public SemesterBean() {
		super();
	}
	public SemesterBean(Integer studentId, String transactionId, String studentName, String semester,
			Double feePaidAmount, Double balance, Date paidDate, String status ) {
		super();
		this.studentId = studentId;
		this.transactionId = transactionId;
		this.studentName = studentName;
		this.semester = semester;
		this.feePaidAmount = feePaidAmount;
		this.balance = balance;
		this.paidDate = paidDate;
		this.status = status;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Double getFeePaidAmount() {
		return feePaidAmount;
	}
	public void setFeePaidAmount(Double feePaidAmount) {
		this.feePaidAmount = feePaidAmount;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "SemesterBean [studentId=" + studentId + ", transactionId=" + transactionId + ", studentName="
				+ studentName + ", semester=" + semester + ", feePaidAmount=" + feePaidAmount + ", balance=" + balance
				+ ", paidDate=" + paidDate + ", status=" + status + "]";
	}
}