public class DepositThread implements Runnable 
{
   private Account account;
   private double amount;

   public DepositThread(Account account, double amount) 
   {

       
       this.account=account;
       this.amount=amount;
   }

   public void run() 
   {
       
      
       account.deposit(amount);
       System.out.println("After Deposit:"+account.getBalance());
   }
}
