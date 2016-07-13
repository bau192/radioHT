//Universidad Del Valle de Guatemala
//Algoritmos
//Erick Fernando Bautista Munoz 15192
//Salvador Recinos 15001
//Irvin Oliva 15816
//Jose Tzoc 13322
//seccion 10
//11/7/2016

public class Consola implements Radio

{

	protected boolean am_fm;
	protected boolean on_off;
	protected double frecuencias;
	
	
	public Consola()
	{
		
		this.am_fm= false;
		this.on_off=false;
		this.frecuencias= 530.0;
		
	}
	
	
	public void ON_OFF()
	{
		if (on_off==false)
			{
				on_off=true;
			}		
		else
			{
				on_off=false;
			}
	}
	
	public void AM_FM()
	{
		if (am_fm==false)
			{
				am_fm=true;
			}		
		else
			{
				am_fm=false;
			}
	}
	
	public void Cambio_de_Emisora(boolean a)
	{
		
		if (a==true && frecuencias<=1610)
			{
			frecuencias=frecuencias+10;
			}
		if (a==false && frecuencias>=530)
			{
			frecuencias=frecuencias-10;
			}
		if (a==true && frecuencias==1620)
		{
			frecuencias=530;
		}
		if (a==false && frecuencias==520)
		{
			frecuencias=1610;
		}
	}
	
	public void Guardar_Emisora (int x)
	{
	//no considere su uso pues requeria de mas parametros y valor de retorno
	}
	
	public void Seleccionar_emisora_guardada(int c)
	{
	//no considere su uso pues requeria de mas parametros y valor de retorno
	}
	
	public void Guardar_seleccion()
	{
	//no considere su uso pues requeria de mas parametros y valor de retorno
	}
	public double getEmisora()
	{
		return frecuencias;
	}
	
}