import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class Transaction implements Account
{
	private Lock accessLock = new ReentrantLock();
	
	private int currency = 0;

	public void deposit( int moneyDept, int threadNumber )
	{
		accessLock.lock();

		
			currency += moneyDept;
			System.out.print( "Thread "+threadNumber + " deposits " +"$" +moneyDept);
			System.out.println("\t\t\t\tBalance is $"+ currency);
		
		
        
         accessLock.unlock(); // unlock this object
        
	}

   	public void withdraw(int moneyWith, int threadNumber)
   	{
   		accessLock.lock();

		
			if(moneyWith <= currency)
			{
				currency = currency - moneyWith;
			    
			    System.out.print( "\t\t\tThread "+threadNumber + " withdraws $" + moneyWith);
			    System.out.println("\tBalance is $"+ currency);
			}
			else
			{
				System.out.print( "\t\t\tThread "+threadNumber + " withdraws $" + moneyWith);
				System.out.println( " Withdrawal - Blocked - Insufficient Funds");
			}
    
         accessLock.unlock(); // unlock this object
        
   	}
}