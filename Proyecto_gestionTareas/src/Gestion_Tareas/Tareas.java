package Gestion_Tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tareas extends JFrame {

	private JPanel contentPane;
	private JTextField textDescripcion;
	private JTextField textfechaVencimiento;
	private JTextField textEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tareas frame = new Tareas();
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
	public Tareas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tareas.class.getResource("/img/ta.png")));
		setTitle("Bienvenido a Tareas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 336);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion:");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 47, 86, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 186, 86, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Estado:");
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(236, 65, 55, 18);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("vencimiento:");
		lblNewLabel_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 202, 86, 18);
		contentPane.add(lblNewLabel_1_3);
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(10, 65, 186, 101);
		contentPane.add(textDescripcion);
		textDescripcion.setColumns(10);
		
		textfechaVencimiento = new JTextField();
		textfechaVencimiento.setBounds(106, 200, 102, 20);
		contentPane.add(textfechaVencimiento);
		textfechaVencimiento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tareas.class.getResource("/img/Tareas_2.jpg")));
		lblNewLabel_2.setBounds(352, 38, 145, 193);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(190, 233, 232));
		panel_1.setBounds(0, 44, 342, 242);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBackground(new Color(99, 203, 201));
		btnCrear.setBounds(157, 208, 89, 23);
		panel_1.add(btnCrear);
		
		textEstado = new JTextField();
		textEstado.setBounds(211, 47, 121, 23);
		panel_1.add(textEstado);
		textEstado.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(149, 219, 217));
		panel.setBounds(0, 0, 497, 29);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crea tu tarea");
		lblNewLabel.setBounds(205, 5, 87, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio in = new Inicio();
                in.setLocationRelativeTo(null);

                in.setVisible(true);
                dispose();

			}
		});
		btnRegresar.setBackground(new Color(99, 203, 201));
		btnRegresar.setBounds(381, 252, 89, 23);
		contentPane.add(btnRegresar);
	}
}
