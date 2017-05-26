<<<<<<< HEAD
package entity;

import java.awt.image.BufferedImage;

public class Monster {
	protected int x;
	protected int y;
	protected int vX;
	private BufferedImage img;
	protected boolean active;
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
	public int update(RobotHead robotHead, Robot robot) {
		int updateScore = 0;
		if (active) {
			x-=vX;
		} else {
			respawn();
		}
		if (robotHead.getX() > x && robotHead.getY() < y+50 && robotHead.getY() > y-50) {
			updateScore = 100;
			active = false;
		}
		if (x < -2000) {
			active = false;
		}
		if (isHit(robot)) {
			//Game over!
		}
		return updateScore;
	}
	public boolean isHit(Robot robot) {
		if (x == robot.getX() && robot.getY() < y+100 && robot.getY() > y-100) {
			return true;
		}
		return false;
	}
	public void respawn() {
		this.y = (int)(Math.random()*250);
		this.vX = (int)(Math.random()*18);
		this.x = 800;
		active = true;
	}

=======
package entity;

import java.awt.image.BufferedImage;

public class Monster {
	protected int x;
	protected int y;
	protected int vX;
	private BufferedImage img;
	protected boolean active;
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
	public int update(RobotHead robotHead, Robot robot) {
		int updateScore = 0;
		if (active) {
			x-=vX;
		} else {
			respawn();
		}
		if (robotHead.getX() > x && robotHead.getY() < y+50 && robotHead.getY() > y-50) {
			updateScore = 100;
			active = false;
		}
		if (x < -2000) {
			active = false;
		}
		if (isHit(robot)) {
			//Game over!
		}
		return updateScore;
	}
	public boolean isHit(Robot robot) {
		if (x == robot.getX() && robot.getY() < y+100 && robot.getY() > y-100) {
			return true;
		}
		return false;
	}
	public void respawn() {
		this.y = (int)(Math.random()*250);
		this.vX = (int)(Math.random()*18);
		this.x = 800;
		active = true;
	}

>>>>>>> 067c224ec5c9e78a5a2dcf25b6c1efd874f2675a
}