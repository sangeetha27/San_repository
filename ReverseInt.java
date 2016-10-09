/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseint;

/**
 *
 * @author Administrator
 */
public class ReverseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int number = 8082;
                int reversedNumber = 0;
                int temp = 0;
               
                while(number > 0){
                       
                        
                        temp = number%10;
                       
                        
                        reversedNumber = reversedNumber * 10 + temp;
                        number = number/10;
                }
                        System.out.println("Reversed Number is: " + reversedNumber);
    
    
}
}
