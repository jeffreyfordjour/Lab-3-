
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClassP3 {
    public static void main(String[] args) {
         int even = 0;
         int odd = 0;
         
         for(int i = 0; i < 100; i++) {
             Random random = new Random();

            int randomNumber = random.nextInt();
            
            if(isEven(randomNumber)) {
                even++;
            }else {
                odd++;
            }
         }
         System.out.println("Even: " + even);
         System.out.println("Odd: " + odd);
    }
    
    public static boolean isEven(int number) {
        if(number % 2 == 0 ) {
            return true;
        }
        return false;
    }
}
