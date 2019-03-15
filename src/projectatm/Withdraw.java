package projectatm;

import javax.swing.JOptionPane;

public class Withdraw extends javax.swing.JFrame {

     Menu menu = new Menu();
    public Withdraw() {
        GUIcomponents();
    }
    
   
    
    static javax.swing.JButton Button1;
    static javax.swing.JButton Button2;
    static javax.swing.JButton Button3;
    static javax.swing.JButton Button4;
    static javax.swing.JButton Button5;
    static javax.swing.JButton Button6;
    static javax.swing.JButton Button7;
    static javax.swing.JButton Button8;
    static javax.swing.JButton Button9;
    static javax.swing.JButton Button0;
    static javax.swing.JButton DeleteButton;
    static javax.swing.JButton EnterButton;
    static javax.swing.JTextArea Display;
    static javax.swing.JLabel jLabel1;                  
                              
    private void GUIcomponents() {

        Button1 = new javax.swing.JButton("1");
        Button2 = new javax.swing.JButton("2");
        Button3 = new javax.swing.JButton("3");
        Button4 = new javax.swing.JButton("4");
        Button5 = new javax.swing.JButton("5");
        Button6 = new javax.swing.JButton("6");
        Button7 = new javax.swing.JButton("7");
        Button8 = new javax.swing.JButton("8");
        Button9 = new javax.swing.JButton("9");
        Button0 = new javax.swing.JButton("0");
        EnterButton = new javax.swing.JButton("Enter");
        DeleteButton = new javax.swing.JButton("Delete");
        jLabel1 = new javax.swing.JLabel("Select the amount you want to withdraw");
        Display = new javax.swing.JTextArea();
        setTitle("ATM Withdraw");
        
        Button1.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button2.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button3.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button4.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button5.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button6.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button7.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button8.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button9.setFont(new java.awt.Font("Tahoma", 0, 18));
        Button0.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16));
        EnterButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        Display.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        Button1.addActionListener(this::ActionPreformedForButton1);
        Button2.addActionListener(this::ActionPreformedForButton2);
        Button3.addActionListener(this::ActionPreformedForButton3);
        Button4.addActionListener(this::ActionPreformedForButton4);
        Button5.addActionListener(this::ActionPreformedForButton5);
        Button6.addActionListener(this::ActionPreformedForButton6);
        Button7.addActionListener(this::ActionPreformedForButton7);
        Button8.addActionListener(this::ActionPreformedForButton8);
        Button9.addActionListener(this::ActionPreformedForButton9);
        Button0.addActionListener(this::ActionPreformedForButton0);
        DeleteButton.addActionListener(this::ActionPreformedForDeleteButton);
        EnterButton.addActionListener(this::ActionPreformedForEnterButton);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1)
                            .addComponent(Button4)
                            .addComponent(Button7)
                            .addComponent(EnterButton)
                        )
                        .addGap(50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DeleteButton)
                            )                            
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button2)
                            )           
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button5)
                                        .addGap(70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Button9)
                                            .addComponent(Button6)
                                            .addComponent(Button3)    
                                        )
                                    )
                                    .addComponent(Button0)
                                )
                            )
                        )
                    )
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Display)
                        )
                    )
                )
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addComponent(Display)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1)
                    .addComponent(Button2)
                    .addComponent(Button3)
                )
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4)
                    .addComponent(Button5)
                    .addComponent(Button6)
                )
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7)
                    .addComponent(Button8)
                    .addComponent(Button9)
                )
                .addComponent(Button0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterButton)
                    .addComponent(DeleteButton)
                )
            )
        );
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }     

    private void ActionPreformedForButton1(java.awt.event.ActionEvent event) {                                      
        Display.append("1");
    }                                     

    private void ActionPreformedForButton2(java.awt.event.ActionEvent event) {                                      
        Display.append("2");
    }                                     

    private void ActionPreformedForButton3(java.awt.event.ActionEvent event) {                                      
        Display.append("3");
    }                                     

    private void ActionPreformedForButton4(java.awt.event.ActionEvent event) {                                      
        Display.append("4");
    }                                     

    private void ActionPreformedForButton5(java.awt.event.ActionEvent event) {                                      
        Display.append("5");
    }                                     

    private void ActionPreformedForButton6(java.awt.event.ActionEvent event) {                                      
        Display.append("6");
    }                                     

    private void ActionPreformedForButton7(java.awt.event.ActionEvent event) {                                      
        Display.append("7");
    }                                     

    private void ActionPreformedForButton8(java.awt.event.ActionEvent event) {                                      
        Display.append("8");
    }       
    
    private void ActionPreformedForButton9(java.awt.event.ActionEvent event) {                                      
        Display.append("9");
    }                                     
    
    private void ActionPreformedForButton0(java.awt.event.ActionEvent event) {                                      
        Display.append("0");
    }                                     
    
    private void ActionPreformedForDeleteButton(java.awt.event.ActionEvent event) {                                      
        String str = Display.getText();
        int len =str.length();
        Display.setText((str.substring(0 ,len - 1))); 
        
    }                                     

    private void ActionPreformedForEnterButton(java.awt.event.ActionEvent event) {                                           
        float amount = Float.parseFloat(Display.getText());
        if (amount < Transactions.Balance ){
            Transactions.Withdraw(amount);
            setVisible(false);
            menu.setVisible(true);
            JOptionPane.showMessageDialog(null, "Withdraw successful...your new balance is : "+Transactions.Balance);
        }
        else{
            setVisible(false);
            menu.setVisible(true);
            JOptionPane.showMessageDialog(null, "You have insufficient funds...");
        }
    }                                          
   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new Withdraw().setVisible(true);
        });
    } 
}
