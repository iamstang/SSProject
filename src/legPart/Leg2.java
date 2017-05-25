package legPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Leg2 implements Leg {

	String name = "leg2";
	BufferedImage img;
	public Leg2(){
		try{
			img = ImageIO.read(new File("src/assets/wheel2.png"));
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
