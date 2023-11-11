package Gestion_Tareas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreUsuario;
	private JTextField textContraseña;
	private JTextField textNombreCompleto;
	private JTextField textCorreo;
	private JTextField textTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuario.class.getResource("/img/icons8-user-16.png")));
		setTitle("Iniciar sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151, 225, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bienvenido Usuario");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblTitulo.setBounds(101, 11, 175, 33);
		contentPane.add(lblTitulo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(73, 193, 203));
		panel.setBounds(47, 82, 293, 366);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Usuario*");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(11, 11, 102, 17);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		panel.add(lblNewLabel_1);
		
		textNombreUsuario = new JTextField();
		textNombreUsuario.setBounds(11, 39, 255, 20);
		textNombreUsuario.setColumns(10);
		panel.add(textNombreUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña*");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setBounds(11, 70, 73, 17);
		lblContrasea.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		panel.add(lblContrasea);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(11, 98, 255, 20);
		textContraseña.setColumns(10);
		panel.add(textContraseña);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo*");
		lblNombreCompleto.setForeground(new Color(255, 255, 255));
		lblNombreCompleto.setBounds(11, 129, 111, 17);
		lblNombreCompleto.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		panel.add(lblNombreCompleto);
		
		textNombreCompleto = new JTextField();
		textNombreCompleto.setBounds(11, 157, 255, 20);
		textNombreCompleto.setColumns(10);
		panel.add(textNombreCompleto);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico*");
		lblCorreoElectronico.setForeground(new Color(255, 255, 255));
		lblCorreoElectronico.setBounds(11, 188, 115, 17);
		lblCorreoElectronico.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		panel.add(lblCorreoElectronico);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(11, 216, 255, 20);
		textCorreo.setColumns(10);
		panel.add(textCorreo);
		
		JLabel lblNumeroDeTelefono = new JLabel("Numero de Telefono*");
		lblNumeroDeTelefono.setForeground(new Color(255, 255, 255));
		lblNumeroDeTelefono.setBounds(11, 247, 122, 17);
		lblNumeroDeTelefono.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		panel.add(lblNumeroDeTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(11, 275, 255, 20);
		textTelefono.setColumns(10);
		panel.add(textTelefono);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// para que me envie a la ventana inicio
                Inicio in = new Inicio();
                in.setVisible(true);
                // para que se cierre la ventana usuario y solo aparesca la ventana inicio
                dispose();
			}
		});
		btnIngresar.setForeground(new Color(255, 255, 255));
		btnIngresar.setBackground(new Color(99, 185, 203));
		btnIngresar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btnIngresar.setBounds(89, 313, 111, 30);
		panel.add(btnIngresar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(163, 33, 48, 48);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/img/user_inicio.png")));
	}
}
