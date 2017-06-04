package VInicial;




import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Label;
import java.awt.Color;
import java.sql.Connection;

public class VPrincipal extends JFrame {

	private JLayeredPane contentPane;

	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 489);
		contentPane = new JLayeredPane();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Salir del Sistema");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnNewButton.setBounds(476, 385, 135, 34);
		contentPane.add(btnNewButton);
		
		JButton btnVenderPizza = new JButton("Vender Pizza");
		btnVenderPizza.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			final VenderPizzas windows4 = new VenderPizzas();
                        windows4.setSize(640, 500);
                        windows4.setLocationRelativeTo(null);
                        windows4.setDefaultCloseOperation(windows4.EXIT_ON_CLOSE);
			windows4.setVisible(true);
		}
		});
		btnVenderPizza.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnVenderPizza.setBounds(119, 259, 200, 50);
		contentPane.add(btnVenderPizza);
		
		JButton btnNewButton_1 = new JButton("Agregar Pizza");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final AltaPizzas window2 = new AltaPizzas();
                                window2.setSize(500, 550);
                            window2.setLocationRelativeTo(null);
                            window2.setDefaultCloseOperation(window2.EXIT_ON_CLOSE);
				window2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(433, 137, 200, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnVerInventario = new JButton("Ver Inventario");
		btnVerInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final InventarioPizzas windows3 = new InventarioPizzas();
				windows3.setSize(500, 500);
                        windows3.setLocationRelativeTo(null);
                        windows3.setDefaultCloseOperation(windows3.EXIT_ON_CLOSE);
                                windows3.setVisible(true);
			}
		});
		btnVerInventario.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnVerInventario.setBounds(119, 137, 200, 50);
		contentPane.add(btnVerInventario);
		
		JButton btnCorteDeVentas = new JButton("Corte de Ventas");
		btnCorteDeVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Ventas windows5 = new Ventas();
                                windows5.setSize(470, 400);
                        windows5.setLocationRelativeTo(null);
                        windows5.setDefaultCloseOperation(windows5.EXIT_ON_CLOSE);
				windows5.setVisible(true);
			}
		});
		btnCorteDeVentas.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnCorteDeVentas.setBounds(433, 259, 200, 50);
		contentPane.add(btnCorteDeVentas);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/pizzaicon.png")));
		label.setBounds(118, 11, 493, 115);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/inventario.png")));
		lblNewLabel.setBounds(27, 117, 82, 87);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/venta.jpg")));
		lblNewLabel_1.setBounds(27, 247, 82, 73);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/agregar.png")));
		lblNewLabel_2.setBounds(342, 137, 94, 67);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/corte.png")));
		lblNewLabel_3.setBounds(342, 247, 99, 87);
		contentPane.add(lblNewLabel_3);
		
		JButton btnServidor = new JButton("Servidor TEST");
		btnServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConectorBD cc= new ConectorBD();
			    Connection cn = cc.conexion();
			    if(cn==null)
			    {   
			        JOptionPane.showMessageDialog(null, "No conectado");
			    }
			    else
			    {
			        JOptionPane.showMessageDialog(null, "conectado");
			    }
				
				
			}
		});
		btnServidor.setBounds(140, 381, 154, 43);
		contentPane.add(btnServidor);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(VPrincipal.class.getResource("/Imagenes/database.jpg")));
		lblNewLabel_4.setBounds(48, 350, 82, 89);
		contentPane.add(lblNewLabel_4);
		
		
			
			
		
	}
}
