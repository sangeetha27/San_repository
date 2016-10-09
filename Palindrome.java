/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Administrator
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    String str="CIVIC";
              String temp;
              temp=str;
             StringBuilder sb=new StringBuilder(str);
     str=sb.reverse().toString();
     if(temp == null ? str == null : temp.equals(str)){
         System.out.println("Palindrome");
     }
         else   
     {
         System.out.println("Not Palindrome");
     }
        // TODO code application logic here
    }
    
}
