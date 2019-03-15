package projectatm;

import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class Menu extends JFrame {    
    public Menu() {
        GUIcomponents();
    }
    static int previousCount = 1;
    static int nextCount = 5;
    static int counter = 0;
    static int nextTemp = 0;
    static int temp1;
    static int previousTemp = counter;
    static javax.swing.JButton BalanceButton;
    static javax.swing.JButton DepositButton;
    static javax.swing.JTextField Display;
    static javax.swing.JButton LogOutButton;
    static javax.swing.JButton WithdrawButton;
    static javax.swing.JButton NextButton;
    static javax.swing.JButton PreviousButton;
                           
    private void GUIcomponents() {

        DepositButton = new javax.swing.JButton("Deposit");
        WithdrawButton = new javax.swing.JButton("Withdraw");
        BalanceButton = new javax.swing.JButton("Balance Inquery");
        LogOutButton = new javax.swing.JButton("Log out");
        Display = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton("Next");
        PreviousButton = new javax.swing.JButton("Previous");

        DepositButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        WithdrawButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        BalanceButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        LogOutButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        Display.setFont(new java.awt.Font("Tahoma", 0, 14));
        NextButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        PreviousButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        setTitle("ATM menu");
        
        DepositButton.addActionListener(this::ActionPreformedForDepositButton);
        WithdrawButton.addActionListener(this::ActionPreformedForWithdrawButton);
        BalanceButton.addActionListener(this::ActionPreformedForBalanceButton);
        LogOutButton.addActionListener(this::ActionPreformedForLogOutButton);
        Display.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NextButton.addActionListener(this::ActionPreformedForNextButton);
        PreviousButton.addActionListener(this::ActionPreformedForPreviousButton);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PreviousButton)
                        .addComponent(NextButton)
                    )
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(Display)
                                .addComponent(BalanceButton)
                                .addComponent(LogOutButton)
                        )
                    )
                )
            )
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(DepositButton)
                    .addComponent(WithdrawButton)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawButton)
                    .addComponent(DepositButton)
                )
                .addComponent(Display)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(PreviousButton)
                )
                .addGroup(layout.createSequentialGroup()
                .addComponent(BalanceButton)             
                .addComponent(LogOutButton)
                )
            )
        );
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        layout.linkSize(SwingConstants.HORIZONTAL, BalanceButton, LogOutButton, NextButton, PreviousButton, DepositButton, WithdrawButton);
        layout.linkSize(SwingConstants.VERTICAL, BalanceButton, LogOutButton, NextButton, PreviousButton, DepositButton, WithdrawButton); 
        setSize(365, 300);
    }                       
    

    private void ActionPreformedForDepositButton(java.awt.event.ActionEvent event) {                                              
        setVisible(false);
        Deposit deposit = new Deposit();
        deposit.setVisible(true);
        previousCount = 1;
        nextCount = 5;
        counter ++;
    }                                             

    private void ActionPreformedForWithdrawButton(java.awt.event.ActionEvent event) {                                               
        setVisible(false);
        Withdraw withdraw = new Withdraw();
        withdraw.setVisible(true);
         previousCount = 1;
         nextCount = 5;
         counter ++;
    }                                              

    private void ActionPreformedForBalanceButton(java.awt.event.ActionEvent event) {                                              
        Display.setText(Float.toString(Transactions.Balance));        
        Transactions.History(3, Transactions.Balance);
         previousCount = 1;
         nextCount = 5;
         counter ++;

    } 
    
    private void ActionPreformedForNextButton(java.awt.event.ActionEvent event){
        temp1 = counter;
        if(temp1 < 5 && temp1 > 0 && nextTemp < 5){
            if (Transactions.history[nextTemp] != null)
                Display.setText("->"+Transactions.history[nextTemp]);
                nextTemp ++;
                temp1 --;
                 
            }    
        else{
            if (nextCount > 0 && counter > 0){
            Display.setText("->"+Transactions.history[Transactions.count-nextCount]);
            nextCount --;
            }
            else
            previousCount = 1;
        }
    }
    
    
    private void ActionPreformedForPreviousButton(java.awt.event.ActionEvent event){
        temp1 = counter ;
        if(temp1 < 5 && temp1 > 0 && previousTemp > 0){
            if (Transactions.history[previousTemp-1] != null)
                Display.setText("<-"+Transactions.history[previousTemp-1]);
                previousTemp --;
                temp1 --;
               
            }    
        else{
            if (previousCount <= 5 && counter > 0){
            Display.setText("<-"+Transactions.history[Transactions.count-previousCount]);
            previousCount ++;
            }
            else
            nextCount = 5;        
        }
    }
    private void ActionPreformedForLogOutButton(java.awt.event.ActionEvent event) {                                           
       Transactions.Balance = 0;
        previousCount = 1;
        nextCount = 5;
        counter = 0;
        nextTemp = 0 ;
        for (int i = 0; i <= Transactions.count; i++ ){
            Transactions.history[i]=null;
        }
        setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }                                          

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }                   
}
