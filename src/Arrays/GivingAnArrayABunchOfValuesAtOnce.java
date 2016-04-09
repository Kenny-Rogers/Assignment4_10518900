/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author kenny
 */
public class GivingAnArrayABunchOfValuesAtOnce {
    public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "boi", "tom" };
                int[] arr2={4,5,68,7,8,9};

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
                
                System.out.print("The second array is filled with the following values:\n\t");
		for ( int i=0; i<arr2.length; i++ )
			System.out.print( arr2[i] + " " );
		System.out.println();

	}
}
