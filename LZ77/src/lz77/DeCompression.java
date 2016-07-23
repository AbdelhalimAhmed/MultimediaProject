/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz77;
import java.util.Vector;
/**
 *
 * @author Halim
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
			
			if(dataVector.elementAt(i).equals("0"))
			{
				//print("Index="+0+" Length="+0)
				i+=2;
				newData+=dataVector.elementAt(i);
			}
			else
			{		
                            index=newData.length()-Integer.parseInt(dataVector.elementAt(i++));
				length=Integer.parseInt(dataVector.elementAt(i++));
				
				for(int indexCounter=index ; indexCounter<((index)+length);indexCounter++)
				{
					newData+=newData.substring(indexCounter,indexCounter+1);
				}
				newData+=dataVector.elementAt(i);
				 
			} 
		}
		return newData  ;
	}
	
}
