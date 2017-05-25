package bodyPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Body1 implements Body {

	String name = "body1";
	BufferedImage img;
	public Body1(){
		try{
			
			img = ImageIO.read(new File("src/assets/body1.png"));
			
		} catch (Exception e){	
			System.out.println("ss");
		}
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
