package game;

import java.awt.image.BufferedImage;

public class Background {
	private BufferedImage img;
	private int speed;
	private int x;
	public Background(BufferedImage img, int speed) {
		this.img = img;
		this.speed = speed;
		this.x = 0;
	}
	public void update() {
		x-=speed;
		if (x < -1080) x=0;
		
	}
	public BufferedImage getImg() {
		return this.img;
	}
	public int getX() {
		return this.x;
	}
}
