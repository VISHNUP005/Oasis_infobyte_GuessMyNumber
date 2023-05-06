package guesspackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField user_number;
	JLabel display_guess;
	JLabel finaL_result;
	JLabel Attempts;
	int required_number;
	JLabel Highscoredisplay;

	
	
	
	public void resetmethod() {
		display_guess.setText("");
		finaL_result.setText("");
		 Attempts.setText("15");
		 user_number.setText("");
		 contentPane.setBackground(new Color(0, 0, 0));
		 required_number=generate();
		 System.out.println("After reset new number is"+" "+required_number);
		
		
	}
	public int generate() {
		 int newnumber=(int) (Math.random()*100);
			System.out.println(newnumber);
			return newnumber;
		
		
	}
	public void startgame(int required) {
		int usernumber=Integer.parseInt(user_number.getText());
		System.out.println(usernumber);
		String attempt1;
		int required_number=required;
		
		if(usernumber!=required_number) {
		
			 int attemptrem=Integer.parseInt(Attempts.getText());
			 attemptrem--;
			 if(attemptrem==0) {
				 
				 finaL_result.setText("You Lost!!");
				 
				 contentPane.setBackground(new Color(220, 20, 60));
				 
			 }
			 attempt1=Integer.toString(attemptrem);
			 Attempts.setText(attempt1);
			 
		}
		if(usernumber==required_number) {
			display_guess.setForeground(new Color(0, 0, 205));
			display_guess.setText("The Required Number was"+" "+required_number+"!");
			finaL_result.setText("You Win!!");
			String attemptrem=Attempts.getText();
			Highscoredisplay.setText(attemptrem);
			contentPane.setBackground(new Color(152, 251, 152));
			
			
		}
		
		if(usernumber>required_number) {
			display_guess.setHorizontalAlignment(SwingConstants.LEFT);
			 display_guess.setText("Your Guess is higher!");
			 display_guess.setForeground(new Color(0, 0, 205));
			
		}
		if(usernumber<required_number) {
			display_guess.setText("Your Guess is Lower!");
			display_guess.setForeground(new Color(152, 251, 152));
		}
		
		
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user_number = new JTextField();
		user_number.setHorizontalAlignment(SwingConstants.CENTER);
		user_number.setFont(new Font("Times New Roman", Font.BOLD, 28));
		user_number.setBounds(245, 123, 389, 58);
		contentPane.add(user_number);
		user_number.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("HIGH SCORE:");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 26));
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setBounds(639, 22, 183, 37);
		contentPane.add(lblNewLabel);
		
		Highscoredisplay = new JLabel("0");
		Highscoredisplay.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		Highscoredisplay.setForeground(new Color(255, 255, 224));
		Highscoredisplay.setBounds(832, 14, 46, 52);
		contentPane.add(Highscoredisplay);
		
		JButton check_btn = new JButton("CHECK");
		required_number=(int) (Math.random()*100);
		System.out.println("Reqired number:"+" "+required_number);
		check_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 startgame(required_number);
			
			}
		});
		check_btn.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		check_btn.setBackground(new Color(169, 169, 169));
		check_btn.setForeground(new Color(75, 0, 130));
		check_btn.setBounds(367, 260, 149, 37);
		contentPane.add(check_btn);
		
		JLabel lblAttemptsLeft = new JLabel("ATTEMPTS LEFT:");
		lblAttemptsLeft.setForeground(new Color(224, 255, 255));
		lblAttemptsLeft.setFont(new Font("Verdana", Font.ITALIC, 26));
		lblAttemptsLeft.setBounds(25, 22, 239, 37);
		contentPane.add(lblAttemptsLeft);
		
		 Attempts = new JLabel("15");
		Attempts.setForeground(new Color(255, 255, 224));
		Attempts.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		Attempts.setBounds(259, 14, 46, 52);
		contentPane.add(Attempts);
		
		 display_guess = new JLabel("");
		display_guess.setFont(new Font("Tahoma", Font.BOLD, 35));
		display_guess.setHorizontalAlignment(SwingConstants.LEFT);
		display_guess.setForeground(new Color(178, 34, 34));
		display_guess.setBounds(211, 339, 611, 43);
		contentPane.add(display_guess);
		
		 finaL_result = new JLabel("");
		finaL_result.setHorizontalAlignment(SwingConstants.CENTER);
		finaL_result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 36));
		finaL_result.setBackground(new Color(0, 255, 255));
		finaL_result.setForeground(new Color(0, 0, 128));
		finaL_result.setBounds(271, 393, 368, 58);
		contentPane.add(finaL_result);
		
		JButton Restart = new JButton("RESTART");
		
		
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resetmethod();
				
			
				
			}
		});
		Restart.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Restart.setBackground(new Color(192, 192, 192));
		Restart.setForeground(new Color(255, 69, 0));
		Restart.setBounds(684, 137, 115, 37);
		contentPane.add(Restart);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the number Less Than 100");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setBounds(232, 86, 417, 26);
		contentPane.add(lblNewLabel_1);
	}
}
