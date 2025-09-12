/* Problem 9: Pass or Fail in Exam
A student scores marks out of 100.
Input: Integer marks 
Output:
   - "Pass" if marks >= 50
   - "Fail" if marks < 50 */
public class Prob9_ExamResult {
    public static void main(String[] args) {
        int marks = 94; 
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
