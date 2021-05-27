import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parieur extends JFrame {

	private JPanel contentPane;
	private JTextField txtRechercherUnPari;
	private JTextField txtCte;
	private JTextField txtCte_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parieur frame = new Parieur();
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
	public Parieur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Dbt match");
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_3.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_12.add(panel_15);
		
		JButton btnNewButton_1 = new JButton("\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_12.add(btnNewButton_1);
		
		JPanel panel_17 = new JPanel();
		panel_12.add(panel_17);
		
		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14);
		
		JPanel panel_16 = new JPanel();
		panel.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_18.setOpaque(false);
		panel_16.add(panel_18);
		
		txtRechercherUnPari = new JTextField();
		panel_16.add(txtRechercherUnPari);
		txtRechercherUnPari.setForeground(Color.WHITE);
		txtRechercherUnPari.setBackground(Color.DARK_GRAY);
		txtRechercherUnPari.setText("rechercher un pari...");
		txtRechercherUnPari.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 5, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Rslt match");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_1.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_7.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("1");
		panel_20.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		
		txtCte = new JTextField();
		txtCte.setText("C\u00F4te 1");
		panel_7.add(txtCte);
		txtCte.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_6.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel(" 2");
		panel_19.add(lblNewLabel_2);
		
		txtCte_1 = new JTextField();
		txtCte_1.setText("C\u00F4te 2");
		txtCte_1.setColumns(10);
		panel_6.add(txtCte_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_8.setOpaque(false);
		contentPane.add(panel_8, BorderLayout.NORTH);
		
		JPanel panel_13 = new JPanel();
		panel_13.setOpaque(false);
		contentPane.add(panel_13, BorderLayout.SOUTH);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("\u21E8");
		panel_13.add(btnNewButton, BorderLayout.EAST);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
	}

}
