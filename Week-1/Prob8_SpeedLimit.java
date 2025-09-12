/* Problem 8: Speed Limit Check
 The city has a speed limit of 60 km/h.
 Input: Car's speed 
 Output:
   - "Overspeeding! Pay Fine" if speed > 60
   - "You are within the speed limit" otherwise */
public class Prob8_SpeedLimit {
    public static void main(String[] args) {
        int speed = 75; 
        if (speed > 60) {
            System.out.println("Overspeeding! Pay Fine");
        } else {
            System.out.println("You are within the speed limit");
        }
    }
}
