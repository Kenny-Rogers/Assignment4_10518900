/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class SummingSeveralNumbersFromanyFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inp="";
        int total=0;
        
        ArrayList<Integer> nums=new ArrayList<>();
        
        System.out.print("Which file would you like to read the numbers from: ");
        inp=input.nextLine();
        System.out.println("Reading numbers from file \""+inp+"\"\n");
        
        try {
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/"+inp);
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextInt()){
                nums.add(scanner.nextInt());
            }
            
            for(int i=0; i<nums.size(); i++){
                System.out.print(nums.get(i)+" ");
                total+=nums.get(i);
            }
            System.out.println("\nThe total is "+total);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
