package entity;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import state.*;

public class Robot {
	public static final int WIDTH = 50;
	public static final int NORMAL_HEIGHT = 140;

	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;
	private int headlessTime;
	private int cooldown;
	private State state;
	private String name;

	public BufferedImage headImg = null;
	public BufferedImage bodyImg = null;
	public BufferedImage wheelImg = null;

	public Robot(int x, int y, String name , BufferedImage h , BufferedImage b , BufferedImage w ) {
		this.x = x;
		this.y = y;
		this.name = name;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		this.vY = 0;
		this.headlessTime = 0;
		this.cooldown = 0;
		state = new StateRun(this);
		headImg = h;
		bodyImg = b;
		wheelImg = w;

	}

	public void setState(State state) {
		this.state = state;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getvY() {
		return vY;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getHeadlessTime() {
		return headlessTime;
	}

	public int getCooldown() {
		return this.cooldown;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}

	public void setHeight(int height) {
		this.height = height;

	}

	public void setHeadlessTime(int time) {
		this.headlessTime = time;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public void jumpPressed() {
		state.jump();
	}

	public void launchHeadPressed() {
		state.launchHead();
	}

	public void update() {
		vY--;
		y += vY;
		headlessTime--;
		cooldown--;
		if (y <= 0) {
			y = 0;
			if (headlessTime <= 0) {
				this.setState(new StateRun(this));
			} else {
				this.setState(new StateHeadless(this));
			}

		} else if (y > 0) {
			if (headlessTime <= 0) {
				this.setState(new StateJump(this));
			} else {
				this.setState(new StateHeadlessJump(this));
			}
		}
	}

	public void setHeadImg(BufferedImage img) {
		this.headImg = img;
	}

	public void setBodyImg(BufferedImage img) {
		this.bodyImg = img;
	}

	public void setWheelImg(BufferedImage img) {
		this.wheelImg = img;
	}

	public BufferedImage getHeadImg() {
		return state.getHeadImg();
	}

	public BufferedImage getBodyImg() {
		return state.getBodyImg();
	}

	public BufferedImage getWheelImg() {
		return state.getWheelImg();
	}
}