package game;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class GameOver {

	private JFrame frame;
	private String name;
	private int score;

	/**
	 * Launch the application.
	 */
	public void runGameOver() {
	
					frame.setVisible(true);
					
			
	}

	/**
	 * Create the application.
	 */
	public GameOver(String name, int score) {
	
		this.name = name;
		this.score = score;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(42, 42, 42));
		frame.getContentPane().setLayout(null);
		
		JButton btnPlayAgain = new JButton("");
		btnPlayAgain.setIcon(new ImageIcon(getClass().getResource("/assets/again.gif")));
		btnPlayAgain.setHorizontalAlignment(SwingConstants.CENTER);
		btnPlayAgain.setBounds(6, 138, 228, 48);
		btnPlayAgain.setOpaque(false);
		btnPlayAgain.setContentAreaFilled(false);
		btnPlayAgain.setBorderPainted(false);
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseCharacterWindow window = new ChooseCharacterWindow();
				window.runCustomize();
				frame.dispose();
				
			}
		});
	
		frame.getContentPane().add(btnPlayAgain);
		
		JButton btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(getClass().getResource("/assets/exit.gif")));
		btnExit.setHorizontalAlignment(SwingConstants.CENTER);
		btnExit.setBounds(6, 197, 228, 48);
		btnExit.setOpaque(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		frame.getContentPane().add(btnExit);
		
		JLabel nameLabel = new JLabel(name);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("Humanoid", Font.PLAIN, 28));
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setBounds(6, 19, 228, 42);
		frame.getContentPane().add(nameLabel);
		
		JLabel scoreLabel = new JLabel("Score : " + score);
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setForeground(Color.WHITE);
		scoreLabel.setFont(new Font("Humanoid", Font.PLAIN, 28));
		scoreLabel.setBounds(6, 73, 228, 42);
		frame.getContentPane().add(scoreLabel);
		frame.setBackground(new Color(42, 42, 42));
		frame.setBounds(100, 100, 240, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
