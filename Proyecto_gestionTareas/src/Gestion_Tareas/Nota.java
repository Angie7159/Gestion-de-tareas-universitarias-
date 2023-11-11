package Gestion_Tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nota extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textContenidoNota;
	private JTextField textFechaCreacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nota frame = new Nota();
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
	public Nota() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Nota.class.getResource("/img/notas1.jpg")));
		setTitle("Tus notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(51, 67, 53, 14);
		contentPane.add(lblNewLabel_1);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(132, 66, 253, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contenido de");
		lblNewLabel_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(29, 121, 91, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("la nota:");
		lblNewLabel_1_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(51, 134, 53, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textContenidoNota = new JTextField();
		textContenidoNota.setBounds(133, 106, 253, 69);
		contentPane.add(textContenidoNota);
		textContenidoNota.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha de Creacion:");
		lblNewLabel_1_1_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(29, 203, 124, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textFechaCreacion = new JTextField();
		textFechaCreacion.setBounds(152, 202, 136, 20);
		contentPane.add(textFechaCreacion);
		textFechaCreacion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(196, 228, 194));
		panel_1.setBounds(20, 50, 381, 228);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(136, 208, 147));
		btnEnviar.setBounds(247, 194, 89, 23);
		panel_1.add(btnEnviar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio in = new Inicio();
                in.setLocationRelativeTo(null);

                in.setVisible(true);
                dispose();

			}
		});
		btnRegresar.setBackground(new Color(136, 208, 147));
		btnRegresar.setBounds(62, 194, 113, 23);
		panel_1.add(btnRegresar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 201, 133));
		panel.setBounds(0, 11, 423, 28);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO A TUS NOTAS");
		lblNewLabel.setBounds(102, 0, 194, 28);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	}

}
