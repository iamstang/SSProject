package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head6 implements Head {

	String name = "head6";
	BufferedImage img;
	public Head6(){
		try{
			
			img = ImageIO.read(getClass().getResource("/assets/head6.png"));
			
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
