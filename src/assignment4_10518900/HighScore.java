/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_10518900;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class HighScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="";
        int score=0;
        
        System.out.println("You got a high score!\n");
        
        System.out.print("Please enter your name: ");
        name=scanner.nextLine();
        
        System.out.print("Please enter your score: ");
        score=scanner.nextInt();
        
        try {
             File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                             + "/src/assignment4_10518900/files/score.txt");
        
        if(!file.exists())
            file.createNewFile();
        
        FileWriter fw=new FileWriter(file.getAbsolutePath());
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("NAME:\t"+name);
        bw.write("\tScore:\t"+score);
        bw.close();
            
            System.out.println("Data stored into score.txt");    
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
}
