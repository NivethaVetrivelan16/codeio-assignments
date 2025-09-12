/* Problem 11: Grade Calculator
 Assign grade based on student marks.
 Input: Marks out of 100 
 Output: 
   - 90 or above - Grade A
   - 75 to 89    - Grade B
   - 50 to 74    - Grade C
   - Below 50    - Fail */
public class Prob11_Grade{
    public static void main(String[] args) {
        int marks = 82; 
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75){
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
