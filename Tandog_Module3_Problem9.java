import java.util.Scanner;

public class Tandog_Module3_Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;
        int leftShiftResult = a << 1;
        int rightShiftResult = a >> 1;

        System.out.println("AND=" + andResult + "; OR=" + orResult + 
                           "; XOR=" + xorResult + "; NOT a=" + notResult + 
                           "; a<<1=" + leftShiftResult + "; a>>1=" + rightShiftResult);

        scanner.close();
    }
}