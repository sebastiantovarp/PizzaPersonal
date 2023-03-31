package Ventana;

import Controlador.Controller;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sora <notanemail@sora.org>
 */
public class View extends JFrame {
    
    //boton para crear la lista.
    /** ADVERTENCIA, LOS COMPONENTES SE INICIALIZAN EN INITCOMPONENTS() NO EN LOS ATRIBUTOS*/
    JButton botonaccion= new JButton("Suba eso");
    //boton para borrar ambas estrucuras de datos
    JButton botonborrar= new JButton("Me dio sueño.");
    
    JLabel leyenda= new JLabel("Meta la direccion de la imagen mano");
    //campo de texto de entrada
    public JTextField direccion = new JTextField();

    
    //creacion del panel donde se dibujan la imagen.
    public Panel mipanel;
    
    //instancia del controlador para crear la referencia del controlador
    private Controller controlador;
    
    public View(Controller c){
        
        super("Better than DALL-E ");
        this.setBounds(150,150,1000,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        
        controlador=c;
        //el orden es: inicializar y luego añadir. caso contrario: nullpointer exception
        initComponents();
        addComponents();
        
        
    }
    
    //definicion de los componentes y sus propiedades
    public void initComponents(){
                //definicion del panel con coordenadas
                mipanel=new Panel();
                mipanel.setBounds(10,10,600,500);
                mipanel.setBackground(Color.white);
                
                
 
                //campo de texto para el usuario:
                leyenda.setBounds(650, 40, 200,20);
                direccion.setBounds(650, 80, 250, 20);
                
              
                
                //definicion de los parametros del boton
                botonaccion.setBounds(650,290, 200,30);
                botonaccion.addActionListener(controlador);
                //boton para borrar
                botonborrar.setBounds(650,340, 200, 30);
                botonborrar.addActionListener(controlador);
                
              
                
    }
    
    public void addComponents(){
    	//this.add(nombredelcomponente)
        this.add(leyenda);
        this.add(direccion);
        this.add(botonaccion);
        this.add(botonborrar);
        this.add(mipanel);
        
    }

  }
