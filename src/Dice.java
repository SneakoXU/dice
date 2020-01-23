/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sneako
 */
import java.util.Scanner;
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Press 1 to roll, 0 to quit");
       Scanner in = new Scanner(System.in);
       int roll = in.nextInt();
       boolean done = false;
               
       while(!done){
           if (roll == 0){
               done = true;
               System.out.println("The End.");
           }
           if (roll == 1) {
        int number = (int) (Math.random() * 6)+1;
        System.out.println("This roll: " +number);
        System.out.println("Press 1 to roll again, 0 to quit");
        roll = in.nextInt();
        }
           if (roll!= 1 && roll != 0){
               System.out.println("Enter valid input, idiot.");
               System.out.println("Press 1 to roll, 0 to quit");
               roll=in.nextInt();
           }
       }
       }
}
