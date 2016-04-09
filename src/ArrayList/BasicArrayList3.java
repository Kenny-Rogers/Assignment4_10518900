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
public class BasicArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        Random r=new Random();
        int num=0;
        
        for(int i=0; i<1000; i++){
            num=10+r.nextInt(90);
            nums.add(num);
        }
        
      
        
        System.out.print("[");
        for(int i=0; i<1000; ){
            for(int j=0; j<20; j++){
                System.out.print(nums.get(i)+", ");
                i++;
            }
            System.out.println("");
        }
        System.out.print("]");
    }
}
