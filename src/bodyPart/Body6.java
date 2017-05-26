package bodyPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Body6 implements Body {

	String name = "body6";
	BufferedImage img;
	public Body6(){
		try{
			
			img = ImageIO.read(new File("src/assets/body6.png"));
			
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
