package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head2 implements Head {

	String name = "head2";
	BufferedImage img;
	public Head2(){
		try{
			img = ImageIO.read(new File("src/assets/head2.png"));
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
