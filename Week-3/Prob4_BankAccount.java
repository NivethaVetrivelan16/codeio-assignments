/* Problem 4: 
Create a BankAccount class with account number and balance. 
Include deposit and withdraw methods with balance checks */
 
class BankAccount {
    int accountNumber;
    double balance;
    // Default constructor
    BankAccount() {
        balance = 0.0;
    }
    // Parameterized constructor
    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
public class Prob4_BankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 1000.0);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
    }
}
