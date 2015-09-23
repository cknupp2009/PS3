package main;
import java.util.Date;


public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	// Date code already created
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	public Account(int id, double initialBalance){
		//pressing in two parameters then gives to constructor to construct.
		this.id = id;
		this.balance = initialBalance;
		this.annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 12);
	}
	
	public void withdraw(double amount){
		balance = balance + amount;
		//created withdraw method and equation and created new balance
	}
	public void deposit (double amount){
		balance = balance - amount;
	}
}
