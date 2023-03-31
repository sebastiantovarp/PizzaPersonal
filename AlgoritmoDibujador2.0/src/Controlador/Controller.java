package Controlador;

import Modelo.Model;
import Ventana.View;
import Ventana.Panel;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;


/**
 *
 * @author Sora <notanemail@sora.org>
 */
public class Controller implements ActionListener {
    
        private View v ;
	private Model mod;
        private Panel panel;
        
	
        public Controller (Model m){
            this.mod=m;
        }
        
	@Override
	public void actionPerformed(ActionEvent e) {
            
            try {
             
            String imgprueba="/home/sora/Downloads/draco.jpg";	
            String k=v.direccion.getText();
            BufferedImage imagen = v.mipanel.ImagePanel(k);

            v.mipanel.image= imagen;
            v.mipanel.repaint();
	    v.repaint();
            } catch (Exception r) {
                System.out.println("Ay, me dio amsiedah :(");
                System.out.println("No puedo hacer eso amo bonito :(");
            }

        }


        public void setVentana(View b) {
		this.v=b;
	}

	public void setModel(Model o) {
		this.mod=o;
	} 
        
        
    }

/*thbla6t*/