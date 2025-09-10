/* Problem 6: Report Card Generator
 A teacher wants to assign grades based on student marks.
 Input: An integer marks (0–100), assigned directly in the program
 Output:
   - "A" if marks >= 90
   - "B" if marks >= 75 and < 90
   - "C" if marks >= 50 and < 75
   - "Fail" if marks < 50 */
public class Prob6_ReportCard {
    public static void main(String[] args) {
        // Test Case 1
        int marks = 92; 
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
        // Test Case 2
        marks = 76;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
        // Test Case 3
        marks = 45;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
