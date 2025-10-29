import java.util.Scanner;
public class banking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // java banking program 
        
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
System.out.println("******************************");
        System.out.println("Welcome to the Banking System!");
        System.out.println("******************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.println("******************************");
        System.out.print("Please enter your choice (1-4): ");
        choice = scanner.nextInt();

        switch(choice){
            case 1-> System.out.println("Your balance is: $" + balance);
            case 2-> 
                System.out.println("Enter amount to deposit: ");
                
             case 3-> 
                System.out.println("Enter amount to withdraw: ");
                case 4-> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");   
        }
    }
        scanner.close();
        



    
        // display menu
        // get and process users chpice 
        // showbalance
        // deposit
        // withdraw
        // exit message
        
    }
    static void showbalance(double balance){

    }

    static double deposit(double balance){
        double amount;
        System.out.println("Successfully deposited $" );

        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Invalid amount. Please try again.");
            return 0;
        } else {
            balance += amount;
        }
        return balance;
    }
    
}

// watch again

