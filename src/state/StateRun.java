package state;
import java.awt.image.BufferedImage;

import entity.Robot;

public class StateRun implements State {
	private Robot player;
	public StateRun(Robot player) {
		this.player = player;
	}
	@Override
	public void jump() {
		player.setvY(20);
		player.setState(new StateJump(player));
	}
	@Override
	public void launchHead() {
		player.setHeadlessTime(80);
		player.setState(new StateHeadless(player));
	}
	@Override
	public BufferedImage getHeadImg() {
		return player.headImg;
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
