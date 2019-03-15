package projectatm;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private Component frame;
    public Login() {
        GUIcomponents();
    }
    
    static javax.swing.JButton LoginButton;
    static javax.swing.JButton ExitButton;
    static javax.swing.JTextField accountField;
    static javax.swing.JLabel accountLabel;
    static javax.swing.JPasswordField passwordField;
    static javax.swing.JLabel passwordLabel;    
    
    private void GUIcomponents() {

        LoginButton = new javax.swing.JButton("Login");
        ExitButton = new javax.swing.JButton("Exit");
        accountLabel = new javax.swing.JLabel("Account Number");
        passwordLabel = new javax.swing.JLabel("Password");
        accountField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        setTitle("ATM Login");

        LoginButton.addActionListener(this::ActionPreformedForLoginButton);
        ExitButton.addActionListener(this::ActionPreformedForExitButton);

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
                            .addComponent(accountLabel)
                            .addComponent(passwordLabel)
                        )
                        .addComponent(LoginButton)
                        .addComponent(ExitButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(passwordField)
                        )
                    )
                )
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountField)
                    .addComponent(accountLabel)
                )
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField)
                )
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(ExitButton)
                )
            )
        );
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }                   

    private void ActionPreformedForLoginButton(java.awt.event.ActionEvent event) {                                            
        int flag;
        int accountNum = Integer.parseInt(accountField.getText());
        int password = Integer.parseInt(passwordField.getText());
        flag = Transactions.Login(accountNum, password);
        if (flag == 1 ){
            JOptionPane.showMessageDialog(null, "You have successfully logged in");
            setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Wrong acount number or password !!");
          accountField.setText(null);
          passwordField.setText(null);
        }
        
    }
    
    private void ActionPreformedForExitButton(java.awt.event.ActionEvent event){
        System.exit(0);
    }
    
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }              
}
