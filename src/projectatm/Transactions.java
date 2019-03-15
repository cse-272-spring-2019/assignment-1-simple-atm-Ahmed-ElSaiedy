    package projectatm;

import java.util.Scanner;

public class Transactions {
    
    static Scanner scan; 
    static final int AccountNumber = 1234;
    static final int Password = 1111;
    static float Balance = 0; 
    static  String[] history = new String[1000]; 
    static int count = 0;    
    
    static int Login (int accountNum, int password){
        if (accountNum == AccountNumber && password == Password){
            return 1;
        }
        else 
            return 0;
    }
    
    static void Deposit (float Amount){
        Balance=Balance+Amount; 
        History(1,Amount);
    }
    
    static void Withdraw (float Amount){
        if (Amount < Balance){
            Balance = Balance - Amount; 
            History(2,Amount);
        }
    }
    
    static void History (int type, float amount) {
        if (type == 1){
            history[count]= String.format("Deposit : %.2f " ,amount);
            count++;
        }
        else if (type == 2){
            history[count]= String.format("Withdraw : %.2f " ,amount);
            count++;
        }
        else if (type == 3){
            history[count]= String.format("Balance : %.2f " ,amount);
            count++;
        }
    }
    }