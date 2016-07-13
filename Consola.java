

public class Consola implements Radio

{

	protected boolean am_fm;
	protected boolean on_off;
	protected double frecuencias;
	
	
	public Consola()
	{
		
		this.am_fm= false;
		this.on_off=false;
		this.frecuencias= 510;
		
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
		
		if (a==true)
			{
			frecuencias=frecuencias+10;
			}
		else
			{
			frecuencias=frecuencias-10;
			}
	}
	
	public void Guardar_Emisora (int x)
	{
	
	
	}
	
	public void Seleccionar_emisora_guardada(int c)
	{

	}
	
	public void Guardar_seleccion()
	{
			
	}
	public double getEmisora()
	{
		return frecuencias;
	}
	
}