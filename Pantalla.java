//Universidad Del Valle de Guatemala
//Algoritmos
//Erick Fernando Bautista Munoz 15192
//seccion 10
//11/7/2016



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Pantalla extends JFrame 
{

	private JPanel contentPane;
	private JTextField PANTALLA;
	private JTextField PANTALLA2;
	private JTextField PANTALLA3;
	private Radio Carrito;
	private String emisora;
	private double i,ii,iii,iv,v,vi,vii,viii,ix,x,xi,xii;
	private boolean on__off;
	private boolean am_fm;
	private String mensaje;
	private String mensaje2;
	

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */ 
	public Pantalla() 
	{
		
		i=510.00;
		ii=510.00;
		iii=510.00;
		iv=510.00;
		v=510.00;
		vi=510.00;
		vii=510.00;
		viii=510.00;
		ix=510.00;
		x=510.00;
		xi=510.00;
		xii=510.00;
		on__off=false;
		mensaje="OFF";
		mensaje2="FM";
		
		
		
		setResizable(false);
		setTitle("RADIO");
		emisora="80";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Carrito=new Consola();
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton ONOFF = new JButton("ON/OFF");
		ONOFF.setBounds(307, 11, 89, 23);
		panel.add(ONOFF);
		
		JButton AMFM = new JButton("AM/FM");
		AMFM.setBounds(208, 11, 89, 23);
		panel.add(AMFM);
		
		JButton IZQ = new JButton("<<");
		IZQ.setBounds(208, 45, 89, 23);
		panel.add(IZQ);
		
		JButton DER = new JButton(">>");
		DER.setBounds(307, 45, 89, 23);
		panel.add(DER);
		
		JButton G1 = new JButton("1");
		G1.setBounds(10, 113, 89, 23);
		panel.add(G1);
		
		JButton G2 = new JButton("2");
		G2.setBounds(109, 113, 89, 23);
		panel.add(G2);
		
		JButton G3 = new JButton("3");
		G3.setBounds(208, 113, 89, 23);
		panel.add(G3);
		
		JButton G4 = new JButton("4");
		G4.setBounds(307, 113, 89, 23);
		panel.add(G4);
		
		JButton G5 = new JButton("5");
		G5.setBounds(10, 147, 89, 23);
		panel.add(G5);
		
		JButton G6 = new JButton("6");
		G6.setBounds(109, 147, 89, 23);
		panel.add(G6);
		
		JButton G7 = new JButton("7");
		G7.setBounds(208, 147, 89, 23);
		panel.add(G7);
		
		JButton G8 = new JButton("8");
		G8.setBounds(307, 147, 89, 23);
		panel.add(G8);
		
		JButton G9 = new JButton("9");
		G9.setBounds(10, 181, 89, 23);
		panel.add(G9);
		
		JButton G10 = new JButton("10");
		G10.setBounds(109, 181, 89, 23);
		panel.add(G10);
		
		JButton G11 = new JButton("11");
		G11.setBounds(208, 181, 89, 23);
		panel.add(G11);
		
		JButton G12 = new JButton("12");
		G12.setBounds(307, 181, 89, 23);
		panel.add(G12);
		
		JButton GE = new JButton("GE");
		GE.setBounds(208, 79, 89, 23);
		panel.add(GE);
		
		PANTALLA = new JTextField();
		PANTALLA.setText("--------------------");
		PANTALLA.setEditable(false);
		PANTALLA.setBounds(14, 23, 184, 66);
		panel.add(PANTALLA);
		PANTALLA.setColumns(10);
		
		PANTALLA2 = new JTextField();
		PANTALLA2.setText("OFF");
		PANTALLA2.setEditable(false);
		PANTALLA2.setBounds(307, 79, 30, 23);
		panel.add(PANTALLA2);
		PANTALLA2.setColumns(10);
		
		PANTALLA3 = new JTextField();
		PANTALLA3.setText("FM");
		PANTALLA3.setEditable(false);
		PANTALLA3.setBounds(350, 79, 30, 23);
		panel.add(PANTALLA3);
		PANTALLA3.setColumns(10);
	
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
				mensaje="------------"; 
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
				Carrito.Cambio_de_Emisora(false);
				double emisorapre=Carrito.getEmisora();
				if (emisorapre>=1620)
				{
					emisorapre=510;
				}
				if (emisorapre<=510)
				{
					emisorapre=1620;
				}
				emisora=String.valueOf(emisorapre);
				PANTALLA.setText(emisora);
			}
			}
		});
		
		//Listener ADD
		DER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (on__off==true)
			{
				
				Carrito.Cambio_de_Emisora(true);
				
				emisora=String.valueOf(Carrito.getEmisora());
				PANTALLA.setText(emisora);
			}
			}
		});
		
		//Listener GE
		GE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (on__off==true)
			{
				
			}
				
			}
		});
		
	//Listener G1
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			if (on__off==true)
			{	
			
			}
			}
		});
		
		//Listener G2
				G2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
					{
						
						
					}
					}
				});
	
		//Listener G3
		G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on__off==true)
			{
				
				
			}
				
			}
		});
		
		//Listener G4
		G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{	
				
			}	
			}
		});
		
		
		//Listener G5
		G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{	
				
			}	
			}
		});
		
		//Listener G6
		G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (on__off==true)
			{



			}
				
			}
		});
		
		
	//Listener G7
			G7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				
				
					
				}	
				}
			});
			
			
			
			//Listener G8
			G8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (on__off==true)
				{
				
				
					
				}
				}
			});
				
			
			//Listener G9
			G9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				
				
					
				}
				}
			});
			
			
			//Listener G10
			G10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (on__off==true)
				{
				
				
					
				}
				}
			});
			
			
			//Listener G11
			G11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
					if (on__off==true)
				{
				
				
					
				}
				}
			});
			
			
			//Listener G12
			G12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				if (on__off==true)
				{
				
				
					
				}	
				}
			});
			
	}
}
