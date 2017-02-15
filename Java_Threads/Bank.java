/* Name:Jesus Menacho
Java Synchronized Threads
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Bank
{
   public static void main( String[] args )
   {
      
      Account sharedAccount = new Transaction();

      boolean check = true;

		System.out.println("Deposit Threads\t\tWithdrawal Threads\tBalance\n");

         Runnable D1 = new Depositor( sharedAccount, 1) ;
         Runnable D2= new Depositor( sharedAccount, 2) ;
         Runnable D3 = new Depositor( sharedAccount, 3) ;
         Runnable W1= new Withdrawer( sharedAccount, 4) ;
         Runnable W2 = new Withdrawer( sharedAccount,5) ;
         Runnable W3 =  new Withdrawer( sharedAccount, 6) ;
         Runnable W4 = new Withdrawer( sharedAccount, 7) ; 
         Runnable W5 =  new Withdrawer( sharedAccount,8) ;
         Runnable W6 =  new Withdrawer( sharedAccount, 9) ;
         
      while(check)
      {
         new Thread(D1).start();
         new Thread(D2).start();
         new Thread(D3).start();
         new Thread(W1).start();
         new Thread(W2).start();
         new Thread(W3).start();
         new Thread(W4).start();
         new Thread(W5).start();
         new Thread(W6).start();
      }
      //application.shutdown();
   } // end main

  

   
} 