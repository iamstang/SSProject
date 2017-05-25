package entity;

import java.awt.image.BufferedImage;

public class Monster {
	private int x;
	private int y;
	private int vX;
	private BufferedImage img;
	private boolean active;
	public Monster(int x, int y, int vX, BufferedImage img) {
		this.x = x;
		this.y = y;
		this.vX = vX;
		this.img = img;
		this.active = true;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getvX() {
		return vX;
	}
	public void setvX(int vX) {
		this.vX = vX;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean getActive() {
		return this.active;
	}
	public BufferedImage getImg() {
		return this.img;
	}
	public void update(RobotHead robotHead, Robot robot) {
		if (active) {
			x-=vX;
		} else {
			this.y = (int)(Math.random()*250);
			this.vX = (int)(Math.random()*18);
			this.x = 800;
			active = true;
		}
		if (robotHead.getX() > x && robotHead.getY() < y+50 && robotHead.getY() > y-50) {
			//score
			active = false;
		}
		if (x < -2000) {
			active = false;
		}
		isHit(robot);
	}
	public boolean isHit(Robot robot) {
		if (x == robot.getX() && robot.getY() < y+100 && robot.getY() > y-100) {
			return true;
		}
		return false;
	}

}