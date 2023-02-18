package ar.com.principal;

import java.util.*;

import javax.swing.*;

public class principal 
{
    public static void main(String[] args) 
    {
	    Function monedas = new Function();
	    
	    int seleccion = 0;
	    
	    while(JOptionPane.OK_OPTION == seleccion )
	    {
    	                                               /*1*/					/*2*/				  /*3*/	            /*4*/               /*5*/                                  /*6*/                               /*7*/             /*8*/
    	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion " , "Menu", JOptionPane.QUESTION_MESSAGE , null, new Object[] {"Conversor de Moneda" , "Conversor de Temperatura"} ,"Seleccion"  )  ).toString();                                                             
        
    	switch (opciones)
    	{
		case "Conversor de Moneda": {
			String input = JOptionPane.showInputDialog("Ingrese un valor a convertir: "); //Verificar que el valor se pueda convertir a numerico.
			double valorRecibido = Double.parseDouble(input);
			
			monedas.ConvertirMonedas(valorRecibido);
			
			
			 seleccion = JOptionPane.showConfirmDialog(null," ¿Desea realizar otra operacion? ");
			 
			 /*
			if(JOptionPane.OK_OPTION == seleccion )
			{
				System.out.println("Selecciono opcion afirmativa");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Programa terminado");
			}
			*/
			
		}
		
		
		}
    	 
		}
	    JOptionPane.showMessageDialog(null,"Programa terminado");
    	
    	
    	
    	
    	
	}
}


/*
 * JOptionPane.showInputDialog(1-> ventana padre, permite ubicar el cuadro de dialogo, con null se centra y queda por defecto  2-> Mensaje para usuario 3-> Titulo  4-> Personaliza el tipo de mensaje con botones o iconos 5-> algo  6-> objeto con String que son las opciones 7-> tipo de menu 8->   ))
 * 
 */