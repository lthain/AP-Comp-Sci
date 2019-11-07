public class account{
	private double balance;
	private String name;
	private long acctNum;
	
public double getBalance(){
	return balance;
}

public String getName() {
	return name;
}

public account(double balance, String name, long acctNum){
 this.balance = balance;
 this.name = name;
 this.acctNum = acctNum;
 
 }

public void withdraw(double amount){
 if (balance >= amount)
    balance -= amount;
 else
    System.out.println("Insufficient funds");
}

public void deposit(double amount) {
	balance += amount;
}

public void chargeFee() {
	balance -= 10;
}

public void changeName(String newName){
	name= newName;
}
public String toString(){
	return "Name: " +name+ ". account num: "+  acctNum +". balance: "+ balance;
}


}
