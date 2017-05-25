package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head1 implements Head {

	String name = "head1";
	BufferedImage img;
	public Head1(){
		try{
			
			img = ImageIO.read(new File("src/assets/head1.png"));
			
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
