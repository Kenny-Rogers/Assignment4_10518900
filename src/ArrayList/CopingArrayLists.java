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
public class CopingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1=new ArrayList<>();
        ArrayList<Integer> arrList2=new ArrayList<>();
        Random r=new Random();
        
        for(int i=0; i<10; i++)
            arrList1.add((1+r.nextInt(99)));
        
        System.out.println("ArrayList 1:"+ arrList1);
        
        for(int i=0; i<10; i++)
            arrList2.add(arrList1.get(i));
        
        System.out.println("Arraylist 2:"+ arrList2);
    }
    
}
