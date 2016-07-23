/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lz77;
import  java.lang.String ;
import  java.util.*;
/**
 *
 * @author Halim 
 */
public class Compression {
    
    private String data , dataStoredBefore,compresedData ;
	static Vector<String> dataVector;
	
        
	public Compression (String data) //constractor
	{
		dataVector = new Vector<String>();
		this.data=data;
		dataStoredBefore="";
		compresedData="";
	}
	
	public String getCompressedData() //print compressed data
	{
                return  compresedData; 
	}
	
	public Vector <String>  compress () //compressing operation and return them in vector of string
	{
		 String subSearch; // sub string to search
		 int indexGet , positionInDataStore=0; // indexGet to increas index for substring plus && positionInDataStore to get index in datastore
		 int inLoop ; //for loop on data to search and find and copressed
		 for(int index=0; index<data.length();index++)
		 {
 			 
			 
			 inLoop=0;
			 indexGet=index;
			 //get one char 
			 subSearch=data.substring(index, index+1);
			 // search in data until you get target
			 // when i finish while loop i get substring in data store 
			 //findInDataStoredBefore is function to check if aword in the compressed data before
			 //thes while loop get strings that are stored before until found on  woh didnot stored befor and save it to subSearch
			 while(findInDataStoredBefore(subSearch )!=-1 && findInDataStoredBefore(subSearch )<50)
			 {   
				 inLoop=1;
				 //check not reach to the end
				 if(indexGet+1>=data.length())
				  {
					  break ;
				  }
				 
				 subSearch=data.substring(index, ++indexGet+1); 
			 }
			 if(inLoop==1)
			 {
				 //use the data who stored before  
				 subSearch=subSearch.substring(0,subSearch.length()-1);
			 }
			 //position of stored data before
			 positionInDataStore=findInDataStoredBefore(subSearch );
			 // data.substring(indexGet,indexGet+1) >> new char index>>start of tag
			 creatTag(subSearch,positionInDataStore,data.substring(indexGet,indexGet+1),index);
			 index=indexGet;
			
		 }
		 return dataVector;
		 
	}
	
	
	
	//creat tag and store data in dictinary search "dataStoresBefore"
	 // subSearch>>data stored before || positionInStore>>its postion   data.substring(indexGet,indexGet+1) >> new char index>>start of tag

	private void creatTag(String subSearch ,int positionInStore ,String newChar ,int index )
	{  
		
		int length = subSearch.length();
		String extrnalChar=newChar;

		if(positionInStore==-1)
		{
			length=0;
			newChar="";
		}
		//to add in data store
		dataStoredBefore+=subSearch+newChar;
		//save new char in new things
		//this mean that is new char
		if(positionInStore==-1)
		{
			newChar=extrnalChar;
			//add tag
			//positionInStore+1 it will be 0
			compresedData += "<"+Integer.toString( positionInStore+1)+","+Integer.toString(length)+","+newChar+">";
			dataVector.add(Integer.toString( positionInStore+1));
			dataVector.add(Integer.toString(length));
			dataVector.add(newChar);
		    
		
		}
		else
		{
			//add tag
			//index-positionInStore get posion frm index
			compresedData += "<"+Integer.toString( index-positionInStore)+","+Integer.toString(length)+","+newChar+">";
			dataVector.add(Integer.toString( index-positionInStore));
			dataVector.add(Integer.toString(length));
			dataVector.add(newChar);
		}
		
	}

	//return index of string from back
	private int findInDataStoredBefore(String word)
	{
		if(dataStoredBefore==null)
		{
			return -1;
		}
		return dataStoredBefore.lastIndexOf(word);
	       
	}
   	

	
	
}
