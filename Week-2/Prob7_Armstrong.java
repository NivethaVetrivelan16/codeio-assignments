/* Problem 7: 
Check Armstrong Number */
public class Prob7_Armstrong {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit; 
            temp =  temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is NOT an Armstrong number");
        }
    }
}
