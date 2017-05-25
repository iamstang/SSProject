package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import abstractFactory.FactoryProducer;
import abstractFactory.Part;
import abstractFactory.PartFactory;
import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public class ChooseCharacterController {

	ChooseCharacterWindow window;

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
}
