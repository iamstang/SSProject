package game;
import java.util.Iterator;

import abstractFactory.Part;

public class NormalIterator implements Iterator<Part> {
	
	Part[] items;
	int index;
	
	public NormalIterator(Part[] p){
		items = p;
<<<<<<< HEAD
		index = -1;
=======
		index = 0;
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < items.length-1;
	}

	@Override
	public Part next() {
		// TODO Auto-generated method stub
		Part item = items[++index];
		
		return item;
	}
	
	public boolean hasPrev(){
		return index >= 0;
	}
	
	public Part prev(){
		if ( index == 0 ){
			
		} else  index--;
		
		Part item = items[index];
		return item;
	}

}
