public class Account 
{
   private double balance = 0;

   public Account(double balance) 
   {
       this.balance = balance;
   }

   public synchronized void deposit(double amount) 
   {
       
       balance += amount;

   }

   
   public double getBalance() 
   {
       return balance;
   }

   public synchronized void withdraw(double amount) 
   {
       

       if (balance >= amount) 
       {
           balance -= amount;

       } else 
       {
           System.out.println("Error !");

       }
   }
}
