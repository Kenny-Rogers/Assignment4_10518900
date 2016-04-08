/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Random;

/**
 *
 * @author kenny
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] num1=new int[10];
        int[] num2=new int[10];
        Random r=new Random();
        
        for(int i=0; i<num1.length; i++){
            num1[i]=1+r.nextInt(100);
        }
        
         for(int i=0; i<num1.length; i++){
            num2[i]=num1[i];
        }
         
         System.out.print("Array 1:");
          for(int i=0; i<num1.length; i++){
              System.out.print(num1[i]+" ");
              
        }
          System.out.println("");
        
           System.out.print("Array 2:");
          for(int i=0; i<num1.length; i++){
              System.out.print(num2[i]+" ");
              
              
        }
         
          System.out.println("\n");
    }
    
}
