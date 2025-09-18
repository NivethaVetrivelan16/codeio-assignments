/* Problem 3:
Array Element Frequency (Count Occurrence) */
public class Prob3_ArrayFreq{
    public static void main(String[] args){
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        int visited[] = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++){
            if (visited[i] == 1){
                continue; 
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    visited[j] = 1; 
                }
            }
            if (count == 1) {
                System.out.println(arr[i] + " appears " + count + " time");
            } else {
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
    }
}