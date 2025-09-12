/* Problem 10: Electricity Bill Discount
 Calculate discount based on electricity bill amount.
 Input: Bill amount 
 Output:
   - If bill > 1000 -  10% discount
   - If 500 <= bill <= 1000 - 5% discount
   - Otherwise - No discount
   Print the final amount to be paid. */
public class Prob10_ElectricityBill {
    public static void main(String[] args) {
        double bill = 1200; // assigned bill amount
        double finalAmount;
        if (bill > 1000) {
            finalAmount = bill - (bill * 10/100); // 10% discount
        } else if (bill >= 500) {
            finalAmount = bill - (bill * 5/100); // 5% discount
        } else {
            finalAmount = bill; // no discount
        }
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
