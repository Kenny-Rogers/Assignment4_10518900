/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class ArrayListThereOrNot {
    public static void main(String[] args) {
         ArrayList<Integer> arrList1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int value;
        Random r=new Random();
        int count=0;
        
        for(int i=0; i<10; i++)
            arrList1.add((1+r.nextInt(49)));
        
        System.out.println("ArrayList:"+ arrList1);
        System.out.print("Value to find: ");
        value=sc.nextInt();
        
        for(int i=0; i<10; i++){
            if(arrList1.get(i)==value){
                System.out.println(value+" is in the ArrayList"); 
                count++;
            }
            
        }
            if(count==0)
                System.out.println(value+" is not the ArrayList");
    }
    
    }
