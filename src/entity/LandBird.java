<<<<<<< HEAD
package entity;

import java.awt.image.BufferedImage;

public class LandBird extends Monster{

	public LandBird(int x, int y, int vX, BufferedImage img) {
		super(x, y, vX, img);
	}
	@Override
	public void respawn() {
		super.y = -30;
		super.vX = (int)(Math.random()*10);
		super.x = 800;
		super.active = true;
	}

}
=======
package entity;

import java.awt.image.BufferedImage;

public class LandBird extends Monster{

	public LandBird(int x, int y, int vX, BufferedImage img) {
		super(x, y, vX, img);
	}
	@Override
	public void respawn() {
		super.y = -30;
		super.vX = (int)(Math.random()*10);
		super.x = 800;
		super.active = true;
	}

}
>>>>>>> 067c224ec5c9e78a5a2dcf25b6c1efd874f2675a
