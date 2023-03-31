package App;

import Controlador.Controller;
import Modelo.Model;
import Ventana.View;

/**
 *
 * @author Sora <notanemail@sora.org>
 */
public class launcher {
    
    public static void main(String args[]){
        
        Model m= new Model();
        Controller c = new Controller(m);
        View v= new View(c);
        
        
        c.setVentana(v);
              
    }

    
}
