package LZW_;

import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Halim
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

}
