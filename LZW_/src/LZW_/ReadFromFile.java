package LZW_;
//Test  If  File  Exist && write
import java.io.*;
import java.lang.*;
//to creat file
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Halim
 */
public class ReadFromFile 
{
   
    String data ;

    public String ReadFile(String fileName) 
    {
        String word="";
          //To change body of generated methods, choose Tools | Templates.
          File x=new File( "//media//halim//Danger//Halim//Study//F C I 3//Multimedia//Assi Labs//LZW_//src//"+fileName+".txt" );
        if(x.exists())
        {
            try
            {
            Scanner ch=new Scanner(new File( "//media//halim//Danger//Halim//Study//F C I 3//Multimedia//Assi Labs//LZW_//src//"+fileName+".txt" ));
            
            while(ch.hasNext())
            {
               data=ch.next();
               word  += data;
               word  +=" ";
               //System.out.println(" "+word); 
            }
            ch.close();
            return word ;
            }
            catch(Exception exc){System.out.println("Error in opining the file");}
            
        }
        return word ;
    }
    
    
}
