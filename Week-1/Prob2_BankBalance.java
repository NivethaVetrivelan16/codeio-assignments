/* Problem 2: Bank Balance Status
 Display the status of a customer’s account balance.
 Input: An int balance 
 Output:
   - "Positive Balance" if balance > 0
   - "Zero Balance" if balance == 0
   - "Overdraft" if balance < 0 */
public class Prob2_BankBalance {
    public static void main(String[] args) {
        // Test Case 1
        int balance = 250; 
        if (balance > 0) {
            System.out.println("Positive Balance");
        } else if (balance == 0) {
            System.out.println("Zero Balance");
        } else {
            System.out.println("Overdraft");
        }
        // Test Case 2
        balance = 0;
        if (balance > 0) {
            System.out.println("Positive Balance");
        } else if (balance == 0) {
            System.out.println("Zero Balance");
        } else {
            System.out.println("Overdraft");
        }
        // Test Case 3
        balance = -120;
        if (balance > 0) {
            System.out.println("Positive Balance");
        } else if (balance == 0) {
            System.out.println("Zero Balance");
        } else {
            System.out.println("Overdraft");
        }
    }
}
