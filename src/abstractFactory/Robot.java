package abstractFactory;

import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public class Robot {

	Head head;
	Body body;
	Leg leg;
	
	public Robot( Head h , Body b , Leg g ){
		head = h;
		body = b;
		leg = g;
		
	}
	
	public void print(){
		
	}
}
