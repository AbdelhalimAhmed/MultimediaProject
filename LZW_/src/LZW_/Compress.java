/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LZW_;

 import java .util.*;
import java .io.*;
/**
 *
 * @author Halim
 */
public class Compress {
    static Vector < Integer > dataVector;
    private  String data ="",compresed ="";
    Compress(String data) {
        this.data=data;
        dataVector = new Vector<Integer>();
    }
    
    public String getCompresed ()
    {
        return compresed;
    }
    public Vector <Integer> compressing ()
    {
        //int dictSize = 256;
        Map<String,Integer> dictionary = new HashMap<String,Integer>();
        for (int i = 0; i < 128; i++)
            {
                dictionary.put("" + (char)i, i);
            }
        String subSearch="";
        int indexLimitCheck=1;
        //System.out.println("data       : " + data );
        for(int index=0;index<data.length();index++)
        {
            subSearch=data.substring(index, index+1);
            while(dictionary.containsKey(subSearch))
            {
                if((indexLimitCheck+1)>data.length())
                {
                    subSearch=data.substring(index,data.length() );
                    indexLimitCheck++;
                //System.out.println(index+">"+subSearch+" :"+indexLimitCheck);
                break;
                }
                else
                subSearch=data.substring(index,++indexLimitCheck);
               // System.out.println(index+" "+subSearch+" :"+indexLimitCheck);
            }
            compresed+=" "+dictionary.get(subSearch.substring(0, subSearch.length()-1));
            dataVector.add(dictionary.get(subSearch.substring(0, subSearch.length()-1)));
            dictionary.put(subSearch, dictionary.size());
            //-2 becous indexwill incres 1 at for loop and we need indexLimit to be +1 on it
            index=indexLimitCheck-2;
        }
         dataVector.remove(dataVector.size()-1);
        return dataVector;
    }
}
