package entity;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Monster {
	protected int x;
	protected int y;
	protected int vX;
	private Image img;
	protected boolean active;
	protected int score;
	public Monster(int x, int y, int vX, Image image, int score) {
		this.x = x;
		this.y = y;
		this.vX = vX;
		this.img = image;
		this.active = true;
		this.score = score;
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
	public Image getImg() {
		return this.img;
	}
	public int update(RobotHead robotHead) {
		int updateScore = 0;
		if (isAlive()) {
			x-=vX;
		} else {
			respawn();
		}
		if (robotHead.getX() > x && robotHead.getY() < y+50 && robotHead.getY() > y-50) {
			updateScore = score;
			robotHead.resetHead();
			active = false;
		}
		if (x < -1500) {
			active = false;
		}
		return updateScore;
	}
	public boolean isAlive() {
		if (active) return true;
		return false;
	}
	public boolean isHit(Robot robot) {
		if (robot.getX() < x+20 && robot.getX() > x-50 && robot.getY() < y+50 && robot.getY() > y-50) {
			return true;
		}
		return false;
	}
	public void respawn() {
		this.y = 0;
		this.vX = (int)(Math.random()*10)+1;
		this.x = 1180;
		active = true;
	}

}