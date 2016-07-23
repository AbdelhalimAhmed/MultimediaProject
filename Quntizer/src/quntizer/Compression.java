/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quntizer;

/**
 *
 * @author mgwaryWin7
 */
public class Compression {
    public void run(int x)
    {
        
        String uniform="";
        for(int i=0;i<257;i=i+x)
        {
            //System.out.println((i+(x/2)));
            uniform+=(i+(x/2))+" ";
        }
         
        WriteTOFIle wrOpj =new WriteTOFIle();
            wrOpj.writeToFile("/home/halim/Desktop/Quntizer/midpoint.txt",uniform);
        //ba8d alsoura min mkanha
        ImageRW opj=new ImageRW();
        int[][] pixels= opj.readImage("/home/halim/Desktop/Quntizer/lena.jpg");
        String comprSSEd="";
        int y;
        for(int i=0;i<pixels.length;i++)
        {
            for(int I=0;I<pixels[i].length;I++)
            {
                //bna8d kl noktah mn alsora /x
                pixels[i][I]=(pixels[i][I]/x) ;
               // comprSSEd+=y+" ";
            }
           
        } 
        System.out.println("===============================");
        wrOpj.writeFile("/home/halim/Desktop/Quntizer/compressed.txt",pixels);
         System.out.println("++++++++++++++++++++++++++++++++");
     
    }
    
}
