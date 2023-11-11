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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Materias extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatematica;
	private JTextField txtComunicacion;
	private JTextField textCodigoMA;
	private JTextField textHorarioMA;
	private JTextField textProfesorMA;
	private JTextField textCodigoCO;
	private JTextField textHorarioCO;
	private JTextField textProfesorCO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Materias frame = new Materias();
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
	public Materias() {
		setTitle("Materia");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Materias.class.getResource("/img/cursos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMatematica = new JPanel();
		panelMatematica.setBackground(new Color(223, 134, 156));
		panelMatematica.setBounds(38, 58, 181, 206);
		contentPane.add(panelMatematica);
		panelMatematica.setLayout(null);
		
		JLabel codigo = new JLabel("Codigo:");
		codigo.setForeground(new Color(255, 255, 255));
		codigo.setBounds(10, 26, 54, 14);
		panelMatematica.add(codigo);
		
		textCodigoMA = new JTextField();
		textCodigoMA.setBounds(65, 23, 106, 20);
		panelMatematica.add(textCodigoMA);
		textCodigoMA.setColumns(10);
		
		JLabel horario = new JLabel("Horario :");
		horario.setForeground(Color.WHITE);
		horario.setBounds(10, 54, 64, 14);
		panelMatematica.add(horario);
		
		textHorarioMA = new JTextField();
		textHorarioMA.setColumns(10);
		textHorarioMA.setBounds(75, 54, 96, 20);
		panelMatematica.add(textHorarioMA);
		
		JLabel profesor = new JLabel("Profesor:");
		profesor.setForeground(Color.WHITE);
		profesor.setBounds(10, 88, 64, 14);
		panelMatematica.add(profesor);
		
		textProfesorMA = new JTextField();
		textProfesorMA.setColumns(10);
		textProfesorMA.setBounds(85, 85, 86, 20);
		panelMatematica.add(textProfesorMA);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Materias.class.getResource("/img/matematica.png")));
		lblNewLabel_1.setBounds(58, 116, 64, 71);
		panelMatematica.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel.setBounds(21, 11, 93, 24);
		contentPane.add(lblNewLabel);
		
		txtMatematica = new JTextField();
		txtMatematica.setBackground(new Color(245, 167, 197));
		txtMatematica.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatematica.setText("MATEMATICA");
		txtMatematica.setEditable(false);
		txtMatematica.setBounds(38, 263, 181, 24);
		contentPane.add(txtMatematica);
		txtMatematica.setColumns(10);
		
		JPanel panelComunicacion = new JPanel();
		panelComunicacion.setBackground(new Color(234, 230, 176));
		panelComunicacion.setBounds(280, 58, 188, 206);
		contentPane.add(panelComunicacion);
		panelComunicacion.setLayout(null);
		
		JLabel codigo_1 = new JLabel("Codigo:");
		codigo_1.setForeground(new Color(0, 0, 0));
		codigo_1.setBounds(10, 26, 69, 14);
		panelComunicacion.add(codigo_1);
		
		textCodigoCO = new JTextField();
		textCodigoCO.setColumns(10);
		textCodigoCO.setBounds(72, 23, 106, 20);
		panelComunicacion.add(textCodigoCO);
		
		JLabel horario_1 = new JLabel("Horario :");
		horario_1.setForeground(new Color(0, 0, 0));
		horario_1.setBounds(10, 54, 69, 14);
		panelComunicacion.add(horario_1);
		
		textHorarioCO = new JTextField();
		textHorarioCO.setColumns(10);
		textHorarioCO.setBounds(82, 54, 96, 20);
		panelComunicacion.add(textHorarioCO);
		
		JLabel profesor_1 = new JLabel("Profesor:");
		profesor_1.setForeground(new Color(0, 0, 0));
		profesor_1.setBounds(10, 88, 69, 14);
		panelComunicacion.add(profesor_1);
		
		textProfesorCO = new JTextField();
		textProfesorCO.setColumns(10);
		textProfesorCO.setBounds(92, 85, 86, 20);
		panelComunicacion.add(textProfesorCO);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Materias.class.getResource("/img/comunicacion.png")));
		lblNewLabel_2.setBounds(62, 123, 59, 59);
		panelComunicacion.add(lblNewLabel_2);
		
		txtComunicacion = new JTextField();
		txtComunicacion.setBackground(new Color(214, 189, 16));
		txtComunicacion.setText("COMUNICACION");
		txtComunicacion.setHorizontalAlignment(SwingConstants.CENTER);
		txtComunicacion.setEditable(false);
		txtComunicacion.setColumns(10);
		txtComunicacion.setBounds(280, 263, 188, 24);
		contentPane.add(txtComunicacion);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.setBackground(new Color(203, 248, 242));
		btnCreate.setBounds(209, 325, 89, 23);
		contentPane.add(btnCreate);
		
		JLabel lblNewLabel_3 = new JLabel("Solo puedes rellenar un curso");
		lblNewLabel_3.setBounds(183, 300, 181, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio in = new Inicio();
                in.setLocationRelativeTo(null);

                in.setVisible(true);
                dispose();

			}
		});
		btnNewButton.setBackground(new Color(203, 248, 242));
		btnNewButton.setBounds(10, 325, 89, 23);
		contentPane.add(btnNewButton);
	}

}
