/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumber;
import java.util.*;
/**
 *
 * @author tapsdekilla7
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int start = 1;
        int count = 0;
        int end;
        
        System.out.println("Prime number validation");
        System.out.print("Enter your number: ");
        end = Input.nextInt();
        
        while (start <= end){
        if ((end % start) == 0){
            count++;
        }
        start++;   
        }
        
     if (count > 2){
      System.out.println("Not a Prime number: " + count + " factors");   
     }   
     else if (count == 2){
     System.out.println("Prime number: " + count + " factors");      
     }
     else {
         System.out.println("Not a Prime number: " + count + " factors");
     }
    }
}
