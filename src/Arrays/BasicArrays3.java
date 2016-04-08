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
public class BasicArrays3 {
     public static void main(String[] args) {
        int [] nums=new int[1000];
        Random r=new Random();
        
        for(int i=0; i<nums.length; i++){
            nums[i]=10+r.nextInt(89);
        }
        
        
        for(int j=0; j<nums.length; ){
            for(int z=0; z<20; z++)
                System.out.print(nums[j++]+"  ");
            
            System.out.println("");
        }
                
        
    }
    
}

