/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author kenny
 */
public class BasicArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0; i<10; i++)
            nums.add(-113);
        
        for(int i=0; i<10; i++)
            System.out.println("Slot "+i+" contains a "+nums.get(i));
    }
    
}
