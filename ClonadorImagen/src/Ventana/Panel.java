package Ventana;

import Controlador.Controller;
import Modelo.Model;
import java.awt.Color;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Sora <notanemail@sora.org>
 */
public class Panel extends JPanel {

    
	public Panel() {
              
	}

       
        public BufferedImage image;
        public ArrayList<BufferedImage> listaImagen = new ArrayList<>();
        
        public BufferedImage ImagePanel(String imagePath) {
            try {
                return image = ImageIO.read(new File(imagePath));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
			return image;
        }
        
        public ArrayList<BufferedImage> clonar(int i){
        	
        	for (int j=0; j<=i; j++) {
        		listaImagen.add(image);
        	}
        	
        	return listaImagen;
        }

        

	//pintando los vertices
        @Override
	public void paint(Graphics g) {
            
            Graphics2D g2d=(Graphics2D)g;
            super.paintComponent(g);
            for (BufferedImage x: listaImagen) {
            	g.drawImage(x, 0, 0, null); // Draw the image at location (0,0)
			} 
            
            

	}
        
}
