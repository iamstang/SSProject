package bodyPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Body5 implements Body {

	String name = "body5";
	BufferedImage img;
	public Body5(){
		try{
			
			img = ImageIO.read(new File("src/assets/body5.png"));
			
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
