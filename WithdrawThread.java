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
}
