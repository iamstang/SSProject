package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head5 implements Head {

	String name = "head5";
	BufferedImage img;
	public Head5(){
		try{
			
			img = ImageIO.read(getClass().getResource("/assets/head5.png"));
			
		} catch (Exception e){	
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
