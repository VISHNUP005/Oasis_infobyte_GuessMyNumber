package guesspackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guessmynumber extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guessmynumber frame = new Guessmynumber();
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
	public Guessmynumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 326);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess My Number!!");
		lblNewLabel.setBounds(49, 35, 347, 47);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel);
		
		JButton startbtn = new JButton("Start ");
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game de=new Game();
				de.setVisible(true);
			}
		});
		startbtn.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		startbtn.setBackground(new Color(169, 169, 169));
		startbtn.setForeground(new Color(173, 255, 47));
		startbtn.setBounds(170, 135, 89, 23);
		contentPane.add(startbtn);
	}
}
