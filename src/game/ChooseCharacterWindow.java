package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ChooseCharacterWindow {

	private JFrame frame;
	private JTextField textField;
	ChooseCharacterController controller;
	
	JLabel bodyNameLabel;
	JLabel legNameLabel;
	JLabel headNameLabel;
	
	JLabel headLabel = new JLabel(""), bodyLabel = new JLabel(""), legLabel = new JLabel(""); 
	
	
	JPanel headPanel;
	JPanel bodyPanel;
	JPanel legPanel;
	
	
	JButton prevHeadButton , nextHeadButton , prevLegButton , nextLegButton , prevBodyButton , nextBodyButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseCharacterWindow window = new ChooseCharacterWindow();
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
	public ChooseCharacterWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(42, 42, 42));
		frame.setBounds(100, 100, 240, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGo = new JButton("");
		btnGo.setBounds(6, 230, 228, 47);
		frame.getContentPane().add(btnGo);
		btnGo.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/go.gif")));
		btnGo.setOpaque(false);
		btnGo.setContentAreaFilled(false);
		btnGo.setBorderPainted(false);
		
		headPanel = new JPanel();
		headPanel.setOpaque(false);
	
		headPanel.setBounds(31, 98, 50, 50);
		frame.getContentPane().add(headPanel);
		headPanel.add(headLabel);
		
		bodyPanel = new JPanel();
		bodyPanel.setOpaque(false);
		bodyPanel.setBounds(6, 151, 100, 40);
		frame.getContentPane().add(bodyPanel);
		bodyPanel.add(bodyLabel);
		
		legPanel = new JPanel();
		legPanel.setOpaque(false);
		legPanel.setBounds(31, 193, 50, 20);
		frame.getContentPane().add(legPanel);
		legPanel.add(legLabel);
		
		prevHeadButton = new JButton("");
		prevHeadButton.setBounds(114, 127, 20, 20);
		prevHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
		prevHeadButton.setOpaque(false);
		prevHeadButton.setContentAreaFilled(false);
		prevHeadButton.setBorderPainted(false);
		frame.getContentPane().add(prevHeadButton);
		prevHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				controller.previous(1);
			}
			
		});
		
		nextHeadButton = new JButton("");
		nextHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
		nextHeadButton.setOpaque(false);
		nextHeadButton.setContentAreaFilled(false);
		nextHeadButton.setBorderPainted(false);
		nextHeadButton.setBounds(214, 127, 20, 20);
		frame.getContentPane().add(nextHeadButton);
		nextHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.next(1);
			}
			
		});
		
		prevBodyButton = new JButton("");
		prevBodyButton.setBounds(114, 160, 20, 20);
		prevBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
		prevBodyButton.setOpaque(false);
		prevBodyButton.setContentAreaFilled(false);
		prevBodyButton.setBorderPainted(false);
		frame.getContentPane().add(prevBodyButton);
		prevBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.previous(2);
			}
			
		});
		
		nextBodyButton = new JButton("");
		nextBodyButton.setBounds(214, 160, 20, 20);
		nextBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
		nextBodyButton.setOpaque(false);
		nextBodyButton.setContentAreaFilled(false);
		nextBodyButton.setBorderPainted(false);
		frame.getContentPane().add(nextBodyButton);
		nextBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.next(2);
			}
			
		});
		
		prevLegButton = new JButton("");
		prevLegButton.setBounds(114, 193, 20, 20);
		prevLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
		prevLegButton.setOpaque(false);
		prevLegButton.setContentAreaFilled(false);
		prevLegButton.setBorderPainted(false);
		frame.getContentPane().add(prevLegButton);
		prevLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.previous(3);
			}
			
		});
		
		nextLegButton = new JButton("");
		nextLegButton.setBounds(214, 193, 20, 20);
		nextLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
		nextLegButton.setOpaque(false);
		nextLegButton.setContentAreaFilled(false);
		nextLegButton.setBorderPainted(false);
		frame.getContentPane().add(nextLegButton);
		nextLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.next(3);
			}
			
		});
		
		headNameLabel = new JLabel("head1");
		headNameLabel.setForeground(Color.WHITE);
		headNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		headNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headNameLabel.setBounds(136, 128, 77, 20);
		frame.getContentPane().add(headNameLabel);
		
		bodyNameLabel = new JLabel("body1");
		bodyNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		bodyNameLabel.setForeground(Color.WHITE);
		bodyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bodyNameLabel.setBounds(136, 161, 77, 20);
		frame.getContentPane().add(bodyNameLabel);
		
		legNameLabel = new JLabel("leg1");
		legNameLabel.setForeground(Color.WHITE);
		legNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		legNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		legNameLabel.setBounds(136, 193, 77, 20);
		frame.getContentPane().add(legNameLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(42, 42, 42));
		textField.setFont(new Font("Humanoid", Font.PLAIN, 16));
		textField.setForeground(Color.WHITE);
		textField.setToolTipText("");
		textField.setBounds(6, 53, 228, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel title = new JLabel("");
		title.setIcon(new ImageIcon(ChooseCharacterWindow.class.getResource("/assets/customize.gif")));
		title.setFont(new Font("Roboto", Font.PLAIN, 20));
		title.setBounds(16, 7, 207, 40);
		frame.getContentPane().add(title);
		
		
		controller = new ChooseCharacterController(this);
	}
}
