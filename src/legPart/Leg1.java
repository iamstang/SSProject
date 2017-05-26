package legPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Leg1 implements Leg {

	String name = "leg1";
	BufferedImage img;
	public Leg1(){
		try{
			img = ImageIO.read(new File("src/assets/wheel1.png"));
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
