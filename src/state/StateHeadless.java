<<<<<<< HEAD
package state;
import java.awt.image.BufferedImage;

import entity.Robot;

public class StateHeadless implements State{
	private Robot player;
	public StateHeadless(Robot player) {
		this.player = player;
	}
	@Override
	public void jump() {
		player.setvY(20);
		player.setState(new StateHeadlessJump(player));
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
=======
package state;
import java.awt.image.BufferedImage;

import entity.Robot;

public class StateHeadless implements State{
	private Robot player;
	public StateHeadless(Robot player) {
		this.player = player;
	}
	@Override
	public void jump() {
		player.setvY(20);
		player.setState(new StateHeadlessJump(player));
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
>>>>>>> 067c224ec5c9e78a5a2dcf25b6c1efd874f2675a
