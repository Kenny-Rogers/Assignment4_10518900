/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class DisplayingAFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name="";
        System.out.print("Open with file: ");
        name=input.nextLine();
        try{
            File file=new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/"+name);
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
