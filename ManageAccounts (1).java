public class ManageAccounts{
    public static void main(String[] args){
	account acct1, acct2;

	//create account1 for Sally with $1000
	acct1 = new account(1000, "Sally", 1111);
	
	//create account2 for Joe with $500
	acct2 = new account(500, "Joe", 2222);

	//deposit $100 to Joe's account
	acct1.deposit(100);

	//print Joe's new balance (use getBalance())
	System.out.println(acct2.getName() + " has the balance of " + acct2.getBalance());
	
	//withdraw $50 from Sally's account
	acct2.withdraw(50);
	
	//print Sally's new balance (use getBalance())
	System.out.println(acct1.getName() + " has the balance of " + acct1.getBalance());
	
	//charge fees to both accounts
	acct1.chargeFee();
	acct2.chargeFee();
	
	//change the name on Joe's account to Joseph
	acct2.changeName("Joseph");
	
	//print summary for both accounts
	System.out.println(acct1.toString());
	System.out.println(acct2.toString());
	
    }
}
