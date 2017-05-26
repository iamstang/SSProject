package game;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;

public class Instruction {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void runInstruction() {


					frame.setVisible(true);
			
	}

	/**
	 * Create the application.
	 */
	public Instruction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		 frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	frame.setResizable(false);
   

 		frame.setBounds(100, 100, 640, 480);
 		frame.getContentPane().setLayout(null);
 		 try {
	    
	            BufferedImage img = ImageIO.read(getClass().getResource("/assets/bg-instruction.png"));
	            frame.setContentPane(new JLabel(new ImageIcon(img)));
	           
	   
	        } catch (Exception exp) {
	            exp.printStackTrace();
	        }
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(Instruction.class.getResource("/assets/back.gif")));
		btnBack.setBounds(488, 389, 131, 42);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		frame.getContentPane().add(btnBack);
	}
}
