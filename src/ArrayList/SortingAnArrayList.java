/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import static Sorting.BubbleSort.swap;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kenny
 */
public class SortingAnArrayList {
     public static void sort(ArrayList<Integer> a )
	{
		// Your code goes here
            for (int i=0;i<a.size() ;i++ )
		{
			for (int j=i+1;j<a.size() ;j++ )
			{
				if ( a.get(j)>a.get(i)){
                                        int temp=a.get(j);
                                        a.add(j, a.get(i));
                                        a.add(i, temp);
				
			}
		}
            }
        }
     
     public static void main(String[] args) {
         ArrayList<Integer> arrList1=new ArrayList<>();
         Random r=new Random();
         
          for(int i=0; i<20; i++)
            arrList1.add((1+r.nextInt(49)));
          
          System.out.println("Arraylist before: "+arrList1);
          sort(arrList1);
          System.out.println("ArrayList after: "+arrList1);
    }
    
}
