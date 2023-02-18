package ar.com.principal;

import javax.swing.*;

public class ConversorMonedas 
{
	
	public void ConvertirPesosCol_Dollar(double valorRecibido)
	{
		double monedaDolar = valorRecibido/ 4800.55;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares ");
	}
	
	public void ConvertirPesosCol_Euro(double valorRecibido)
	{
		double monedaEuro = valorRecibido/ 5070.20;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros ");
	}

}
