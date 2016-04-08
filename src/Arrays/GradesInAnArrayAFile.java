/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenny
 */
public class GradesInAnArrayAFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="";
        int[] grade=new int[5];
        String inp="";
        
        System.out.print("Name (first last): ");
        name=scanner.nextLine();
        
        System.out.print("Filename: ");
        inp=scanner.nextLine();
        
        System.out.println("\nHere are your randomly-selected grades "
                + "(hope you pass):");
        
        for(int i=0; i<grade.length; i++){
            System.out.print("Grade "+(i+1)+": ");
            grade[i]=scanner.nextInt();
        }
        
        File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/files/"+inp);
        
        try{
            BufferedWriter br=new BufferedWriter(new FileWriter(file));
            br.write(name);
            br.write("\n");
            for(int z=0; z<grade.length; z++){
                br.write("Grade "+(z+1)+": "+grade[z]+"\n");  
            }
            br.close();
            
            System.out.println("\nData saved in \""+inp+"\".");
        } catch (IOException ex) {
          ex.printStackTrace();
        }
    }
    
}
