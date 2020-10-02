
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClassP2 {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your number:");
        int number = keyboard.nextInt();
        
        System.out.println(isPrime(number));
    }
    public static boolean isPrime(int number){
        for(int i=2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
