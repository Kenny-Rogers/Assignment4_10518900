/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class HowManyTimes {
     public static void main(String[] args) {
        Random r=new Random();
        int[] num=new int[10];
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int count=0;
        
        for(int i=0; i<num.length; i++){
            num[i]=1+r.nextInt(49);
        }
        
        System.out.print("Array: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.print("\nValue to find: ");
        ans=sc.nextInt();
        
        for(int i=0; i<num.length; i++){
            if(num[i]==ans){
                count++;
            }
        }
        System.out.println("\n"+ans+" was found "+count+" times.");
    }
    
}
