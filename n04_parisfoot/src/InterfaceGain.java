import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class InterfaceGain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_13;
	private Saisons saisons;
	private int numMatchEnCours;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGain frame = new InterfaceGain();
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
	public InterfaceGain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(0, 0, 51));
		panel_6.setBackground(new Color(204, 204, 204));
		panel.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("Tous");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		panel_6.add(lblNewLabel);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JLabel lblNewLabel_1 = new JLabel("Cash ");
		panel_7.add(lblNewLabel_1);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		
		JLabel lblNewLabel_2 = new JLabel("En cours");
		panel_8.add(lblNewLabel_2);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		
		JLabel lblNewLabel_3 = new JLabel("Termin\u00E9s");
		panel_9.add(lblNewLabel_3);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		
		JLabel lblNewLabel_4 = new JLabel("Gagn/Perd");
		panel_10.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 204));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_2.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_2.add(panel_20);
		
		JLabel lblNewLabel_12 = new JLabel("Prd");
		panel_20.add(lblNewLabel_12);
		
		JPanel panel_21 = new JPanel();
		panel_2.add(panel_21);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel.add(panel_5);
		
		JPanel panel_11 = new JPanel();
		contentPane.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(204, 204, 204));
		panel_12.setForeground(new Color(204, 204, 153));
		panel_11.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_6 = new JLabel("Eqp 1 - Eqp 2");
		panel_12.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(51, 153, 204));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		panel_12.add(lblNewLabel_5);
		
		JPanel panel_13 = new JPanel();
		panel_11.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_13.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_7 = new JLabel("Date");
		panel_16.add(lblNewLabel_7, BorderLayout.WEST);
		lblNewLabel_7.setForeground(new Color(51, 153, 204));
		
		JPanel panel_17 = new JPanel();
		panel_17.setOpaque(false);
		panel_13.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_13.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_8 = new JLabel("R\u00E9sultat match");
		panel_18.add(lblNewLabel_8);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setForeground(new Color(0, 0, 51));
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Mise totale :");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		panel_14.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setForeground(Color.YELLOW);
		textField.setBackground(Color.DARK_GRAY);
		textField.setText("");
		panel_14.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gains potentiels :");
		lblNewLabel_10.setForeground(new Color(204, 204, 51));
		panel_14.add(lblNewLabel_10);
		
		lblNewLabel_13 = new JLabel("...");
		lblNewLabel_13.setForeground(new Color(204, 204, 102));
		panel_14.setForeground(Color.YELLOW);
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.add(lblNewLabel_13);
		
		JLabel lblNewLabel_11 = new JLabel("Ligue 1");
		lblNewLabel_11.setForeground(new Color(204, 204, 102));
		panel_14.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("...");
		lblNewLabel_14.setForeground(Color.YELLOW);
		panel_14.add(lblNewLabel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_11.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_15.add(panel_28);
		
		JButton btnNewButton_4 = new JButton("C\u00F4te 1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicCote1();
				
			}
		});
		panel_28.add(btnNewButton_4);
		
		lblNewLabel_15 = new JLabel("Cote 1");
		panel_28.add(lblNewLabel_15);
		
		JPanel panel_22 = new JPanel();
		panel_15.add(panel_22);
		
		JPanel panel_24 = new JPanel();
		panel_15.add(panel_24);
		
		JButton btnNewButton_5 = new JButton("C\u00F4te N");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicCoteN();
				
			}
		});
		panel_24.add(btnNewButton_5);
		
		lblNewLabel_16 = new JLabel("Cote N");
		panel_24.add(lblNewLabel_16);
		
		JPanel panel_25 = new JPanel();
		panel_15.add(panel_25);
		
		JPanel panel_27 = new JPanel();
		panel_15.add(panel_27);
		
		JButton btnNewButton_6 = new JButton("C\u00F4te 2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicCote2();
				
			}
		});
		panel_27.add(btnNewButton_6);
		
		lblNewLabel_17 = new JLabel("Cote 2");
		panel_27.add(lblNewLabel_17);
		
		JPanel panel_23 = new JPanel();
		contentPane.add(panel_23, BorderLayout.SOUTH);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_23.add(panel_26, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\u2190");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicFlecheGauche();
			}

			private void clicFlecheGauche() {
				// TODO Auto-generated method stub
				numMatchEnCours --;
				afficherMatch(numMatchEnCours);
			}
		});
		panel_26.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("GO");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicGo();
				
			}
		});
		panel_26.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u2192");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicFlecheDroite();
			}
		});
		panel_26.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("CASH ");
		panel_23.add(btnNewButton, BorderLayout.EAST);
		btnNewButton.setBackground(new Color(204, 204, 153));
		btnNewButton.setForeground(new Color(102, 153, 204));
	}

	protected void clicFlecheDroite() {
		// TODO Auto-generated method stub
		numMatchEnCours ++;
		afficherMatch(numMatchEnCours);
	}
	
	protected void clicCote1() {
		saisons = new Saisons();
		Match m = saisons.getMatchs().get(numMatchEnCours);
		saisons.calculCotes(m);
		double c1 = m.getCotes().getCote1();
		afficherGain(c1, m);
	}
	
	protected void clicCote2() {
		saisons = new Saisons();
		Match m = saisons.getMatchs().get(numMatchEnCours);
		saisons.calculCotes(m);
		double c2 = m.getCotes().getCote2();
		afficherGain(c2, m);
	}
	
	protected void clicCoteN() {
		saisons = new Saisons();
		Match m = saisons.getMatchs().get(numMatchEnCours);
		saisons.calculCotes(m);
		double cN = m.getCotes().getCoteN();
		afficherGain(cN, m);
	}
	
	
	private void afficherGain(double cote, Match m) {
		m = saisons.getMatchs().get(numMatchEnCours);
		saisons.calculCotes(m);
		double gain;
		double mise = Double.valueOf(textField.getText());
		gain = cote*mise;
		gain = Math.round(gain*10000.0)/10000.0;
		String gains = String.valueOf(gain);
		lblNewLabel_13.setText(gains);
		lblNewLabel_8.setText(m.getEquipe1().getNom() + " " +m.getButsEquipe1()+ " - " + m.getButsEquipe2()+ " " +m.getEquipe2().getNom());
	}

	protected void clicGo() {
		// TODO Auto-generated method stub
		saisons = new Saisons();
		int nombreAleatoire = 0 + (int)(Math.random() * (4760 + 1));
		numMatchEnCours = nombreAleatoire;
		afficherMatch(numMatchEnCours);
	}

	private void afficherMatch(int numMatchEnCours) {
		// TODO Auto-generated method stub
		Match m = saisons.getMatchs().get(numMatchEnCours);
		saisons.calculCotes(m);
		lblNewLabel_6.setText(m.getEquipe1().getNom()+" - "+m.getEquipe2().getNom());
		lblNewLabel_7.setText(m.getDate());
		
		double c1 = m.getCotes().getCote1();
		String cote1 = String.valueOf(c1);
		lblNewLabel_15.setText(cote1);
		
		double cN;
		cN = m.getCotes().getCoteN();
		String coteN = String.valueOf(cN);
		lblNewLabel_16.setText(coteN);
		
		double c2;
		c2 = m.getCotes().getCote2();
		String cote2 = String.valueOf(c2);
		lblNewLabel_17.setText(cote2);
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}
	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}
	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}
	public JLabel getlblNewLabel_16() {
		return lblNewLabel_16;
	}
	public JLabel getlblNewLabel_15() {
		return lblNewLabel_15;
	}
	public JLabel getlblNewLabel_17() {
		return lblNewLabel_17;
	}
	public JLabel getlblNewLabel_13() {
		return lblNewLabel_13;
	}
}
