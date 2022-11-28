package com.gl.learning25nov;
class Account{
	String customerName;
	int accountNo;
	Account(String a,int b){
		customerName=a;
		accountNo =b;
	}
	void display(){
		System.out.println("customeName= "+customerName);
		System.out.println("accountNo= "+accountNo);
	}
}

class CurrentAccount extends Account {
	int currentBalance;
	CurrentAccount(String a, int b, int c){
		super(a,b);
		currentBalance = c;
	}
	void display(){
		super.display();
		System.out.println("CurrentBalance= "+currentBalance);
	}
}
class AccountDetails extends CurrentAccount{
	int depositAmount,withdrawalAmount;
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		depositAmount = d;
		withdrawalAmount=e;
	}
	void display() {
		super.display();
		System.out.println("depositAmount= "+depositAmount);
		System.out.println("withdrawalAmount= "+withdrawalAmount);
	    
	}
}
public class codeChallange11 {

	public static void main(String[] args) {
		AccountDetails A = new AccountDetails("Harshit",11111,10000,5000,500);
		A.display();

	}

}
