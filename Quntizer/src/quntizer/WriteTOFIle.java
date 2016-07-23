package quntizer;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alm8waryLocal
 */
public class WriteTOFIle {
    //write data to fileName Data
	public void writeToFile(String filName , String data)
	{
		//openFile
                  
		Formatter fileName ;
		
		try{
			fileName= new Formatter (filName);
			
			//add record
			fileName.format ( data);
			

			//close file
			fileName.close();
		}
		catch (Exception error){
			System.out.println("You have an error");
		}
		
		
		
	}
        public void writeFile(String filName , int[][] data)
	{
            try {
                //openFile
                DataOutputStream out=new DataOutputStream(new FileOutputStream(filName));
                
                for(int i=0;i<data.length;i++)
                    for(int j=0;j<data[i].length;j++){
                        //System.out.println(data[i][j]);
                        out.writeInt(data[i][j]);
                    }
                
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(WriteTOFIle.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WriteTOFIle.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		
		
	}

}
