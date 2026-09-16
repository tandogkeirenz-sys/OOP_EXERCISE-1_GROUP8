/**
 *
 * @author Keirenz C. Tandog
 */
import java.util.Scanner;

public class Tandog_Module3_Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}
