package model.entities;

import java.util.Date;

public class Installments {
	private Date dueDate;
	private Double value;
	
	private Contract contract;
	
	public Installments() {
	}

	public Installments(Date dueDate, Double value, Contract contract) {
		this.dueDate = dueDate;
		this.value = value;
		this.contract = contract;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
