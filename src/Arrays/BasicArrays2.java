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
public class BasicArrays2 {
     public static void main(String[] args) {
        int [] nums=new int[10];
        Random r=new Random();
        
        for(int i=0; i<nums.length; i++){
            nums[i]=1+r.nextInt(100);
        }
        
        for(int j=0; j<nums.length; j++){
        System.out.println("Slot "+j+" contains a "+nums[j]);
        }
                
        
    }
}
