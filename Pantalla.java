//Universidad Del Valle de Guatemala
//Algoritmos
//Erick Fernando Bautista Munoz 15192
//Salvador Recinos 15001
//Irvin Oliva 15816
//Jose Tzoc 13322
//seccion 10
//11/7/2016

	/**
	 *aqui se importan todos los librerias necesarias 
	 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

//aqui se inicializa la clase Pantalla y se extiende a Jframe
public class Pantalla extends JFrame 
{
	//aqui se generan los objetos de la GUI asi como otros para funcionamiento
	private JPanel contentPane;
	private JTextField PANTALLA;
	private JTextField PANTALLA2;
	private JTextField PANTALLA3;
	private JTextField PANTALLA4;
	private JTextField PANTALLA5;
	private Radio Carrito;
	private String emisora;
	private String memory;
	private double [] memorias= {510.0,510.0,510.0,510.0,510.0,510.0,510.0,510.0,510.0,510.0,510.0,510.0};
	private boolean [] memoriasAF={false,false,false,false,false,false,false,false,false,false,false,false};
	private boolean on__off;
	private boolean am_fm;
	private String mensaje;
	private String mensaje2;
	private double emisorapre;
	private double emisorapreAm;
	private int memoria;
	

	/**
	 * Aqui se lanza la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * aqui se generan el frame
	 */ 
	public Pantalla() 
	{
		
		/**
		 * aqui se insertan valores predeterminados a diferentes variables
		 */
		am_fm=false;
		on__off=false;
		mensaje="OFF";
		mensaje2="FM";
		emisorapre=0.00;
		emisorapreAm=87.9;
		memoria=0;
		
		/**
		 * aqui se escriben algunos parametros para la GUI
		 */
		setResizable(false);
		setTitle("RADIO");
		emisora="530.0";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Carrito=new Consola();
		DecimalFormat f= new DecimalFormat("#.##");
			
		/**
		 * aqui se establecen los valores para establecer los componentes de la GUI
		 */
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel fondo=new JLabel();
		fondo.setBounds(0,0,getWidth(),getHeight());
		ImageIcon direccionInicio= new ImageIcon("fondo.jpg");
		fondo.setIcon(direccionInicio);
		panel.add(fondo);
		
	
		JButton ONOFF = new JButton("ON/OFF");
		ONOFF.setBounds(307, 11, 89, 23);
		ONOFF.setForeground(Color.GREEN);
		ONOFF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		ONOFF.setBackground(Color.BLACK);
		fondo.add(ONOFF);
		
		JButton AMFM = new JButton("AM/FM");
		AMFM.setBounds(208, 11, 89, 23);
		AMFM.setForeground(Color.GREEN);
		AMFM.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		AMFM.setBackground(Color.BLACK);
		fondo.add(AMFM);
		
		JButton IZQ = new JButton("<<");
		IZQ.setBounds(208, 45, 89, 23);
		IZQ.setForeground(Color.GREEN);
		IZQ.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		IZQ.setBackground(Color.BLACK);
		fondo.add(IZQ);
		
		JButton DER = new JButton(">>");
		DER.setBounds(307, 45, 89, 23);
		DER.setForeground(Color.GREEN);
		DER.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		DER.setBackground(Color.BLACK);
		fondo.add(DER);
		
		JButton G1 = new JButton("1");
		G1.setBounds(10, 113, 89, 23);
		G1.setForeground(Color.GREEN);
		G1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G1.setBackground(Color.BLACK);
		fondo.add(G1);
		
		JButton G2 = new JButton("2");
		G2.setBounds(109, 113, 89, 23);
		G2.setForeground(Color.GREEN);
		G2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G2.setBackground(Color.BLACK);
		fondo.add(G2);
		
		JButton G3 = new JButton("3");
		G3.setBounds(208, 113, 89, 23);
		G3.setForeground(Color.GREEN);
		G3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G3.setBackground(Color.BLACK);
		fondo.add(G3);
		
		JButton G4 = new JButton("4");
		G4.setBounds(307, 113, 89, 23);
		G4.setForeground(Color.GREEN);
		G4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G4.setBackground(Color.BLACK);
		fondo.add(G4);
		
		JButton G5 = new JButton("5");
		G5.setBounds(10, 147, 89, 23);
		G5.setForeground(Color.GREEN);
		G5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G5.setBackground(Color.BLACK);
		fondo.add(G5);
		
		JButton G6 = new JButton("6");
		G6.setBounds(109, 147, 89, 23);
		G6.setForeground(Color.GREEN);
		G6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G6.setBackground(Color.BLACK);
		fondo.add(G6);
		
		JButton G7 = new JButton("7");
		G7.setBounds(208, 147, 89, 23);
		G7.setForeground(Color.GREEN);
		G7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G7.setBackground(Color.BLACK);
		fondo.add(G7);
		
		JButton G8 = new JButton("8");
		G8.setBounds(307, 147, 89, 23);
		G8.setForeground(Color.GREEN);
		G8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G8.setBackground(Color.BLACK);
		fondo.add(G8);
		
		JButton G9 = new JButton("9");
		G9.setBounds(10, 181, 89, 23);
		G9.setForeground(Color.GREEN);
		G9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G9.setBackground(Color.BLACK);
		fondo.add(G9);
		
		JButton G10 = new JButton("10");
		G10.setBounds(109, 181, 89, 23);
		G10.setForeground(Color.GREEN);
		G10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G10.setBackground(Color.BLACK);
		fondo.add(G10);
		
		JButton G11 = new JButton("11");
		G11.setBounds(208, 181, 89, 23);
		G11.setForeground(Color.GREEN);
		G11.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G11.setBackground(Color.BLACK);
		fondo.add(G11);
		
		JButton G12 = new JButton("12");
		G12.setBounds(307, 181, 89, 23);
		G12.setForeground(Color.GREEN);
		G12.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		G12.setBackground(Color.BLACK);
		fondo.add(G12);
		
		JButton GE = new JButton("GE");
		GE.setBounds(208, 79, 89, 23);
		GE.setForeground(Color.GREEN);
		GE.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		GE.setBackground(Color.BLACK);
		fondo.add(GE);
		
		PANTALLA = new JTextField();
		PANTALLA.setForeground(Color.GREEN);
		PANTALLA.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 50));
		PANTALLA.setBackground(Color.BLACK);
		PANTALLA.setText("-------");
		PANTALLA.setEditable(false);
		PANTALLA.setBounds(14, 50, 184, 50);
		fondo.add(PANTALLA);
		PANTALLA.setColumns(1);
		
		PANTALLA2 = new JTextField();
		PANTALLA2.setForeground(Color.RED);
		PANTALLA2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		PANTALLA2.setBackground(Color.BLACK);
		PANTALLA2.setText("OFF");	
		PANTALLA2.setEditable(false);
		PANTALLA2.setBounds(307, 79, 30, 23);
		fondo.add(PANTALLA2);
		PANTALLA2.setColumns(10);
		
		PANTALLA3 = new JTextField();
		PANTALLA3.setForeground(Color.RED);
		PANTALLA3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		PANTALLA3.setBackground(Color.BLACK);
		PANTALLA3.setText("FM");
		PANTALLA3.setEditable(false);
		PANTALLA3.setBounds(340, 79, 30, 23);
		fondo.add(PANTALLA3);
		PANTALLA3.setColumns(10);
		
		PANTALLA4 = new JTextField();
		PANTALLA4.setForeground(Color.RED);
		PANTALLA4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		PANTALLA4.setBackground(Color.BLACK);
		PANTALLA4.setText("--");
		PANTALLA4.setEditable(false);
		PANTALLA4.setBounds(377, 79, 25, 23);
		fondo.add(PANTALLA4);
		PANTALLA4.setColumns(10);
		
		PANTALLA5 = new JTextField();
		PANTALLA5.setForeground(Color.GREEN);
		PANTALLA5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		PANTALLA5.setBackground(Color.BLACK);
		PANTALLA5.setText("GE guarda la emisora en memoria elegida");
		PANTALLA5.setEditable(false);
		PANTALLA5.setBounds(14, 10, 184, 20);
		fondo.add(PANTALLA5);
		PANTALLA5.setColumns(2);
		
		
		
		
		/**
		 *aqui se inician los listener 
		 */
	
	
		//lISTERNER ONOFF
		
		ONOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if (on__off==false)
				{
				on__off=true;
				
				mensaje2=" ON";
				mensaje=emisora;
				PANTALLA2.setText(mensaje2);
				PANTALLA.setText(mensaje);
				}
				else
				{
				on__off=false;
				
				mensaje2="OFF";
				mensaje="-------"; 
				PANTALLA2.setText(mensaje2);
				PANTALLA.setText(mensaje);
				}
				
			}
		});
		
		
		//Listener AMFM
		
		AMFM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (on__off==true)
			{
				if (am_fm==false)
				{
				am_fm=true;
				
				mensaje2=" AM";
				emisora=String.valueOf(f.format(emisorapreAm));
				PANTALLA.setText(emisora);
				PANTALLA3.setText(mensaje2);
				}
				else
				{
				am_fm=false;
				mensaje="--------------";
				mensaje2="FM";
				
				
				
				emisora=String.valueOf(Carrito.getEmisora());
				PANTALLA3.setText(mensaje2);
				PANTALLA.setText(emisora);
				
				}
			}
				
			}
		});
		
		//Listener BACk
		IZQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (on__off==true)
				{
					if (am_fm==false)
					{
							
						Carrito.Cambio_de_Emisora(false);
						emisorapre=Carrito.getEmisora();
							if (emisorapre<=520)
							{
								emisorapre=1610;
							}
						emisora=String.valueOf(emisorapre);
						PANTALLA.setText(emisora);
					}
					
					if (am_fm==true)
					{
						emisorapreAm=emisorapreAm-0.2;
						if (emisorapreAm<=87.7)
						{
							emisorapreAm=107.9;
						}
						
						emisora=String.valueOf(f.format(emisorapreAm));
						PANTALLA.setText(emisora);
					}
				}
			}
		});
		
		//Listener ADD
		DER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (on__off==true)
				{
					if (am_fm==false)
					{
							
						Carrito.Cambio_de_Emisora(true);
						emisorapre=Carrito.getEmisora();
							if (emisorapre>=1620)
							{
								emisorapre=530;
							}
							
						emisora=String.valueOf(emisorapre);
						PANTALLA.setText(emisora);
					}
				
					if (am_fm==true)
					{
						emisorapreAm=emisorapreAm+0.2;
						if (emisorapreAm>=108.1)
						{
							emisorapreAm=87.9;
						}
						
						emisora=String.valueOf(f.format(emisorapreAm));
						PANTALLA.setText(emisora);
					}
				}	
				
				
			}
		});
		
		//Listener GE
		GE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (on__off==true)
				{
					if (am_fm==false)
					{
						memorias[memoria]=Carrito.getEmisora();
						memoriasAF[memoria]=false;
					}	
					else
					{
						memorias[memoria]=emisorapreAm;	
						memoriasAF[memoria]=true;
					}
				}
				
			}
		});
		
	//Listener G1
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (on__off==true)
				{	
					memoria=0;
					memory=String.valueOf(memoria+1);
					PANTALLA4.setText(memory);
					
					emisora=String.valueOf(f.format(memorias[memoria]));
					PANTALLA.setText(emisora);
					am_fm=memoriasAF[memoria];
					if (am_fm==false)
					{
						PANTALLA3.setText(" FM");
					}
					else
					{
						PANTALLA3.setText(" AM");
					}
				}
			}
		});
		
		//Listener G2
				G2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
					{
					memoria=1;
					memory=String.valueOf(memoria+1);
					PANTALLA4.setText(memory);
					emisora=String.valueOf(f.format(memorias[memoria]));
					PANTALLA.setText(emisora);
					am_fm=memoriasAF[memoria];
					if (am_fm==false)
					{
						PANTALLA3.setText(" FM");
					}
					else
					{
						PANTALLA3.setText(" AM");
					}
					}
					}
				});
	
		//Listener G3
		G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on__off==true)
			{
			memoria=2;
			memory=String.valueOf(memoria+1);
			PANTALLA4.setText(memory);
			emisora=String.valueOf(f.format(memorias[memoria]));
			PANTALLA.setText(emisora);
			am_fm=memoriasAF[memoria];
			if (am_fm==false)
			{
				PANTALLA3.setText(" FM");
			}
			else
			{
				PANTALLA3.setText(" AM");
			}
			}
				
			}
		});
		
		//Listener G4
		G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{	
				memoria=3;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
					{
						PANTALLA3.setText(" FM");
					}
				else
					{
						PANTALLA3.setText(" AM");
					
					}
			}	
			}
		});
		
		
		//Listener G5
		G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{	
			memoria=4;
			memory=String.valueOf(memoria+1);
			PANTALLA4.setText(memory);
			emisora=String.valueOf(f.format(memorias[memoria]));
			PANTALLA.setText(emisora);
			am_fm=memoriasAF[memoria];
			if (am_fm==false)
			{
				PANTALLA3.setText(" FM");
			}
			else
			{
				PANTALLA3.setText(" AM");
			}
			
				
			}	
			}
		});
		
		//Listener G6
		G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{
			memoria=5;
			memory=String.valueOf(memoria+1);
			PANTALLA4.setText(memory);
			emisora=String.valueOf(f.format(memorias[memoria]));
			PANTALLA.setText(emisora);
			am_fm=memoriasAF[memoria];
			if (am_fm==false)
			{
				PANTALLA3.setText(" FM");
			}
			else
			{
				PANTALLA3.setText(" AM");
			}
	
			}
				
			}
		});
		
		
	//Listener G7
			G7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				memoria=6;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}				
					
				}	
				}
			});
			
			
			
			//Listener G8
			G8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (on__off==true)
				{
				memoria=7;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}
				
					
				}
				}
			});
				
			
			//Listener G9
			G9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				memoria=8;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);	
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}
				
					
				}
				}
			});
			
			
			//Listener G10
			G10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				memoria=9;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}
				
				}
				}
			});
			
			
			//Listener G11
			G11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
					if (on__off==true)
				{
				
				memoria=10;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}
					
				}
				}
			});
			
			
			//Listener G12
			G12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				if (on__off==true)
				{
				memoria=11;
				memory=String.valueOf(memoria+1);
				PANTALLA4.setText(memory);
				emisora=String.valueOf(f.format(memorias[memoria]));
				PANTALLA.setText(emisora);	
				am_fm=memoriasAF[memoria];
				if (am_fm==false)
				{
					PANTALLA3.setText(" FM");
				}
				else
				{
					PANTALLA3.setText(" AM");
				}
				}	
				}
			});
			
	}
}
