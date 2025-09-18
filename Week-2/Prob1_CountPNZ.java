/* Problem 1:
Count Positive, Negative, and Zero in Array */
public class Prob1_CountPNZ{
    public static void main(String[] args){
        int arr[] = {5, -3, 0, 12, -9, 0, 7};
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos++;
            }
            else if(arr[i] < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive:" +pos);
        System.out.println("Negative:" +neg);
        System.out.println("Zero:" +zero);
    }
}