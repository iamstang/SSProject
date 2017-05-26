package entity;

import java.awt.image.BufferedImage;

public class SkyWorm extends Monster{

	public SkyWorm(int x, int y, int vX, BufferedImage img) {
		super(x, y, vX, img);
	}
	@Override
	public void respawn() {
		super.y = (int)(Math.random()*250);
		super.vX = (int)(Math.random()*10)+1;
		super.x = 1180;
		super.active = true;
	}

}
