
package atmcasestudy;



import java.util.*;

class AtmCaseStudy {
static Scanner input = new Scanner(System.in);

public static int[] login = new int[5];

    public static void main(String[] args) {
    AtmCaseStudy call = new AtmCaseStudy();
    BankDatabase callbank = new BankDatabase();
    Keypad callkey = new Keypad();
    callkey.UserLogin();
    callkey.AccInput();
    }
    
public class ATM{

    
    
} 

public static class Keypad extends BankDatabase{



 
    public void UserLogin(){
    System.out.println("Welcome!");
    }
    
    public void AccInput(){
    BankDatabase callbank = new BankDatabase();
    Screen screenobj = new Screen();
    Keypad back = new Keypad();
    System.out.print("Please enter your account number: ");
    
    while(true){
        
    try{
        
    login[0] = input.nextInt();

if(login[0] != AccountNumber[0] && login[0] != AccountNumber[1] && login[0] != AccountNumber[2] ){
    
    System.out.println("\nAccount number doesn't match any existing accounts.");
    back.AccInput();
    
    }    


    
    

    }catch(InputMismatchException e){
    String wronginput = input.next();
    System.out.println("INPUT MUST BE NUMBERS ONLY! ");
    
    back.AccInput();
    }
    
    
    
    System.out.print("Enter your pin: ");
    
    try{
        
    login[1] = input.nextInt();
    
if(login[1] != PinNumber[0] && login[0] != PinNumber[1] && login[0] != PinNumber[2] ){
    System.out.println("Incorrect PIN");
    back.AccInput();
    }else{
    screenobj.DisplayMenu();
    }

    }catch(InputMismatchException e){
    System.out.println("\nINPUT MUST BE NUMBERS ONLY! ");
    String wronginput = input.next();
    back.AccInput();
    }
     break;   
    }    
         }
}
 
static class Screen extends Account{
    
        AtmCaseStudy call = new AtmCaseStudy();
        Account callAcc = new Account();
        CashDispenser withdraw = new CashDispenser();
        DepositSlot deposit = new DepositSlot();
        
