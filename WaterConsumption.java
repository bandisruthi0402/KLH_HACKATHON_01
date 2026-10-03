
import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waterconsumption = sc.nextInt();

        if (waterconsumption <= 500) {
            System.out.println("bill is Rs.100");
        } else {
            System.out.println("bill is Rs.200");
        }
    }
}