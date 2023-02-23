package ar.com.principal;

import javax.swing.*;




public class ConversorMonedas 
{
	JPanel panelReferencia =null;
	
	double pesosA_dolar = 4800.55;     	//"Valuacion De Pesos a Dolar" 
	double pesosA_euro = 5281.08;
	double pesosA_libras = 6004.66;
	double pesosA_yen =36.89 ;
	
	public void getPanel(JPanel panelReferencia) 
	{
		this.panelReferencia = panelReferencia;
	}
	
	
	
	public void ConvertirPesosCol_Dollar(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_dolar," Dollar");
	}
	
	public void ConvertirPesosCol_Euro(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_euro," Euro");
	}
	
	public void ConvertirPesosCol_Libras(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_libras," Libras");
	}
	public void ConvertirPesosCol_Yen(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_yen," Yen");
	}
	
   
	
	/** otra moneda a pesos colombianos **/
	
	
	public void Convertir_Dollar_PesosCol(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_dolar," Pesos");
	}
	
	public void Convertir_Euro_PesosCol(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_euro," Pesos");
	}
	
	public void Convertir_Libras_PesosCol(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_libras," Pesos");
	}
	public void Convertir_Yen_PesosCol(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_yen," Pesos");
	}
	
	

	
	
	public void calc_Pesos_a(double valorRecibido, double cotizacion, String nombreMoneda)
	{
		double moneda = valorRecibido/ cotizacion;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(panelReferencia, "Tienes " + moneda + nombreMoneda);
	}
	
	public void calc_a_Pesos(double valorRecibido, double cotizacion, String nombreMoneda)
	{
		double moneda = valorRecibido*cotizacion;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(panelReferencia, "Tienes " + moneda + nombreMoneda);
	}
	

}
