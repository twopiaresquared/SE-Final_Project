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
