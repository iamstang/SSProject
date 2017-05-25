package entity;

import java.awt.image.BufferedImage;

public class RobotHead {
	private int x;
	private int y;
	private int vX;
	private Robot robot;
	private BufferedImage headImg;
	private double angle;
	public RobotHead(Robot robot) {
		this.robot = robot;
		this.headImg = robot.getHeadImg();
		this.x = robot.getX();
		this.y = robot.getY();
		this.vX = 20;
		this.angle = 0;
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
	public BufferedImage getHeadImg() {
		return this.headImg;
	}
	public double getAngle() {
		return this.angle;
	}
	public void update() {
		if (robot.getHeadlessTime()>0) {
			this.x+=vX;
			angle += Math.toRadians (20);
		} else {
			angle = 0;
			this.y = robot.getY();
			this.x = robot.getX();
		}	
	}
}
