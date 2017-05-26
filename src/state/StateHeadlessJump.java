package state;

import java.awt.image.BufferedImage;

import entity.Robot;


public class StateHeadlessJump implements State{
	private Robot player;
	public StateHeadlessJump(Robot player) {
		this.player = player;
	}
	@Override
	public void jump() {
		
	}
	@Override
	public void launchHead() {
		
	}
	@Override
	public BufferedImage getHeadImg() {
		return null;
	}
	@Override
	public BufferedImage getBodyImg() {
		return player.bodyImg;
	}
	@Override
	public BufferedImage getWheelImg() {
		return player.wheelImg;
	}
}
