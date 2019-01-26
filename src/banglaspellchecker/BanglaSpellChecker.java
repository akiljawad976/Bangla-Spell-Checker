/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banglaspellchecker;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Valociraptor
 */
public class BanglaSpellChecker {

  //  HashMap<Character, Character> convertLetter = new HashMap<Character, Character>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
          
            Scanner sc = new Scanner(System.in);
            String eletter =sc.nextLine();
            // String eletter="Oo";
             Character bletter=' ';
            for(int i=0;i<eletter.length();i++){
                if(eletter.charAt(i)=='O') bletter=0x985;
                else if(eletter.charAt(i)=='o') bletter=0x993;
                else if(eletter.charAt(i)==' ') bletter=' ';
                 
            
          //  for(int i=0;i<=s.length();i++){
          String s = Character.toString((char)bletter);
           // char c=convert(s.charAt(i));
            try{    
              FileWriter fw=new FileWriter("D:\\testout.txt",true);    
              fw.write(s);    
              fw.close();    
             }catch(Exception e){System.out.println(e);}    
             System.out.println("Success...");   
            //}
            }
        //System.out.println(s);
        
//StringBuffer b = new StringBuffer();
//    for (char c = 'a'; c < 'd'; c++) {
//      b.append(c);
//    }
////    b.append('\u00a5'); // Japanese Yen symbol
////    b.append('\u01FC'); // Roman AE with acute accent
////    b.append('\u0391'); // GREEK Capital Alpha
//    b.append('\u0986'); // GREEK Capital Omega
//        PrintWriter writer = new PrintWriter("spell.txt");
//writer.println("The first line");
//writer.println("The second line");
//writer.close();
//
//    for (int i = 0; i < b.length(); i++) {
//      System.out.println("Character #" + i + " is " + b.charAt(i));
//    }
//    System.out.println("Accumulated characters are " + b);
//    //-
//    }
    
    }
    
//    public String convert(char eletter)
//    {
//       char unicode;
//       unicode=0x986;
//       convertLetter.put('a',unicode);
//       return a;
//    }
    

}