    void DisplayMenu(){
        
        while(true){
    System.out.print("""
                     
                     Main Menu:
                     \t\t\t1 - View my balance
                     \t\t\t2 - Withdraw cash
                     \t\t\t3 - Deposit cash
                     \t\t\t4 - Exit
                     
                     \tEnter a choice: """);
    
//inputs number of choice
//with exception to letters and special characters
try{    
        int inputMenu = input.nextInt();


    switch (inputMenu){
        case 1:
            
  if(login[0] == AccountNumber[0]){
      
  callAcc.BalanceInquiry();
  System.out.print("Available balance: " + Balance[0] +
                   "\nTotal balance: " + TotalBalance[0]);
  }else if(login[0] == AccountNumber[1]){
      
  callAcc.BalanceInquiry();
  System.out.print("Available balance: " + Balance[1] +
                   "\nTotal balance: " + TotalBalance[1]);
  
  }else if(login[0] == AccountNumber[2]){
            
  callAcc.BalanceInquiry();
  System.out.print("Available balance: " + Balance[2] +
                   "\nTotal balance: " + TotalBalance[2]);
  }
 
            break;
            
        case 2:
 if(login[0] == AccountNumber[0]){
    withdraw.Withdrawal();
    
  }else if(login[0] == AccountNumber[1]){
    withdraw.Withdrawal();
    
  }else if(login[0] == AccountNumber[2]){
    withdraw.Withdrawal();
  }           
            break;
            
        case 3:
 if(login[0] == AccountNumber[0]){
    deposit.Deposit();
    
  }else if(login[0] == AccountNumber[1]){
    deposit.Deposit();
    
  }else if(login[0] == AccountNumber[2]){
    deposit.Deposit();
  }             
            break;
            
        case 4:
            System.exit(0);
            break;
        default:
            System.out.println("INVALID INPUT! ");
            break;           
    }
    }catch (InputMismatchException e){
        String wronginput = input.next();
        System.out.print("\nINPUT MUST BE NUMBERS ONLY! ");
            }            
    }
    }  
}
static class Account extends BankDatabase{
    

void BalanceInquiry(){
  
String bal = "Balance Information: ";  
}
}



static class CashDispenser extends BankDatabase{

   
public void Withdrawal(){
BankDatabase takebank = new BankDatabase();    
Screen back = new Screen();    
CashDispenser disobj = new CashDispenser();    
    double amount[] = {20, 40, 60, 100, 200 };
    
    while(true){
        
    System.out.print("""
                     
                     Enter withdraw amount:
                     \t\t\t1 - $20
                     \t\t\t2 - $40
                     \t\t\t3 - $60
                     \t\t\t4 - $100
                     \t\t\t5 - $200
                     \t\t\t0 - CANCEL
                     
                     \tEnter a choice: """);
try{    
    int take = input.nextInt();
    
    switch(take){
    
        case 1:
            if(login[0] == AccountNumber[0]){  
            System.out.print(
                    
            """
            $20 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[0] -= amount[0]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[0] -= amount[0]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[1]){  
            System.out.print(
                    
            """
            $20 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[1] -= amount[0]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[1] -= amount[0]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[2]){  
            System.out.print(
                    
            """
            $20 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[2] -= amount[0]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[2] -= amount[0]) );
            back.DisplayMenu();
            
            }
            break;
            
        case 2:
            if(login[0] == AccountNumber[0]){
                
                
            System.out.print(
                    
            """
            $40 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[0] -= amount[1]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[0] -= amount[1]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[1]){
                
                
            System.out.print(
                    
            """
            $40 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[1] -= amount[1]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[1] -= amount[1]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[2]){
                
                
            System.out.print(
                    
            """
            $40 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[2] -= amount[1]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[2] -= amount[1]) );
            back.DisplayMenu();
            }
            break;
            
        case 3:
            if(login[0] == AccountNumber[0]){
                
                
            System.out.print(
                    
            """
            $60 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[0] -= amount[2]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[0] -= amount[2]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[1]){
                
                
            System.out.print(
                    
            """
            $60 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[1] -= amount[2]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[1] -= amount[2]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[2]){
                
                
            System.out.print(
                    
            """
            $60 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[2] -= amount[2]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[2] -= amount[2]) );
            back.DisplayMenu();
            }
            break;
            
        case 4:
            if(login[0] == AccountNumber[0]){
                
                
            System.out.print(
                    
            """
            $100 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[0] -= amount[3]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[0] -= amount[3]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[1]){
                
                
            System.out.print(
                    
            """
            $100 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[1] -= amount[3]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[1] -= amount[3]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[2]){
                
                
            System.out.print(
                    
            """
            $100 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[2] -= amount[3]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[2] -= amount[3]) );
            back.DisplayMenu();
            }
            break;  
            
        case 5:
            if(login[0] == AccountNumber[0]){
                
                
            System.out.print(
                    
            """
            $200 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[0] -= amount[4]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[0] -= amount[4]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[1]){
                
                
            System.out.print(
                    
            """
            $200 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[1] -= amount[4]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[1] -= amount[4]) );
            back.DisplayMenu();
            
            }else if(login[0] == AccountNumber[2]){
                
                
            System.out.print(
                    
            """
            $200 has been deducted to your balance.
            Your current balance:
            """
            + (Balance[2] -= amount[4]) +
            """
            \nYour current total balance:
            """
            + (TotalBalance[2] -= amount[4]) );
            back.DisplayMenu();
            }
            break;
            
        case 0:
            
            back.DisplayMenu();
            break; 
            
        default:
            
            System.out.println("INVALID INPUT! ");
            
            break;
            
            
    
    }
        }catch(InputMismatchException e){
        String wronginput = input.next();
        System.out.print("INPUT MUST BE NUMBERS ONLY! ");
        disobj.Withdrawal();
        break;
        }    
    }    
}
}
static class DepositSlot extends BankDatabase{


void Deposit(){
    
BankDatabase takebank = new BankDatabase();    
Screen back = new Screen();
DepositSlot depobj = new DepositSlot();    

    
    
    
    
    while(true){

    
    try{  
            System.out.print("\nPlease enter a deposit amount in CENTS(or 0 to cancel): ");
    double cent = input.nextDouble();
    double deposit = cent/100;
    
    if(login[0] == AccountNumber[0]){
        
        if(cent > 0){
        System.out.print("\nPlease insert a deposit envelope containing " + "$" + deposit);
        System.out.print("\nYour envelope has been received.\n");
        System.out.print("\nNOTE: The money just deposited will not be available until we verify the amount of any"
                + "\nenclosed cash and your checks clear. \n");
        TotalBalance[0] += deposit;
        back.DisplayMenu();
        }else if(cent == 0){
        back.DisplayMenu();
        }
        
    }else if(login[0] == AccountNumber[1]){
        
        if(cent > 0){
        System.out.print("\nPlease insert a deposit envelope containing " + "$" + deposit);
        System.out.print("\nYour envelope has been received.\n");
        System.out.print("\nNOTE: The money just deposited will not be available until we verify the amount of any"
                + "\nenclosed cash and your checks clear. \n");
        TotalBalance[1] += deposit;
        back.DisplayMenu();
        }else if(cent == 0){
        back.DisplayMenu();
        }
        
    }else if(login[0] == AccountNumber[2]){
        
        if(cent > 0){
        System.out.print("\nPlease insert a deposit envelope containing " + "$" + deposit);
        System.out.print("\nYour envelope has been received.\n");
        System.out.print("\nNOTE: The money just deposited will not be available until we verify the amount of any"
                + "\nenclosed cash and your checks clear. \n");
        TotalBalance[2] += deposit;
        back.DisplayMenu();
        }else if(cent == 0){
        back.DisplayMenu();
        }
    }else{
    System.out.print("Invalid Input");
    }
    }catch(InputMismatchException e){
    String wronginput = input.next();
    System.out.print("INPUT MUST BE NUMBERS ONLY! ");
    depobj.Deposit();
    break;
    }
    
    
               
            
}
}
}


public static  class BankDatabase{
 
 static double TotalBalance[] = {1000.00, 2500.00, 10000.00};
 static double Balance[] = {1000.00, 2500.00, 10000.00};
 static int AccountNumber[] = {12345, 44444, 98765};
 static int PinNumber[] = {54321, 11111, 56789};



public void Transaction(){
        Keypad Keypadobj = new Keypad();
        BankDatabase callbank = new BankDatabase();
        Screen screenobj = new Screen();
        





if (login[0] == AccountNumber[0] && login[1] == PinNumber[0]){
screenobj.DisplayMenu();

}else if(login[0] == AccountNumber[1] && login[1] == PinNumber[1]){
screenobj.DisplayMenu();

}else if(login[0] == AccountNumber[2] && login[1] == PinNumber[2]){
screenobj.DisplayMenu();
}
}
}
}


