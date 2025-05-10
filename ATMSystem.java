import java.util.Scanner;

public class ATMSystem {
    private double balance;

    public ATMSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
        checkBalance();
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f%n", amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
        checkBalance();
    }

    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem(1000.00);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    atm.deposit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    atm.withdraw(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}