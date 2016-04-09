/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class ParrallelArrays {
    public static void main(String[] args) {
        String[] lName={"Adjei","Osei","Owusu","Annor", "Gyimah"};
        double[] gradeAverage={44.0,62.5,33.7,83.9,94.0};
        int[] id={10517800,10597865,10569779,10493037,10567849};
        Scanner sc=new Scanner(System.in);
        int findId=0;
        int idx=0;
        
        System.out.println("Values:");
        for(int i=0; i<lName.length; i++){
            System.out.println("\t"+lName[i]+"\t"+gradeAverage[i]+"\t"+id[i]);
        }
        
        System.out.print("Id number to find: ");
        findId=sc.nextInt();
        
        for(int i=0;i<id.length; i++){
            if(id[i]==findId)
                idx=i;
        }
        
        System.out.println("\n\tName: "+lName[idx]+
                            "\n\tAverage: "+gradeAverage[idx]+
                             "\n\tID: "+id[idx]);
    }
   
}
