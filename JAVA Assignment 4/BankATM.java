import java.util.Scanner;

class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

public class BankATM 
{   
    private double balance;

    public BankATM() 
    {
        this.balance = 0.0;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } 
        else 
        {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankATM atm = new BankATM();
        boolean running = true;

        while (running) 
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = s.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = s.nextDouble();
                    try 
                    {
                        atm.withdraw(withdrawAmount);
                    } 
                    catch (InsufficientBalanceException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + atm.getBalance());
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