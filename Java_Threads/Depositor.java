
import java.util.concurrent.locks.ReentrantLock;

// Depositor's run method stores the values 1 to 10 in CheckingAccount.
import java.util.Random;

public class Depositor implements Runnable 
{
   private static Random generator = new Random();
    private Account theAccount;
    int itsNumber;

   // constructor
   public Depositor(Account sharedAccount, int threadNumner )
   {
      theAccount = sharedAccount;
      itsNumber = threadNumner;
   } // end Depositor constructor

   
   public void run()
   {
      int sum = 0;
      Random rnd = new Random();
      int moneyDept = rnd.nextInt(200)+1;
       
         try
         {
           Thread.sleep((int) (Math.random() * 3000)); // sleep thread   
           theAccount.deposit( moneyDept, itsNumber ); // set value 
         } // end try
         // if sleeping thread interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } // end catch
       // end for

      
   } // end method run
} // end class Depositor