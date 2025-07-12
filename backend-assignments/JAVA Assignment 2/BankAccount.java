public class BankAccount 
{
    String Account_number;
    String Account_name;
    float balance;

    public BankAccount(String Account_number, String Account_name, float balance)
    {
        this.Account_number = Account_number;
        this.Account_name = Account_name;
        this.balance = balance;
    }

    public void deposit(float amount)
    {
        balance += amount;
        System.out.println("The Deposited amount is: " + amount + " and the new balance is: " + balance);
    }

    public void withdraw(float amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("The Withdrawn amount is: " + amount + " and the new balance is: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance()
    {
        System.out.println("The current balance is: " + balance);
    }
    public static void main(String[] args) 
    {
        BankAccount account1 = new BankAccount("1534898775", "John Doe", 1000);
        BankAccount account2 = new BankAccount("1746813238", "Jane Rose", 15200);
        BankAccount account3 = new BankAccount("5487413858", "Johnny Doe", 100);
        
        System.out.println("The Account Number is: " + account1.Account_number + " and the Account Holder Name is: " + account1.Account_name + " and the current Balance is: " + account1.balance);
        account1.deposit(500);
        System.out.println("The Account Number is: " + account2.Account_number + " and the Account Holder Name is: " + account2.Account_name + " and the current Balance is: " + account2.balance);
        account2.withdraw(200);
        System.out.println("The Account Number is: " + account3.Account_number + " and the Account Holder Name is: " + account3.Account_name + " and the current Balance is: " + account3.balance);
    }
}