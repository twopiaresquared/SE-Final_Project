# SE-Final-Project
Software Engineering Fall 2019
Homework assignment 4
Due 12/23/2019
For this assignment you will demonstrate a simple use for synchronization in Java. Please zip & submit
your code via Sakai.
Create a bank account class called Account using Java with methods deposit & withdraw. The deposit
method should accept attribute amount & update balance to the sum of amount & balance. Similarly,
the withdraw method should accept the attribute amount & update the balance ‘balance – amount’ if
balance > = amount or print an error otherwise. Below is the stub.
public class Account {
private double balance = 0;
public Account(double balance) {
this.balance = balance;
}
public void deposit(double amount) {
//Implementation here
}
public void withdraw(double amount) {
//Implementation here
}
}
Create 2 thread classes (1 for withdrawal and 1 for deposit). The stub is below:
public class WithdrawThread implements Runnable {
private Account account;
private double amount;
public WithdrawThread(Account account, double amount) {
//Set the account & balance
}
public void run() {
//make a withdrawal
}
}//end WithdrawThread class
public class DepositThread implements Runnable {
private Account account;
private double amount;
public DepositThread(Account account, double amount) {
//Set the account & balance
}
public void run() {
//make a deposit
}} 
Create a main class below and run it. Provide output.
public class InternetBankingSystem {
public static void main(String [] args ) {
Account accountObject = new Account(100);
new Thread(new DepositThread(accountObject,30)).start();
new Thread(new DepositThread(accountObject,20)).start();
new Thread(new DepositThread(accountObject,10)).start();
new Thread(new WithdrawThread(accountObject,30)).start();
new Thread(new WithdrawThread(accountObject,50)).start();
new Thread(new WithdrawThread(accountObject,20)).start();
} // end main()
}
Now, update the account class using synchronization of methods (See chapter 5), to ensure that the
balance is locked during the withdrawal & deposit methods. Run the main class again and provide
output.  
