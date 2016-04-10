/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Random;

/**
 *
 * @author kenny
 */
public class BubbleSort {
   public static void bubble_sort( int[] a )
	{
		// Your code goes here
            for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if ( a[j]<a[i])
				
					// swap the values in two slots
                                    swap(a,i,j);
				
			}
		}
            }
	


	public static void swap( int[] a , int i, int j )
	{
		// Your code goes here
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		bubble_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	} 
}
