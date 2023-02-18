package ar.com.principal;

import javax.swing.JOptionPane;

public class Function 
{
	  ConversorMonedas monedas = new ConversorMonedas();
	
	
     public void ConvertirMonedas(Double valorRecibido)
     {
    	 Object[] valoresPosibles = {"De Pesos a Dolar" ,"De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a WonCoreano",
		      "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De WonCoreano  a Pesos"};
    	 String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion " , "Menu", 
    			            JOptionPane.QUESTION_MESSAGE , null,
    			            valoresPosibles 
    	                   ,valoresPosibles[1]  ) ).toString();   
    	 
    	 switch (opcion) {
		case "De Pesos a Dolar": { monedas.ConvertirPesosCol_Dollar(valorRecibido);	 }
		case "De Pesos a Euro": { monedas.ConvertirPesosCol_Dollar(valorRecibido);	 }
	/*	case "De Pesos a Libras": { monedas(valorRecibido);	 }
		case "De Pesos a Yen": { monedas(valorRecibido);	 }
		case "De Pesos a WonCoreano": { monedas(valorRecibido);	 }
		
		case "De Dolar a Pesos": { monedas(valorRecibido);	 }
		case "De Euro a Pesos": { monedas(valorRecibido);	 }
		case "De Libras a Pesos": { monedas(valorRecibido);	 }
		case "De Yen a Pesos": { monedas(valorRecibido);	 }
		case "De WonCoreano a Pesos": { monedas(valorRecibido);	 }
		*/
		}
         
     }
}
