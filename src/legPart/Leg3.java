package legPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Leg3 implements Leg {

	String name = "leg3";
	BufferedImage img;
	public Leg3(){
		try{
			img = ImageIO.read(new File("src/assets/wheel3.png"));
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
