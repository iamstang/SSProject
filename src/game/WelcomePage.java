package game;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class WelcomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(42, 42, 42));
	   	frame.setResizable(false);
     	frame.setUndecorated(true);
   
		frame.setBounds(100, 100, 240, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		try {
//			BufferedImage img = ImageIO.read(new File("src/assets/bg-select-page.png"));
//		     JLabel label = new JLabel(new ImageIcon(img));
//		     label.setBackground(UIManager.getColor("Button.darkShadow"));
//		     frame.setContentPane(label);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		JLabel lblRobotRun = new JLabel("");
		lblRobotRun.setIcon(new ImageIcon(ChooseCharacterWindow.class.getResource("/assets/title.gif")));
		lblRobotRun.setHorizontalAlignment(SwingConstants.CENTER);
		lblRobotRun.setFont(new Font("Humanoid", Font.PLAIN, 30));
		lblRobotRun.setBounds(6, 30, 228, 45);
		frame.getContentPane().add(lblRobotRun);
		
		JButton btnStart = new JButton("");
		btnStart.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/startText.gif")));
		btnStart.setOpaque(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseCharacterWindow startGame = new ChooseCharacterWindow();
				startGame.main(null);
				frame.dispose();
				
			}
		});
		btnStart.setBounds(19, 120, 195, 47);
		frame.getContentPane().add(btnStart);
		
		
		JButton btnIns = new JButton("");
		btnIns.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/instruc.gif")));
		btnIns.setOpaque(false);
		btnIns.setContentAreaFilled(false);
		btnIns.setBorderPainted(false);
		btnIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instruction ins = new Instruction();
				ins.main(null);
			}
		});
		btnIns.setBounds(19, 170, 195, 47);
		frame.getContentPane().add(btnIns);
		
<<<<<<< HEAD
=======
		JButton btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/exit.gif")));
		btnExit.setOpaque(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(19, 220, 195, 47);
		frame.getContentPane().add(btnExit);
		
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		
	}
}
