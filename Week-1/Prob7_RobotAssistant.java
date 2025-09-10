/* Problem 7: Robot Assistant 
 A robot performs basic arithmetic operations on two numbers.
 Input:
   - Two integers a and b 
   - An integer op representing the operation
       1 → Addition
       2 → Subtraction
       3 → Multiplication
       4 → Division
 Output: Print the result of the chosen operation */
public class Prob7_RobotAssistant {
    public static void main(String[] args) {
        // Test Case 1
        int a = 10, b = 5, op = 1; 
        if (op == 1) {
            System.out.println(a + b);
        } else if (op == 2) {
            System.out.println(a - b);
        } else if (op == 3) {
            System.out.println(a * b);
        } else if (op == 4) {
            if (b != 0) {
                System.out.println(a / b); 
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid Operation");
        }
        // Test Case 2
        a = 20; b = 4; op = 4; 
        if (op == 1) {
            System.out.println(a + b);
        } else if (op == 2) {
            System.out.println(a - b);
        } else if (op == 3) {
            System.out.println(a * b);
        } else if (op == 4) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid Operation");
        }
        // Test Case 3
        a = 6; b = 7; op = 3; 
        if (op == 1) {
            System.out.println(a + b);
        } else if (op == 2) {
            System.out.println(a - b);
        } else if (op == 3) {
            System.out.println(a * b);
        } else if (op == 4) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
