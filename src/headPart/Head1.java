package headPart;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Head1 implements Head {

	String name = "head1";
	BufferedImage img;
	public Head1(){
		try{
<<<<<<< HEAD
			
			img = ImageIO.read(new File("src/assets/head1.png"));
			
		} catch (Exception e){	
			System.out.println("ss");
		}
	}
		
	public String getName(){
		return name;
	}
	
=======
			img = ImageIO.read(new File("src/assets/head1.png"));
		} catch (Exception e){ }
	}

	public String getName(){
		return name;
	}

>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return img;
	}
<<<<<<< HEAD
	
	
=======


>>>>>>> e69b7055fcf9db4a1b7a57f107df866f487f5d51
}
