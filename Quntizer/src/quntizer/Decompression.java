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
public class Decompression {
    
    public void run(int x)
    {
        ReadFromFile opJJ=new ReadFromFile();
        //String midpoint  =opJJ.ReadFile("midpoint");
        //String comprseed =opJJ.ReadFile("compressed");
        ImageRW opj=new ImageRW();
        int[][] pixels= opj.readImage("/home/halim/Desktop/Quntizer/lena.jpg");
        
        System.out.print("ooooooooooooooooooo");
        for(int i=0;i<pixels.length;i++)
        {
            for(int I=0;I<pixels[i].length;I++)
            {
                pixels[i][I]=((pixels[i][I]/x)*x)+(x/2);
                //System.out.print(pixels[i][I]+" ");
            }
            //System.out.println();
        } 
         opj.writeImage(pixels,"/home/halim/Desktop/Quntizer/NEW.jpg");
    
    }
    
}
