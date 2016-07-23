/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.util.Vector;
/**
 *
 * @author alm8waryLocal
 */
public class DeCompression {
    static Vector<String> dataVector;
	public DeCompression(Vector<String> dataVector2) {
		// TODO Auto-generated constructor stub
		dataVector=dataVector2;
	}

	void DeCompression()
	{
		
	}
	
	void DeCompression( Vector<String> dataVector)
	{
		this.dataVector=dataVector ;
	}
	
	public String decomprision ()
	{
		String newData="";
		int index=0;
		int length=0;
		for(int i=0;i<dataVector.size();i++)
		{
			//System.out.println();System.out.println();
			
			if(dataVector.elementAt(i).equals("0"))
			{
				//System.out.println("Index="+0+" Length="+0);
				i+=2;
				//System.out.println("********************* "+dataVector.elementAt(i));
				newData+=dataVector.elementAt(i);
			}
			else
			{		//System.out.println("********************* "+dataVector.elementAt(i));
				
				//length of return = length of newdata - index value in vector
				index=newData.length()-Integer.parseInt(dataVector.elementAt(i++));
				length=Integer.parseInt(dataVector.elementAt(i++));
				//System.out.println("index="+index+" length="+length);
				//System.out.println("....");
				
				for(int indexCounter=index ; indexCounter<((index)+length);indexCounter++)
				{
					//System.out.println("indexCounter = "+indexCounter);
					//System.out.println("<"+newData.substring( indexCounter,indexCounter+1)+">");
					newData+=newData.substring(indexCounter,indexCounter+1);
					//System.out.println(">> : "+newData);
				}
				newData+=dataVector.elementAt(i);
				 
			} 
			//System.out.println("dataVector[i]>  : "+dataVector.elementAt(i));
			//System.out.println("newData      >> : "+newData);
		}
		return newData  ;
	}
	
}
