/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_10518900;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kenny
 */
public class SimpleFileInput {
    public static void main(String[] args) {
        String line="";
        try{
        
            
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                                 + "/src/assignment4_10518900/files/name.txt");

            FileReader fr=new FileReader(file.getAbsolutePath());
            BufferedReader br=new BufferedReader(fr);

            System.out.print("Using my psychic powers (aided by reading data "
                    + "from the file), I have \ndetermined that your name is ");
            
            while((line=br.readLine())!=null){
               System.out.println(line.trim());
            }
            
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
