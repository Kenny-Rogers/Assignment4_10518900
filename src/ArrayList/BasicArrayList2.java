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
public class BasicArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        Random r=new Random();
        int num=0;
        
        for(int i=0; i<10; i++){
            num=1+r.nextInt(99);
            nums.add(num);
        }
        
        System.out.println("ArrayList: "+ nums);
    }
    
}
