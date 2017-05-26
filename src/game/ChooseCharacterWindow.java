package game;

import java.awt.EventQueue;
<<<<<<< HEAD
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51

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
import java.awt.BorderLayout;

public class ChooseCharacterWindow {

	private JFrame frame;
<<<<<<< HEAD
	private JTextField textField;
=======
	private JTextField txtInsertName;
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
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
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.main(null);
			}
		});
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
		headPanel.setLayout(new BorderLayout(0, 0));
		headPanel.add(headLabel);
		
		bodyPanel = new JPanel();
		bodyPanel.setOpaque(false);
		bodyPanel.setBounds(6, 151, 100, 40);
		frame.getContentPane().add(bodyPanel);
		bodyPanel.setLayout(new BorderLayout(0, 0));
		bodyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bodyPanel.add(bodyLabel);
		
		legPanel = new JPanel();
		legPanel.setOpaque(false);
		legPanel.setBounds(31, 193, 50, 20);
		frame.getContentPane().add(legPanel);
		legPanel.setLayout(new BorderLayout(0, 0));
		legPanel.add(legLabel);
		
		prevHeadButton = new JButton("");
		prevHeadButton.setBounds(114, 127, 20, 20);
<<<<<<< HEAD
		prevHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/>.gif")));
=======
		prevHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		prevHeadButton.setOpaque(false);
		prevHeadButton.setContentAreaFilled(false);
		prevHeadButton.setBorderPainted(false);
		frame.getContentPane().add(prevHeadButton);
		prevHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.prevHead();
=======
				controller.previous(1);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
		nextHeadButton = new JButton("");
<<<<<<< HEAD
		nextHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/<.gif")));
=======
		nextHeadButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		nextHeadButton.setOpaque(false);
		nextHeadButton.setContentAreaFilled(false);
		nextHeadButton.setBorderPainted(false);
		nextHeadButton.setBounds(214, 127, 20, 20);
		frame.getContentPane().add(nextHeadButton);
		nextHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.nextHead();
=======
				controller.next(1);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
		prevBodyButton = new JButton("");
		prevBodyButton.setBounds(114, 160, 20, 20);
<<<<<<< HEAD
		prevBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/>.gif")));
=======
		prevBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		prevBodyButton.setOpaque(false);
		prevBodyButton.setContentAreaFilled(false);
		prevBodyButton.setBorderPainted(false);
		frame.getContentPane().add(prevBodyButton);
		prevBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.prevBody();
=======
				controller.previous(2);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
		nextBodyButton = new JButton("");
		nextBodyButton.setBounds(214, 160, 20, 20);
<<<<<<< HEAD
		nextBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/<.gif")));
=======
		nextBodyButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		nextBodyButton.setOpaque(false);
		nextBodyButton.setContentAreaFilled(false);
		nextBodyButton.setBorderPainted(false);
		frame.getContentPane().add(nextBodyButton);
		nextBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.nextBody();
=======
				controller.next(2);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
		prevLegButton = new JButton("");
		prevLegButton.setBounds(114, 193, 20, 20);
<<<<<<< HEAD
		prevLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/>.gif")));
=======
		prevLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/prev.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		prevLegButton.setOpaque(false);
		prevLegButton.setContentAreaFilled(false);
		prevLegButton.setBorderPainted(false);
		frame.getContentPane().add(prevLegButton);
		prevLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.prevLeg();
=======
				controller.previous(3);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
		nextLegButton = new JButton("");
		nextLegButton.setBounds(214, 193, 20, 20);
<<<<<<< HEAD
		nextLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/<.gif")));
=======
		nextLegButton.setIcon(new ImageIcon(WelcomePage.class.getResource("/assets/next.gif")));
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		nextLegButton.setOpaque(false);
		nextLegButton.setContentAreaFilled(false);
		nextLegButton.setBorderPainted(false);
		frame.getContentPane().add(nextLegButton);
		nextLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				controller.nextLeg();
=======
				controller.next(3);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
			}
			
		});
		
<<<<<<< HEAD
		headNameLabel = new JLabel("head");
=======
		headNameLabel = new JLabel("head1");
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		headNameLabel.setForeground(Color.WHITE);
		headNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		headNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headNameLabel.setBounds(136, 128, 77, 20);
		frame.getContentPane().add(headNameLabel);
		
<<<<<<< HEAD
		bodyNameLabel = new JLabel("body");
=======
		bodyNameLabel = new JLabel("body1");
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		bodyNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		bodyNameLabel.setForeground(Color.WHITE);
		bodyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bodyNameLabel.setBounds(136, 161, 77, 20);
		frame.getContentPane().add(bodyNameLabel);
		
<<<<<<< HEAD
		legNameLabel = new JLabel("leg");
=======
		legNameLabel = new JLabel("leg1");
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		legNameLabel.setForeground(Color.WHITE);
		legNameLabel.setFont(new Font("Humanoid", Font.PLAIN, 16));
		legNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		legNameLabel.setBounds(136, 193, 77, 20);
		frame.getContentPane().add(legNameLabel);
		
<<<<<<< HEAD
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(42, 42, 42));
		textField.setFont(new Font("Humanoid", Font.PLAIN, 16));
		textField.setForeground(Color.WHITE);
		textField.setToolTipText("");
		textField.setBounds(6, 53, 228, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ChooseCharacterWindow.class.getResource("/assets/customize.gif")));
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(16, 7, 207, 40);
		frame.getContentPane().add(lblNewLabel_1);
=======
		txtInsertName = new JTextField();
		txtInsertName.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	if(txtInsertName.getText().equals("insert name..."))
                txtInsertName.setText("");
            }
        });
		txtInsertName.setText("insert name...");
		txtInsertName.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsertName.setBackground(new Color(42, 42, 42));
		txtInsertName.setFont(new Font("Humanoid", Font.PLAIN, 16));
		txtInsertName.setForeground(Color.WHITE);
		txtInsertName.setToolTipText("");
		txtInsertName.setBounds(6, 53, 228, 28);
		frame.getContentPane().add(txtInsertName);
		txtInsertName.setColumns(10);
		
		JLabel title = new JLabel("");
		title.setIcon(new ImageIcon(ChooseCharacterWindow.class.getResource("/assets/customize.gif")));
		title.setFont(new Font("Roboto", Font.PLAIN, 20));
		title.setBounds(16, 7, 207, 40);
		frame.getContentPane().add(title);
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		
		
		controller = new ChooseCharacterController(this);
	}
}
