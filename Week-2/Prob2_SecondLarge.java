/* Problem 2:
Find the second largest number in an array */
public class Prob2_SecondLarge{
    public static void main(String[] args){
        int arr[] = {14, 28, 19, 33, 45, 12};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
