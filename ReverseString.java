/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author Administrator
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str="Welcome";
     StringBuilder sb=new StringBuilder(str);
     str=sb.reverse().toString();
     System.out.println(str);
     
    }
    
}
