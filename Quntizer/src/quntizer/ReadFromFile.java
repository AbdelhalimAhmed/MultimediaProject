package quntizer;
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
 * @author alm8waryLocal
 */
public class ReadFromFile 
{
   
    String data ;

    public String ReadFile(String fileName) 
    {
        String word="";
          //To change body of generated methods, choose Tools | Templates.
          File x=new File( "/home/halim/Desktop/Quntizer/"+fileName+".txt" );
        if(x.exists())
        {
            try
            {
            Scanner ch=new Scanner(new File( "/home/halim/Desktop/Quntizer/"+fileName+".txt" ));
            
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
    
    	// To creat file
    /*public void CreatFile()
	{
		// Formatter >> output string to file
		final Formatter file;
		try
                {
			//path to file
			file=new Formatter ( fileName);
			System.out.println("You created File");
		}
		catch(Exception error)
                {
			System.out.println("You got error in creating File");
		}	
	}
	
	//Test  If  File  Exist
    public int TestIfFileExist ()
	{
		 System.out.println(" ");
	File fileName =new File (filName);
	
	if(fileName.exists())
	{
            return(1);
		//System.out.println(fileName.getName() + ("  exist!"));
	}
	else
	{
            return 0;
		//System.out.println("Your File don,t exist");
	}
	}
    
	
    public String readFromFile ( )
    {
    	 String fileString = null ;
    	
    	//to read from file
    	Scanner scannerOpj ;
    	//open file
    	try{
    		
    		scannerOpj = new Scanner(new File(filName));
    		
    		//read
    		// while scanner has next value
    		while(scannerOpj.hasNext())
    		{
    			// add each word string
    			String  x=scannerOpj.next();
    			 fileString  += " " + x;
    			
    			
    		}
    		scannerOpj.close();
    		System.out.println(fileString);
    	}
    	catch(Exception error)
        {
            
    		System.out.println("donot find file");
    		
    	}
        
        return fileString;
    	
    	
    	
    }

  
    */
}
