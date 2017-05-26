package entity;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class SkyWorm extends Monster{

	public SkyWorm(int x, int y, int vX, Image image, int score) {
		super(x, y, vX, image, score);
	}
	@Override
	public void respawn() {
		super.y = (int)(Math.random()*250);
		super.vX = (int)(Math.random()*11)+6;
		super.x = 1180;
		super.active = true;
	}

}
