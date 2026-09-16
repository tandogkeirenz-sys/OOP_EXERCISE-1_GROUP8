/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tandog_Module2_Problem4;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Tandog_Module3_Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect two integers from the user
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        // Perform bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;
        int leftShiftResult = a << 1;
        int rightShiftResult = a >> 1;

        // Display the results
        System.out.println("AND=" + andResult + "; OR=" + orResult + 
                           "; XOR=" + xorResult + "; NOT a=" + notResult + 
                           "; a<<1=" + leftShiftResult + "; a>>1=" + rightShiftResult);

        scanner.close();
    }
}