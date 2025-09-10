/* Problem 1: The Light Bulb Test
The bulb switches ON if the number is even, otherwise OFF. */
public class Prob1_LightBulb {
    public static void main(String[] args) {
        // Test Case 1
        int n = 4; 
        if (n % 2 == 0) { 
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
        // Test Case 2
        n = 7;
        if (n % 2 == 0) {
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
        // Test Case 3
        n = 0;
        if (n % 2 == 0) {
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
    }
}