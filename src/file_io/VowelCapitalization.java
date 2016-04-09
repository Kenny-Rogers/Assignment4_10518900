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

/**
 *
 * @author kenny
 */
public class VowelCapitalization {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        String inp="";
        
        System.out.print("Open which file: ");
        inp=input.nextLine();
        
        try {
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/"+inp);
            BufferedReader br=new BufferedReader(new FileReader(file));
            int c;
            
            while((c=br.read())!=-1){
                char a=(char) c;
                if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
                   System.out.print(Character.toUpperCase(a));
                 
                }else{
                System.out.print(a);
                }
            }
            
            
         
             System.out.println("\n");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
}
