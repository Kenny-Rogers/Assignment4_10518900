/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenny
 */
public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) {
        try {
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/3num1.txt");
            int[] num=new int[4];
            num[3]=0;
            int i=0;
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextInt()){
                num[i++]=scanner.nextInt();
                
            }
            num[3]=num[0]+num[1]+num[2];
            System.out.println(num[0]+" + "+num[1]+" + "+num[2]+" = "+num[3]);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        
        
    }
    
}
