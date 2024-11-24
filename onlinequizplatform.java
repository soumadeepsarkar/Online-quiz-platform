import java.util.Scanner;

public class onlinequizplatform{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; 
        boolean exit = false;

        while (!exit) {
            System.out.println("a: View Balance");
            System.out.println("b: Deposit Money");
            System.out.println("c: Withdraw Money");
            System.out.println("d: Exit");
            System.out.println("Please select an option[a-d]:");

            
            String option = scanner.nextLine();

            switch (option) {
                case "a":
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;

                case "b":
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("$%.2f deposited successfully.%n", depositAmount);
                    } else {
                        System.out.println("Invalid amount. Please  enter a positive number.");
                    }
                    break;

                case "c":
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("$%.2f withdrawn successfully.%n", withdrawAmount);
                    } else if(withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    break;

                case "d":
                    System.out.println("You are exited.");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option(please choose a option between:[a-d])");
            }
        }
        
        scanner.close();
    }
}
               

   