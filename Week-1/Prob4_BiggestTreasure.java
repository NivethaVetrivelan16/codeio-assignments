/* Problem 4: Biggest Treasure
 Three pirates find treasure chests. Print the largest number of coins.
 Input: Three integers a, b, c 
 Output: Largest value among the three numbers */
public class Prob4_BiggestTreasure {
    public static void main(String[] args) {
        // Test Case 1
        int a = 10, b = 25, c = 7; 
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // Test Case 2
        a = 5; b = 5; c = 9;
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // Test Case 3
        a = 100; b = 50; c = 75;
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
