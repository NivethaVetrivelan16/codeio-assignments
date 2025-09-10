/* Problem 3: Faster Runner
 Compare the race times of Arjun and Varun and decide who is faster.
 Input: Two integers time1 and time2 
 Output:
   - "Arjun" if Arjun is faster 
   - "Varun" if Varun is faster 
   - "Tie" if both times are equal */
public class Prob3_FasterRunner {
    public static void main(String[] args) {
        // Test Case 1
        int time1 = 12; // Arjun's time
        int time2 = 10; // Varun's time
        if (time1 < time2) {
            System.out.println("Arjun");
        } else if (time2 < time1) {
            System.out.println("Varun");
        } else {
            System.out.println("Tie");
        }
        // Test Case 2
        time1 = 15;
        time2 = 20;
        if (time1 < time2) {
            System.out.println("Arjun");
        } else if (time2 < time1) {
            System.out.println("Varun");
        } else {
            System.out.println("Tie");
        }
        // Test Case 3
        time1 = 18;
        time2 = 18;
        if (time1 < time2) {
            System.out.println("Arjun");
        } else if (time2 < time1) {
            System.out.println("Varun");
        } else {
            System.out.println("Tie");
        }
    }
}
