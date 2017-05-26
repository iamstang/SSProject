package game;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.Selector;

import javax.swing.JButton;
import javax.swing.JFrame;

import abstractFactory.FactoryProducer;
import abstractFactory.PartFactory;
import abstractFactory.Robot;
import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public class MainDemo extends JFrame {
	
	private Choice headChoice;
	private Choice bodyChoice;
	private Choice legChoice;
	private JButton button;// = new JButton("a");
	
	private Head h;
	private Body b; 
	private Leg l;
	
	public MainDemo(){
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponent();
		pack();
	}
	
	void initComponent(){
		headChoice = new Choice();
		headChoice.add("head1");
		headChoice.add("head2");
		bodyChoice = new Choice();
		bodyChoice.add("body1");
		bodyChoice.add("body2");
		legChoice = new Choice();
		legChoice.add("leg1");
		legChoice.add("leg2");
		button = new JButton("go");
		
		this.setLayout(new FlowLayout());
		this.add(headChoice);
		this.add(bodyChoice);
		this.add(legChoice);
		this.add(button);
		
		button.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Robot r;
				
				
				int hIndex = headChoice.getSelectedIndex();
				int bIndex = bodyChoice.getSelectedIndex();
				int lIndex =legChoice.getSelectedIndex();
				//System.out.println(hIndex);
				PartFactory legFactory = FactoryProducer.getFactory( "LEG" );
				PartFactory headFactory = FactoryProducer.getFactory( "HEAD" );
				PartFactory bodyFactory = FactoryProducer.getFactory( "BODY" );
				
				h = headFactory.getHead(hIndex+1);
				b = bodyFactory.getBody(bIndex+1);
				l = legFactory.getLeg(lIndex+1);
				
				r = new Robot(h,b,l);
				r.print();
				System.out.println("--------------");
				
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		MainDemo window = new MainDemo();
		window.setVisible(true);
	}
}
