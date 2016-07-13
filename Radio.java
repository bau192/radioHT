//Universidad Del Valle de Guatemala
//Algoritmos
//Erick Fernando Bautista Munoz 15192
//Salvador Recinos 15001
//Irvin Oliva 15816
//Jose Tzoc 13322
//seccion 10
//11/7/2016

public interface Radio		

	{ 
	/**
	 *aqui se establecen los metodos necesarios para trabajar
	 */
	public void ON_OFF();
	public void AM_FM();
	public void Cambio_de_Emisora(boolean a);
	public void Guardar_Emisora (int x);
	public void Seleccionar_emisora_guardada(int x);
	public void Guardar_seleccion();
	public double getEmisora();

	}	