import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM () {
        this.balance = 1000;
    }

    public void deposit(double amount) {
     if (amount > 0) {
  balance += amount;
       System.out.println("Deposited: " + amount);
    } else {
            System.out.println("Invalid ");
        }
    }

    public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
     balance -= amount;
     System.out.println("Withdrawn: " + amount);
        } 
       else {
         System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        
        ATM ATM= new ATM ();
        Scanner scanner = new Scanner(System.in);
        while (true) {
           System.out.println("Welcome Harshit Raj");
            System.out.println("Choose an option: 1) Check Balance 2) Deposit 3) Withdraw 4) Exit");
            int choice = scanner.nextInt();
            switch (choice) {
  case 1:
                    ATM.checkBalance();
                    break;
  case 2:
                 System.out.print("Enter deposit amount: ");
                 double depositAmount = scanner.nextDouble();
                 ATM.deposit(depositAmount);
                    break;
  case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    ATM.withdraw(withdrawalAmount);
                    break;
  case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    return;
 default:
                    System.out.println(". Please try again.");
            }
        }
    }
}
