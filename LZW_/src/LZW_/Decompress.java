/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LZW_;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Halim
 */

public class Decompress {
  static Vector <Integer> dataVector ; 
   Decompress(Vector <Integer> dataVector)
   {
       this.dataVector=dataVector;
   }
   
   public String Decomprissing ()
   {
        //System.out.println("Copmressed:" + dataVector ); 
        String decompreseedData="";
        Map<Integer,String> dictionary = new HashMap< Integer,String>();
        for (int i = 0; i < 128; i++)
            {
                dictionary.put(i,"" + (char)i );
            }
        
     
       decompreseedData+=dictionary.get(dataVector.elementAt(0));
       //System.out.println("..................................");
       //System.out.println();
       String backValue = dictionary.get(dataVector.elementAt(0));
       
       //System.out.println(backValue+"  <<");
       for(int index=1;index<dataVector.size();index++)
       {
          // System.out.println("getKey:"+dictionary.containsKey(dataVector.elementAt(index)));
           if(dictionary.containsKey(dataVector.elementAt(index)))
           {
               //System.out.println("index valu:"+dictionary.get(dataVector.elementAt(index)));
               decompreseedData+=dictionary.get(dataVector.elementAt(index));
               dictionary.put(dictionary.size(), backValue+dictionary.get(dataVector.elementAt(index)).substring(0, 1));
               //System.out.println("data:"+decompreseedData+" dictionary:"+dictionary.get(dictionary.size()-1));
           }
           else
           {
               decompreseedData+=backValue+backValue.substring(0, 1);
               dictionary.put(dictionary.size(),backValue+backValue.substring(0, 1));
              // System.out.println("not found on System DIC");
           }
           backValue=dictionary.get(dataVector.elementAt(index));
           
        }
     //System.out.println(decompreseedData);
     return decompreseedData ;
        
   
        
   }
}
