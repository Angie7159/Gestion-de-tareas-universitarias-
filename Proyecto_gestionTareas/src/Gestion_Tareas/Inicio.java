package Gestion_Tareas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Gestion De Tareas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/img/icons8-list-64.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 478);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnMaterias = new JMenu("Materias");
		menuBar.add(mnMaterias);
		
		JMenuItem mntmMaterias = new JMenuItem("Ver materias");
		mntmMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// para que me envie a la ventana nota
                Materias in = new Materias();
                in.setVisible(true);
                // para que se cierre la ventana inicio y solo aparesca la ventana notas
                dispose();
			}
		});
		mnMaterias.add(mntmMaterias);
		
		JMenu mnEvento = new JMenu("Evento");
		menuBar.add(mnEvento);
		
		JMenuItem mntmEvento = new JMenuItem("Ver evento");
		mnEvento.add(mntmEvento);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBackground(new Color(255, 255, 255));
		panelGeneral.setBounds(0, 0, 542, 417);
		contentPane.add(panelGeneral);
		panelGeneral.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLATAFORMAS ");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblNewLabel.setBounds(216, 70, 103, 29);
		panelGeneral.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 542, 148);
		panelGeneral.add(lblFondo);
		lblFondo.setIcon(new ImageIcon(Inicio.class.getResource("/img/horinzontal.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(322, 159, 138, 132);
		panelGeneral.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Inicio.class.getResource("/img/notas1.jpg")));
		
		JButton btnsSistemaAcademico = new JButton("INGRESAR");
		btnsSistemaAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// para que me envie a la ventana nota
                Nota in = new Nota();
                in.setVisible(true);
                // para que se cierre la ventana inicio y solo aparesca la ventana notas
                dispose();
			}
		});
		btnsSistemaAcademico.setBackground(new Color(189, 225, 223));
		btnsSistemaAcademico.setBounds(342, 302, 103, 23);
		panelGeneral.add(btnsSistemaAcademico);
		
		JLabel lblNewLabel_2 = new JLabel("Sistema Academico");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel_2.setBounds(323, 336, 152, 23);
		panelGeneral.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Espacio para que");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(353, 358, 103, 14);
		panelGeneral.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("pongas tus apuntes");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(357, 375, 103, 14);
		panelGeneral.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Inicio.class.getResource("/img/tareas5.jpg")));
		lblNewLabel_5.setBounds(89, 159, 138, 138);
		panelGeneral.add(lblNewLabel_5);
		
		JButton btnsCreaTarea = new JButton("INGRESAR");
		btnsCreaTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// para que me envie a la ventana TAREAS
                Tareas ta = new Tareas();
                ta.setVisible(true);
                // para que se cierre la ventana inicio y solo aparesca la ventana tareas
                dispose();
			}
		});
		btnsCreaTarea.setBackground(new Color(189, 225, 223));
		btnsCreaTarea.setBounds(99, 302, 103, 23);
		panelGeneral.add(btnsCreaTarea);
		
		JLabel lblNewLabel_6 = new JLabel("Crea tu Tarea");
		lblNewLabel_6.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblNewLabel_6.setBounds(109, 340, 91, 14);
		panelGeneral.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1 = new JLabel("Espacio personal para subir");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(94, 358, 133, 14);
		panelGeneral.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("tus tareas.");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_2.setBounds(142, 375, 71, 14);
		panelGeneral.add(lblNewLabel_3_2);
	}
}

