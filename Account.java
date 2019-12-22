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
