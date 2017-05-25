package abstractFactory;

import bodyPart.Body;
import headPart.Head;
import legPart.Leg;
import legPart.Leg1;
import legPart.Leg2;


public class LegFactory extends PartFactory {

	@Override
	public
	Head getHead(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	Body getBody(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	Leg getLeg(int i) {
		// TODO Auto-generated method stub
		if ( i == 0 ) return null;
		else if ( i == 1 ) return new Leg1();
		else if ( i == 2 ) return new Leg2();
		return null;
	}

}
