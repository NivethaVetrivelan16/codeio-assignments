/* Problem 8:
Check whether a number is a palindrome */
public class Prob8_Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10; 
            temp = temp / 10;
        }
        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
