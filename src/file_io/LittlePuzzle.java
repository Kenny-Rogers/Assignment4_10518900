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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenny
 */
public class LittlePuzzle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String inp="";
        ArrayList<Character> lines=new ArrayList<>();
        int i=1;
        
        System.out.print("Open which file: ");
        inp=input.nextLine();
        
        try {
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/"+inp);
            BufferedReader br=new BufferedReader(new FileReader(file));
            int c;
            
            while((c=br.read())!=-1){
              
               if(i==3){
                  char a=(char) c;
                   System.out.println(a +" "+ c);
                    lines.add(a);
                    i=0;
               }
               i++;  
            }
            
            for(int j=0; j<lines.size(); j++){
                System.out.print(lines.get(i));
            }
            
         
             System.out.println("\n");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
