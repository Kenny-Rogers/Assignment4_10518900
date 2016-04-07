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
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenny
 */
public class LetterRevisited {
    public static void main(String[] args) {
        String[] lines={
        "+-----------------------------------------------------------+\n",
        "|                                       University of Ghana,|\n",
        "|                                       P.O.Box 145,        |\n",
        "|                                       Accra.              |\n",
        "|                    Bill Gates                             |\n",
        "|                    1 Microsoft Way                        |\n",
        "|                    Redmond, WA 98104                      |\n",
        "|                                                           |\n",
       "+-----------------------------------------------------------+\n"};
        
        try
        {
            String content = "This is the content to writer into file";
            
            File file= new File("/home/kenny/NetBeansProjects/Assignment4_10518900"
                    + "/src/assignment4_10518900/files/letter.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw=new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0; i<lines.length;i++){
             bw.write(lines[i]);   
            }
            bw.close();
            
            System.out.println("");
            
            System.out.println("Done");
            
            
            }catch (IOException ex) {
               ex.printStackTrace();
            }
    }
}

