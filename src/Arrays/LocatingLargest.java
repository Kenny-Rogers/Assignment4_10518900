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
public class LocatingLargest {
    public static void main(String[] args) {
        Random r=new Random();
        int[] num=new int[10];
        int ans=0;
        int idx=0;
      
        
        for(int i=0; i<num.length; i++){
            num[i]=1+r.nextInt(99);
        }
        
        System.out.print("Array: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        
        ans=num[1];
         for(int i=0; i<num.length; i++){
            if(num[i]>ans){
               ans=num[i];
               idx=i;
            }
        }
        System.out.println("\n"+ans+" is the largest value.");
        System.out.println("It is in slot "+idx+".");
    } 
}
