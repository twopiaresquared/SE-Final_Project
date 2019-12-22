public class Account {
   private double balance = 0;

   public Account(double balance) {
       this.balance = balance;
   }

   public synchronized void deposit(double amount) {
       // Implementation here
       balance += amount;

   }

   /**
   * @return the balance
   */
   public double getBalance() {
       return balance;
   }

   public synchronized void withdraw(double amount) {
       // Implementation here

       if (balance >= amount) {
           balance -= amount;

       } else {
           System.out.println("Error !");

       }
   }
}


public class WithdrawThread implements Runnable {
   private Account account;
   private double amount;

   public WithdrawThread(Account account, double amount) {

       // Set the account & balance
       this.account=account;
       this.amount=amount;

   }

   public void run() {
       // make a withdrawal
      
      
       account.withdraw(amount);
       System.out.println("After WithDraw:"+account.getBalance());
   }
}// end WithdrawThread class

public class DepositThread implements Runnable {
   private Account account;
   private double amount;

   public DepositThread(Account account, double amount) {

       // Set the account & balance
       this.account=account;
       this.amount=amount;
   }

   public void run() {
       // make a deposit
      
       account.deposit(amount);
       System.out.println("After Deposit:"+account.getBalance());
   }
}

public class InternetBankingSystem {
   public static void main(String[] args) {
       Account accountObject = new Account(100);
       new Thread(new DepositThread(accountObject, 30)).start();
       new Thread(new DepositThread(accountObject, 20)).start();
       new Thread(new DepositThread(accountObject, 10)).start();
       new Thread(new WithdrawThread(accountObject, 30)).start();
       new Thread(new WithdrawThread(accountObject, 50)).start();
       new Thread(new WithdrawThread(accountObject, 20)).start();
      
   } // end main()
}
