package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head2 implements Head {

	String name = "head2";
	BufferedImage img;
	public Head2(){
		try{
			img = ImageIO.read(new File("src/assets/head2.png"));
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
