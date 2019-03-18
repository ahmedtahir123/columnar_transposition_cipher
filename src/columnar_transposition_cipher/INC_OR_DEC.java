/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columnar_transposition_cipher;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

/**
 *
 * @author dell
 */
class INC_OR_DEC {

    
        String incripted = "";
    String Incrip(ArrayList<String> A1, ArrayList<String> A2) {
        int s=(A1.size()/A2.size()+2);
        int k=0;
     String arr[][] = new String[s][A2.size()];
        for (int i = 0; i < A2.size(); i++) {
                  arr[0][i]=Integer.toString(A2.get(i).hashCode()-97);

        }
        for (int i = 1; i < s; i++) {
            for (int j = 0; j < A2.size(); j++) {
                if(k>=A1.size()){
                       arr[i][j]="X";
    k++;
                }else{
                arr[i][j]=A1.get(k);
                k++;
            }
            }
        }
        
int c=0;  
        for (int i = 0; i < A2.size(); i++) {
        int min=A2.get(0).hashCode()-97; 
        for (int j = 0; j < A2.size(); j++) {
            if(min>=A2.get(j).hashCode()-97 && A2.get(j).hashCode()-97!=-49){
                    min=A2.get(j).hashCode()-97;
                c=j;
            }
        }
     
                           A2.set(c, "0");
                   print(c,arr,A2);

       }
        return "";
    }
    void print(int c, String[][] arr, ArrayList<String> A2){
        for (int i = 1; i < A2.size(); i++) {
            System.out.print(arr[i][c]);
        }
    }
    
    String Decrip(ArrayList<String> A1, ArrayList<String> A2) {
       
        
        
        return null;
    
    }
    
}
