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

public class Tandog_Module2_Problem4 {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter level: ");
        int level = scanner.nextInt();

        System.out.print("Enter experience points: ");
        long experiencePoints = scanner.nextLong();
        scanner.nextLine(); 
        System.out.print("Enter rank: ");
        String rank = scanner.nextLine();
        System.out.println("Username: " + username + "; Character: " + characterName +
                           "; Level: " + level + "; Experience: " + experiencePoints +
                           "; Rank: " + rank);

        scanner.close();
    }
}