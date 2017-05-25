package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head3 implements Head {

	String name = "head3";
	BufferedImage img;
	public Head3(){
		try{
			
			img = ImageIO.read(new File("src/assets/head3.png"));
			
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
