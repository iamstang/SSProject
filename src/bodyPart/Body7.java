package bodyPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Body7 implements Body {

	String name = "body7";
	BufferedImage img;
	public Body7(){
		try{
			
			img = ImageIO.read(getClass().getResource("/assets/body7.png"));
			
		} catch (Exception e){	
		
		}
	}
	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return img;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
