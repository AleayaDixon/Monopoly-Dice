/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monoplydice;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aleaya
 */
public class MonoplyDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random x = new Random();
        Scanner keyboard = new Scanner (System.in);
        int die1 = 2 + x.nextInt(5);
        int die2 = 2 + x.nextInt(5);
        int move;
        System.out.println("To roll the dice, enter \"roll\". To stop playing, enter \"end\"");
        String user = keyboard.next();
    
       while(!user.equals("end"))
               {
                    if( die1 == die2 && user.equals("roll"))
                    {
                        move = die1 + die2;
                        System.out.println("User rolls " + die1 + "& " + die2 + "\nDOUBLES! \nMove " + move + " spaces and roll again getting...");
                        die1 = 2 + x.nextInt(5);
                        die2 = 2 + x.nextInt(5);
                        user = keyboard.next();
                        if( die1 == die2 && user.equals("roll"))
                            {
                                move = die1 + die2;
                                System.out.println("User rolls " + die1 + "& " + die2 + "\nDOUBLES! \nMove " + move + " spaces and roll again getting...");
                                die1 = 2 + x.nextInt(5);
                                die2 = 2 + x.nextInt(5);
                                user = keyboard.next();
                                if( die1 == die2 && user.equals("roll"))
                                    {
                                        move = die1 + die2;
                                        System.out.println("User rolls " + die1 + "& " + die2 + "\nDOUBLES! \n GO TO JAIL --->");
                                        die1 = 2 + x.nextInt(5);
                                        die2 = 2 + x.nextInt(5);
                                        user = keyboard.next();
                                    }
                                else 
                                    {
                                        move = die1 + die2;
                                        System.out.println("User rolls " + die1 + "& " + die2 + "\nMove " + move + " spaces and stop");
                                        die1 = 2 + x.nextInt(5);
                                        die2 = 2 + x.nextInt(5);
                                        user = keyboard.next();
                                    }
                            }
                        else 
                            {
                                move = die1 + die2;
                                System.out.println("User rolls " + die1 + "& " + die2 + "\nMove " + move + " spaces and stop");
                                die1 = 2 + x.nextInt(5);
                                die2 = 2 + x.nextInt(5);
                                user = keyboard.next();
                            }
                    }
                    else 
                    {
                        move = die1 + die2;
                        System.out.println("User rolls " + die1 + "& " + die2 + "\nMove " + move + " spaces and stop");
                        die1 = 2 + x.nextInt(5);
                        die2 = 2 + x.nextInt(5);
                        user = keyboard.next();
                    }
               }
       keyboard.close();
        
    }
    
}
