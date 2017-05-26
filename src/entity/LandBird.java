package entity;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class LandBird extends Monster{

	public LandBird(int x, int y, int vX, Image img, int score) {
		super(x, y, vX, img, score);
	}
	@Override
	public void respawn() {
		super.y = -30;
		super.vX = (int)(Math.random()*5)+3;
		super.x = 1180;
		super.active = true;
	}

}
