
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
public class NewClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What are the number of rooms:");
        double rooms = keyboard.nextDouble();
     
        System.out.println("What is the price per gallon of paint:");
        double paint = keyboard.nextDouble();
        
        System.out.println("What is the square feet of wall space in each room:");
        double squareFeet = keyboard.nextDouble();
        
       double numberOfGallons = numberOfGallonsOfPaintRequired(squareFeet);
       
       double hourLabor = hoursOfLaborRequired(squareFeet);
       
       double cashPaint = costOfPaint(paint,numberOfGallons); 
        
       double labor = laborCharges(hourLabor);
       
       double totalJob = paintJob(labor,cashPaint);
     
       
       System.out.println("Number of gallons of paint required is " + numberOfGallons);
       System.out.println("Hours of labor of required is " + hourLabor);
       System.out.println("Cost of paint " + cashPaint);
       System.out.println("Cost of labor " + labor);
       System.out.println("Total cost of job " + totalJob);
    }
    
    public static double numberOfGallonsOfPaintRequired(double squareFeet){
    double result = squareFeet / 115;
    return result;
    }
     public static double hoursOfLaborRequired(double squareFeet){
    double result = (squareFeet / 115) * 8;
    return result;
     }
     public static double costOfPaint(double paint, double numberOfGallons){
     double result = paint * numberOfGallons;
     return result;
     }
     
    public static double laborCharges(double hours){
    double result = hours * 18;
    return result;
    }
    
    public static double paintJob(double labor, double paint){
    double result = paint + labor;
    return result;
    }
}
