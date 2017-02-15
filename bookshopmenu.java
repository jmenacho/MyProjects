/* 
Jesus Menacho

Bookshop
*/

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class book
{
	int id;
	String info;
	double price;
}

public class bookshopmenu extends javax.swing.JFrame  {

    
    int numberoflines; 
    ArrayList list;
    int numItems = 0;
    int count = 1;
    double total = 0;
    double discount;
    double taxrate = .06;
    int index;
    int bookqnt;
    String[]Viewtrans;
    ArrayList<String> FinishTrans = new ArrayList<String>();
    int transindex = 0;
    StringBuilder theviewOrder = new StringBuilder();
    DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss a z");
    DateFormat df2= new SimpleDateFormat("yyMMddHHmmss");
    Date thedate;
    double booktotal;
    book[]the_books;
    PrintWriter writer;
    
    
    public bookshopmenu() throws Exception {
        LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("inventory.txt")));
        lnr.skip(Long.MAX_VALUE);
        numberoflines = lnr.getLineNumber();
        lnr.close();
        
        the_books = new book[numberoflines];
        Scanner in = new Scanner(new File("inventory.txt"));
        String str;
        list = new ArrayList();

        for(int i = 0; i < numberoflines; i++)
        {
                the_books[i] = new book();

                str = in.nextLine();

                the_books[i].id = Integer.parseInt(str.substring(0,5) );
                list.add(Integer.parseInt(str.substring(0,5) ));
                int val = str.indexOf('"');
                the_books[i].info = str.substring(val+1, str.lastIndexOf('"') );
                the_books[i].price = Double.parseDouble( str.substring(str.lastIndexOf(' ')+1, str.length() )  );
        }

        writer = null;
        try {
            writer = new PrintWriter("transactions.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bookshopmenu.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        ViewOrderPane = new javax.swing.JOptionPane();
        AboutItemPane = new javax.swing.JOptionPane();
        FinishOrderPane = new javax.swing.JOptionPane();
        NumberOfItemsLabel = new javax.swing.JLabel();
        BookIDLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        ItemInfoLabel = new javax.swing.JLabel();
        SubtotalLabel = new javax.swing.JLabel();
        NumItemsTextField = new javax.swing.JTextField();
        BookIDTextField = new javax.swing.JTextField();
        QntTextField = new javax.swing.JTextField();
        InfoTextField = new javax.swing.JTextField();
        SubtotalTextField = new javax.swing.JTextField();
        Process = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        ViewOrder = new javax.swing.JButton();
        FinishOrder = new javax.swing.JButton();
        NewOrder = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumberOfItemsLabel.setText("Enter number of items of this order");

        BookIDLabel.setText("Enter Book ID for item #1:");

        QuantityLabel.setText("Enter Quantity for item #1:");

        ItemInfoLabel.setText("Item #1 info:");

        SubtotalLabel.setText("Order subtotal  for 0 item(s):");

        InfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoTextFieldActionPerformed(evt);
            }
        });

        Process.setText("Process Item #1");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm Item #1");
        Confirm.setEnabled(false);
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        ViewOrder.setText("View Order");
        ViewOrder.setEnabled(false);
        ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderActionPerformed(evt);
            }
        });

        FinishOrder.setText("Finish Order");
        FinishOrder.setEnabled(false);
        FinishOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishOrderActionPerformed(evt);
            }
        });

        NewOrder.setText("New Order");
        NewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BookIDLabel)
                            .addComponent(NumberOfItemsLabel)
                            .addComponent(QuantityLabel)
                            .addComponent(ItemInfoLabel)
                            .addComponent(SubtotalLabel))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NumItemsTextField)
                                    .addComponent(BookIDTextField)
                                    .addComponent(QntTextField)
                                    .addComponent(SubtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Process)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FinishOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfItemsLabel)
                    .addComponent(NumItemsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookIDLabel)
                    .addComponent(BookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLabel)
                    .addComponent(QntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemInfoLabel)
                    .addComponent(InfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubtotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Process)
                    .addComponent(Confirm)
                    .addComponent(ViewOrder)
                    .addComponent(FinishOrder)
                    .addComponent(NewOrder)
                    .addComponent(Exit))
                .addGap(34, 34, 34))
        );

        pack();
    }

    
    private void InfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {
       numItems = Integer.parseInt(NumItemsTextField.getText());
       if( numItems == 0)
           return;
       
       Viewtrans = new String[numItems];
       
       int IDcheck = Integer.parseInt(BookIDTextField.getText());
      
       if(list.contains(IDcheck) )
       {
          bookqnt = Integer.parseInt(QntTextField.getText());
       
          if(bookqnt < 5)
              discount = 0;
          else if( bookqnt > 4 && bookqnt < 10)
              discount = 90;
          else if( bookqnt > 9 && bookqnt < 15)
              discount = 85;
          else
              discount = 80;
          
          Process.setEnabled(false);
          Confirm.setEnabled(true);
          
          index = list.indexOf(IDcheck);
          
          if(discount != 0)
             InfoTextField.setText(IDcheck + " " + the_books[index].info + " " + bookqnt+ " " 
                  + new DecimalFormat("##.##").format(100 - discount) + "% "+ the_books[index].price);
          else
             InfoTextField.setText(IDcheck + " " + the_books[index].info + " " + bookqnt+ " " 
                  + new DecimalFormat("##.##").format(discount) + "% "+ the_books[index].price); 
         
          
       } 
       else
         AboutItemPane.showMessageDialog(this,"Book ID " + IDcheck + " not in file" );
       
      
    }

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {
        
        Confirm.setEnabled(false);
        Process.setEnabled(true);
        ViewOrder.setEnabled(true);
        FinishOrder.setEnabled(true);
        
        AboutItemPane.showMessageDialog(this,"Item # " + count + " accepted");
        
        if(discount > 0)
        {
            total += the_books[index].price * (discount/100) * bookqnt;
            booktotal = the_books[index].price * (discount/100) * bookqnt;
            
            Viewtrans[transindex]  = new String(count + ". " + the_books[index].id + " "+ "\"" + the_books[index].info + "\""+ 
                " " + the_books[index].price + " "+bookqnt + " " + new DecimalFormat("##.##").format(100 - discount)
                    + "% "+ new DecimalFormat("##.##").format(booktotal));

            FinishTrans.add(the_books[index].id + ", "+ "\"" + the_books[index].info + "\""+ 
                ", " + the_books[index].price + ", "+bookqnt + ", " + new DecimalFormat("##.###").format(100 - discount)
                    + ", "+ new DecimalFormat("##.##").format(booktotal) );
        
        }
            
        else
        {
            total += the_books[index].price * bookqnt;
            booktotal = the_books[index].price * bookqnt;
            
            Viewtrans[transindex]  = new String(count + ". " + the_books[index].id + " " +"\""+the_books[index].info +"\"" +
                " " + the_books[index].price + " "+bookqnt + " " + new DecimalFormat("##.##").format(discount)
                    + "% " + new DecimalFormat("##.##").format(booktotal));

            FinishTrans.add(the_books[index].id + ", "+ "\"" + the_books[index].info + "\""+ 
                ", " + the_books[index].price + ", "+bookqnt + ", " + new DecimalFormat("##.###").format(discount)
                    + ", "+ new DecimalFormat("##.##").format(booktotal) );
        
        
        }
            
         
        SubtotalTextField.setText("" + new DecimalFormat("##.##").format(total));
        
        transindex++;
        count++;
        
        for(int i = transindex -1; i< transindex; i++)
         {
         theviewOrder.append(Viewtrans[i]);
         theviewOrder.append("\r\n");
         }
        
        if(count > numItems)
        {
            Process.setEnabled(false);
            BookIDLabel.setText("");
            QuantityLabel.setText("");
            return;
        }
        
        BookIDLabel.setText("Enter Book ID for item #" + count + ":");
        QuantityLabel.setText("Enter Quantity for item #" + count + ":");
        ItemInfoLabel.setText("Item #" + count + " info:");
        QntTextField.setText("");
        BookIDTextField.setText("");
        Confirm.setText("Confirm Item #" + count);
        Process.setText("Process Item #" + count);
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        writer.close();
        System.exit(0);
    }

    private void NewOrderActionPerformed(java.awt.event.ActionEvent evt) {
       
        theviewOrder = new StringBuilder();
        FinishTrans = new ArrayList<String>();
        transindex = 0;
        count = 1;
        total = 0;
        NumItemsTextField.setText("");
        BookIDTextField.setText("");
        QntTextField.setText("");
        InfoTextField.setText("");
        SubtotalTextField.setText("");
        BookIDLabel.setText("Enter Book ID for item #1:");
        QuantityLabel.setText("Enter Quantity for item #1:");
        Process.setEnabled(true);
        ViewOrder.setEnabled(false);
        FinishOrder.setEnabled(false);
    }

    private void ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {
     
     ViewOrderPane.showMessageDialog(this,""+theviewOrder);
     
    }

    private void FinishOrderActionPerformed(java.awt.event.ActionEvent evt) {
       thedate = new Date();
        
        FinishOrderPane.showMessageDialog(this,"Date:"+df.format(thedate)+"\n\n"+"Number of line items: "+numItems+"\n\n"+"Item#/ID/Title/Qty/Disc%/Subtotal:" 
                +"\n\n"+theviewOrder+"\n\n"+"Order Subtotal: $"+new DecimalFormat("##.##").format(total)+ "\n\n"+"Tax rate:  "
                +new DecimalFormat("#").format(taxrate*100)+"%"+"\n\n"+"Tax amount:  $"+new DecimalFormat("##.##").format(taxrate*total)
                +"\n\n"+"Order Total:  $"+new DecimalFormat("##.##").format(taxrate*total+total)+"\n\n"+"Thank For Shopping");
        

        
        
        for(int i = 0; i < FinishTrans.size(); i++)
        {
         writer.println( df2.format(thedate)+ ", "+ FinishTrans.get(i)+ " " + df.format(thedate) );
        }
       
        FinishTrans = new ArrayList<String>();
        
        
        FinishOrder.setEnabled(false);
        Process.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookshopmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookshopmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookshopmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookshopmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new bookshopmenu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(bookshopmenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration 
    private javax.swing.JOptionPane AboutItemPane;
    private javax.swing.JLabel BookIDLabel;
    private javax.swing.JTextField BookIDTextField;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton Exit;
    private javax.swing.JButton FinishOrder;
    private javax.swing.JOptionPane FinishOrderPane;
    private javax.swing.JTextField InfoTextField;
    private javax.swing.JLabel ItemInfoLabel;
    private javax.swing.JButton NewOrder;
    private javax.swing.JTextField NumItemsTextField;
    private javax.swing.JLabel NumberOfItemsLabel;
    private javax.swing.JButton Process;
    private javax.swing.JTextField QntTextField;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel SubtotalLabel;
    private javax.swing.JTextField SubtotalTextField;
    private javax.swing.JButton ViewOrder;
    private javax.swing.JOptionPane ViewOrderPane;
}
