/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kenny
 */
public class LocatingTheLargestValueInAnArrayList {
  public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> arr=new ArrayList<>();
        int larg=0;
        int idx=0;
        
        for (int i = 0; i < 10; i++) 
            arr.add(1+r.nextInt(99));
        
        System.out.println("ArrayList: "+arr);
        
        larg=arr.get(0);
        for(int i=0; i<10; i++){
            if(larg<arr.get(i)){
                larg=arr.get(i);
                idx=i;
            }
        }
        
        System.out.println("\nThe largest value is "+larg
                            +", which is in slot "+ idx+".");
    }  
}
