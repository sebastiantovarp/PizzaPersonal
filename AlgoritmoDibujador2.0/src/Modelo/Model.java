package Modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.imageio.ImageIO;

/**
 *
 * @author Sora <notanemail@sora.org>
 */

public class Model {

    public Model() {
    }



Random random = new Random();

    //pick a number
    public int escogeRandom(int nvertices){
       
        int opcion= (int) (Math.floor(Math.random() * (nvertices))+0);
        return opcion;
    }
    
    public void dibujar(String s)throws IOException{
        int width = 963;    //width of the image
        int height = 640;   //height of the image
        BufferedImage image = null;
        File f = null;

        //read image
        try{
          f = new File(s); //image file path
          image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
          image = ImageIO.read(f);
          System.out.println("Reading complete.");
        }catch(IOException e){
          System.out.println("Error: "+e);
        }
      }
    
    
}
