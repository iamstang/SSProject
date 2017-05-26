package state;
import java.awt.image.BufferedImage;

public interface State {
	public void jump();
	public void launchHead();
	public BufferedImage getHeadImg();
	public BufferedImage getBodyImg();
	public BufferedImage getWheelImg();
}
