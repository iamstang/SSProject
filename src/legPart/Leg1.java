package legPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Leg1 implements Leg {

	String name = "leg1";
	BufferedImage img;
	public Leg1(){
		try{
			img = ImageIO.read(new File("src/assets/wheel1.png"));
<<<<<<< HEAD
		} catch (Exception e){
			
		}
=======
		} catch (Exception e){ }
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
	}
	
	public String getName(){
		return name;
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return img;
	}
	
	
}
