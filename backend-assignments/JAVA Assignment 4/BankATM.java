import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankATM {   
    private double balance;

    public BankATM() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount is : " + amount);
        } 
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount is : " + amount);
        } 
        else {
            throw new InsufficientBalanceException("Insufficient balance to withdraw.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankATM bankATM = new BankATM();
        boolean running = true;

        while (running) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankATM.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        bankATM.withdraw(withdrawAmount);
                    } 
                    catch (InsufficientBalanceException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + bankATM.getBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the ATM...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}