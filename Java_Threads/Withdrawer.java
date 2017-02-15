import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Withdrawer implements Runnable 
{ 
	private static Random generator = new Random();
	private Account theAccount;
    int itsNumber;

	public Withdrawer(Account sharedAccount, int threadNumner )
	{
		theAccount = sharedAccount;
        itsNumber = threadNumner;

	}

	public void run()
	{
	  int sum = 0;
      Random rnd = new Random();
      int moneyWith = rnd.nextInt(50)+1;
       
         try 
         {
           Thread.sleep((int) (Math.random() * 700)); // sleep thread   
           theAccount.withdraw( moneyWith, itsNumber ); // set value in CheckingAccount
         } // end try
         // if sleeping thread interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } // end catch
	}
}