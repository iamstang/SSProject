package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
<<<<<<< HEAD
=======
import javax.swing.JLabel;
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51

import abstractFactory.FactoryProducer;
import abstractFactory.Part;
import abstractFactory.PartFactory;
import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public class ChooseCharacterController {

	ChooseCharacterWindow window;

<<<<<<< HEAD

=======
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
	Leg[] legArr = new Leg [2];
	Head[] headArr = new Head[4];
	Body[] bodyArr = new Body[5];

	NormalIterator headIterator;
	NormalIterator bodyIterator;
	NormalIterator legIterator;

	PartFactory legFactory = FactoryProducer.getFactory( "LEG" );
	PartFactory headFactory = FactoryProducer.getFactory( "HEAD" );
	PartFactory bodyFactory = FactoryProducer.getFactory( "BODY" );



	ChooseCharacterController( ChooseCharacterWindow w ){
		window = w;
		init();
	}

	public void init(){
<<<<<<< HEAD
=======
		
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
		legArr[0] = legFactory.getLeg(1);
		legArr[1] = legFactory.getLeg(2);
		

		bodyArr[0] = bodyFactory.getBody(1);
		bodyArr[1] = bodyFactory.getBody(2);
		bodyArr[2] = bodyFactory.getBody(3);
		bodyArr[3] = bodyFactory.getBody(4);
		bodyArr[4] = bodyFactory.getBody(5);
		
		headArr[0] = headFactory.getHead(1);
		headArr[1] = headFactory.getHead(2);
		headArr[2] = headFactory.getHead(3);
		headArr[3] = headFactory.getHead(4);

<<<<<<< HEAD

		//		window.headLabel.setIcon(new ImageIcon(headArr[0].getImage()));
		//		window.bodyLabel.setIcon(new ImageIcon(bodyArr[0].getImage()));
		//		window.legLabel.setIcon(new ImageIcon(legArr[0].getImage()));

		headIterator = new NormalIterator(headArr);
		bodyIterator = new NormalIterator(bodyArr);
		legIterator = new NormalIterator(legArr);



	}

	public void nextHead(){

		if ( headIterator.hasNext() ){
			Part a = headIterator.next();
			window.headLabel.setIcon(new ImageIcon(a.getImage()));
			window.headNameLabel.setText(a.getName());
		}


	}

	public void prevHead(){

		if ( headIterator.hasPrev() ){
			Part a = headIterator.prev();
			window.headLabel.setIcon(new ImageIcon(a.getImage()));
			window.headNameLabel.setText(a.getName());
		}



	}

	public void nextBody(){

		if ( bodyIterator.hasNext() ){
			Part a = bodyIterator.next();
			window.bodyLabel.setIcon(new ImageIcon(a.getImage()));
			window.bodyNameLabel.setText(a.getName());
		}

	}

	public void prevBody(){

		if ( bodyIterator.hasPrev() ){
			Part a = bodyIterator.prev();
			window.bodyLabel.setIcon(new ImageIcon(a.getImage()));
			window.bodyNameLabel.setText(a.getName());
		}

	}

	public void nextLeg(){

		if ( legIterator.hasNext() ){
			Part a = legIterator.next();
			window.legLabel.setIcon(new ImageIcon(a.getImage()));
			window.legNameLabel.setText(a.getName());
		}


	}

	public void prevLeg(){

		if ( legIterator.hasPrev() ){
			Part a = legIterator.prev();
			window.legLabel.setIcon(new ImageIcon(a.getImage()));
			window.legNameLabel.setText(a.getName());
		}

	}

=======
		headIterator = new NormalIterator(headArr);
		bodyIterator = new NormalIterator(bodyArr);
		legIterator = new NormalIterator(legArr);
		
		window.headLabel.setIcon(new ImageIcon(headArr[0].getImage()));
		window.bodyLabel.setIcon(new ImageIcon(bodyArr[0].getImage()));
		window.legLabel.setIcon(new ImageIcon(legArr[0].getImage()));
	}
	
	public void next(int a){
		NormalIterator b;
		JLabel label , nameLabel;
		
		if ( a == 1 ){
			
			b = headIterator;
			label = window.headLabel;
			nameLabel = window.headNameLabel;		
		} else if ( a == 2 ) {
	
			b = bodyIterator;
			label = window.bodyLabel;
			nameLabel = window.bodyNameLabel;			
		} else {
			
			b = legIterator;
			label = window.legLabel;
			nameLabel = window.legNameLabel;
		}
		
		if ( b.hasNext() ){
			Part part = b.next();
			label.setIcon(new ImageIcon(part.getImage()));
			nameLabel.setText(part.getName());
		}
	}
	
	public void previous(int a){
		NormalIterator b;
		JLabel label , nameLabel;
		
		if ( a == 1 ){
			
			b = headIterator;
			label = window.headLabel;
			nameLabel = window.headNameLabel;	
		} else if ( a == 2 ) {
			
			b = bodyIterator;
			label = window.bodyLabel;
			nameLabel = window.bodyNameLabel;	
		} else {
			
			b = legIterator;
			label = window.legLabel;
			nameLabel = window.legNameLabel;
		}
		
		if ( b.hasPrev() ){
			Part part = b.prev();
			label.setIcon(new ImageIcon(part.getImage()));
			nameLabel.setText(part.getName());
		}
	}
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
}
