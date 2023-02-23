package ar.com.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;

public class principal 
{
    public static void main(String[] args) 
    {
    	
    	 Cliente clienteActual = new Cliente("anonimo","admin", "admin", 0);
    	 
    	 generaLogin(clienteActual);
    	
	}
    
    

	
	public static void generaLogin(Cliente pCliente) 
	{
		JFrame frame = new JFrame(" - Conversor - ");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setSize(400, 300);
		panel.setLayout(null);        
		
		JLabel etiquetaUsuario = new JLabel("Usuario: ");         etiquetaUsuario.setBounds(50, 20, 100, 25);  
		JLabel etiquetaClave = new JLabel("Contraseña: ");        etiquetaClave.setBounds(50, 50, 100, 25); 
		
		JTextField inputUsuario = new JTextField(20);             inputUsuario.setBounds(200, 20, 120, 25);
		JPasswordField inputContrasenia = new JPasswordField(20);         inputContrasenia.setBounds(200, 50, 120, 25);
		
		JButton botonIniciar = new JButton("iniciar");            botonIniciar.setBounds(50, 150, 100, 25);
		JButton botonRegistrarse = new JButton("Registrarse");    botonRegistrarse.setBounds(200, 150, 125, 25);
		
		panel.add(etiquetaUsuario);
		panel.add(etiquetaClave);
		panel.add(inputUsuario);
		panel.add(inputContrasenia);
		panel.add(botonIniciar);
		panel.add(botonRegistrarse);
		
		frame.add(panel);
		

		frame.setVisible(true);
		
		botonIniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   
				if( ( pCliente.getUsuario().equals(inputUsuario.getText() ) ) && ( pCliente.getContrasenia().equals(inputContrasenia.getText()) ) )
				{
					iniciarPrograma(panel);
					inputUsuario.setText("");
					inputContrasenia.setText("");
				}
				else
				{
			         JOptionPane.showMessageDialog(botonIniciar, "No existe usuario o contraseña, por favor registrese");
			         inputUsuario.setText("");
					 inputContrasenia.setText("");
				}
				
			}
		});
		
		botonRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			pCliente.setUsuario(inputUsuario.getText());
			pCliente.setContrasenia(inputContrasenia.getText());
				
				
				  JOptionPane.showMessageDialog(botonIniciar, "Se registro el usuario: "+pCliente.getUsuario());
			         inputUsuario.setText("");
					 inputContrasenia.setText("");
				
			}
		});
		
		
	}
	
	
	
	public static void iniciarPrograma(JPanel panelReferencia)
	{
        Function monedas = new Function();
        ValidaInput valorInput = new ValidaInput(null);  
	    
	    int seleccion = 0;
	    Object receptor = "0";
	    
	    while(seleccion <1 && receptor!=null) /*10*/
	    {
    	                                               /*1*/					/*2*/				  /*3*/	            /*4*/               /*5*/                                  /*6*/                               /*7*/             /*8*/
	    	receptor = (JOptionPane.showInputDialog(panelReferencia, "Seleccione una opcion de conversion " , "Menu", JOptionPane.QUESTION_MESSAGE , null, new Object[] {"Conversor de Moneda" , "Conversor de Temperatura"} ,"Seleccion"  )  );                                                             
           
	    	if(receptor != null) { String opciones = receptor.toString(); 
       
        
        	
        
    	switch (opciones)
    	{
		
    	case "Conversor de Moneda": 
		{
			
			Object input = JOptionPane.showInputDialog(panelReferencia,"Ingrese un valor a convertir: ");
	        valorInput.get_input(input);                                              /*12*/
			
	        
			
			while(!valorInput.isNumber() && valorInput.noEs_Null())
			{
				valorInput.get_input(JOptionPane.showInputDialog(panelReferencia,"Debe ingresar por lo menos un valor numerico"));
			}
			
			 if(valorInput.noEs_Null())
				{
			double valorRecibido = Double.parseDouble(valorInput.convertir_a_String());
			
			monedas.ConvertirMonedas(valorRecibido,panelReferencia);
			
		   }
			
			 seleccion = JOptionPane.showConfirmDialog(panelReferencia," ¿Desea realizar otra operacion? ");	 /*11*/
			 
			 break;
					
		} //            FIN CASE -  MONEDA -
		
		
    	
    	
    	case "Conversor de Temperatura": 
    	{
    		/*¿Cuáles son los 5 tipos de temperatura?
    		 * Celsius - Fahrenheit - Kelvin- Rankine
    		 * 
    		 * */
    		Object input = JOptionPane.showInputDialog(panelReferencia,"Ingrese un valor a convertir");
    		valorInput.get_input(input);
    		
    		FuncionTemp temperatura = new FuncionTemp(panelReferencia);
  
			
			while(!valorInput.isNumber() && valorInput.noEs_Null())
			{
				valorInput.get_input(JOptionPane.showInputDialog(panelReferencia,"Debe ingresar por lo menos un valor numerico"));
			}
			
			 if(valorInput.noEs_Null())
				{
			double valorRecibido = Double.parseDouble(valorInput.convertir_a_String());
			temperatura.convertirTemperatura(valorRecibido);
				}
			 
			 seleccion = JOptionPane.showConfirmDialog(panelReferencia," ¿Desea realizar otra operacion? ");	 /*11*/
    	
			 break;
    	}//     FIN CASE -  TEMPERATURA  -
		
		
		
		
		}
    	 
		
        }
               
        
	    }
	    
	    JOptionPane.showMessageDialog(panelReferencia,"Programa terminado ");
    	
	  
	}
	
	
	
	
	
}


/*
 * JOptionPane.showInputDialog(1-> ventana padre, permite ubicar el cuadro de dialogo, con null se centra y queda por defecto  2-> Mensaje para usuario 3-> Titulo  4-> Personaliza el tipo de mensaje con botones o iconos 5-> algo  6-> objeto con String que son las opciones 7-> tipo de menu 8->   ))
 * 
 * 
 * 10 --> El programa continua mientras seleccion sea igual a 0, obteiene el valor del metodo JOptionPane.showInputDialog();
 * 
 * 11 --> muestra un mensaje de dialogo con un arreglo de 3 elementos,
 *  0 para "si"
 *  1 para "no"
 *  2 para "cancel";
 *  
 *  12 -->> impide el uso de objetos nulos obtenidos por algunos de los metodos de Messagedialog
 *  
 */