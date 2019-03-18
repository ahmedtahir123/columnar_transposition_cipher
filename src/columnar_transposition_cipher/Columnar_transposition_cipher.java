/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columnar_transposition_cipher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Columnar_transposition_cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, IOException, FileNotFoundException  {
        
        ArrayList<String> A1 = new ArrayList<String>();
        ArrayList<String> A2 = new ArrayList<String>();
        
        
   FileReader fr;
        String s = "C:\\Users\\dell\\Documents\\NetBeansProjects\\columnar_transposition_cipher\\src\\columnar_transposition_cipher\\Plaintext.txt";
        BufferedReader br = new BufferedReader(new FileReader(s));
     //   String h = br.readLine();
     String h=br.readLine();
        String w[] = h.split("");

        System.out.println("Input Key");
        Scanner input = new Scanner(System.in);
        h = input.nextLine();
        String[] w1 = h.split("");
        System.out.println("select a option you want \n1-incrip \n2-decrip");
        h = input.nextLine();
       
        
        
        for (int i = 0; i < w.length; i++) {
            
            if (w[i].charAt(0) == (char)127) {
            } else {
                A1.add((Character.toString(w[i].charAt(0))));
            }
        }
        for (int i = 0; i < w1.length; i++) {
            if (w1[i].charAt(0) == (char)127) {
            } else {
                A2.add((Character.toString(w1[i].charAt(0))));
            }
        }

          

        INC_OR_DEC A = new INC_OR_DEC();
        switch (h) {
            case "1":
                System.out.println(A.Incrip(A1, A2));
                break;
            case "2":
                System.out.println(A.Decrip(A1, A2));
                break;
            default:
                System.out.println("wrong choise");
                break;
        }

    }


    }
    

