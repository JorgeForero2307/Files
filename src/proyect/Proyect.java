/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x441u
 */
public class Proyect {//all global variables are assigned
     String fichero = "C:/Users/jorge/Desktop/alg_examples/commands1.txt";
      String line;
        String[] datos = new String[6];
        String s="tmp"; 
         char c;
         char c2;
         char c3;
         char c4; 
         char c5; 
         char c6; 
         char c7;
         char c8;
         int a = 0;
    void read(){ // read the file and put it in an array
       
        try {
            
            FileInputStream fis = new FileInputStream(fichero);
      InputStreamReader isr = new InputStreamReader(fis,"utf8");
      BufferedReader br = new BufferedReader(isr);
        
            while((line=br.readLine())!=null){
                datos[a] = line;
                line.split(" ");
                a++;
                
            }
           
        } catch (IOException ex) {
        }
    }
    void caracter(){ // compare character by character the line that is in the file 
        
              for (int x=0;x<datos[0].length();x++)
         c=datos[0].charAt(8);
         c2 = datos[0].charAt(9);
          c3 = datos[0].charAt(10);
         c4 = datos[0].charAt(11);
         c5 = datos[0].charAt(12);
        c6 = datos[0].charAt(13);
         c7 = datos[0].charAt(14);
         c8 = datos[0].charAt(15);
    }
    void createoutput() throws IOException{ //an output file is created
                 try{    
             FileOutputStream fout=new FileOutputStream("C:/Users/jorge/Desktop/"+c+c2+c3+c4+c5+c6+c7+c8);      
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);   
             fout.close();    
               
            }catch(Exception e){
                System.out.println(e);}    
      }   
    
     void createinput() throws IOException{//an input file is created 
          try{    
            FileInputStream fin=new FileInputStream("C:/Users/jorge/Desktop/ans.txt�");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){
              System.out.println(e);}    
         }    
     void sort(){//the sort method is used to organize what is in the file and a new file is created
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
      
                 try{    
             FileOutputStream fout=new FileOutputStream("C:/Users/jorge/Desktop/sort.txt");      
             byte x[]=sorted.getBytes();//converting string into byte array
              fout.write(x);  
             fout.close();    
             
            }catch(Exception e){
                System.out.println(e);}    
     }
     void compare() throws IOException{//the word found in the file is evaluated and the method corresponding to the
        
         int intIndex = datos[0].indexOf("create");
          if(intIndex == 0){
             createoutput();
          } else{
              int d=datos[0].indexOf("assign");
              if(d==0){ 
                   createinput();
              }
          }
     }
}
