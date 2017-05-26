package bodyPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Body3 implements Body {

	String name = "body3";
	BufferedImage img;
	public Body3(){
		try{
<<<<<<< HEAD
			
			img = ImageIO.read(new File("src/assets/body3.png"));
			
		} catch (Exception e){	
			System.out.println("ss");
		}
	}
	
	
=======
			img = ImageIO.read(new File("src/assets/body3.png"));
		} catch (Exception e){ }
	}
		
>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
	public String getName(){
		return name;
	}
	
	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return img;
	}
	
	
}
