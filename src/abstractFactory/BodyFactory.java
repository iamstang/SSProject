package abstractFactory;

import bodyPart.Body;
import bodyPart.Body1;
import bodyPart.Body2;
import bodyPart.Body3;
import bodyPart.Body4;
import bodyPart.Body5;
import headPart.Head;
import legPart.Leg;

public class BodyFactory extends PartFactory {

	@Override
	public
	Head getHead(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	Body getBody(int i) {
		if ( i == 0 ) return null;
		else if ( i == 1 ) return new Body1();
		else if ( i == 2 ) return new Body2();
		else if ( i == 3 ) return new Body3();
		else if ( i == 4 ) return new Body4();
		else if ( i == 5 ) return new Body5();
		return null;
	}

	@Override
	public
	Leg getLeg(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
