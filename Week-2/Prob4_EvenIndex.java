/*  Problem 4:
Print Elements at Even Index Positions*/
public class Prob4_EvenIndex{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.print("Elements at even index positions: ");
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){  
                System.out.print(arr[i] + " ");
            }
        }
    }
}
