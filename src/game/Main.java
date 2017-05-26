<<<<<<< HEAD
package game;

import entity.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import entity.Robot;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(createPlayer());
		w.setVisible(true);
		w.start();
	}
	public static Robot createPlayer() {
		Robot player = new Robot(0,0);
		try {
			player.setHeadImg(ImageIO.read(new File("bin/assets/head1.png")));
			player.setBodyImg(ImageIO.read(new File("bin/assets/body1.png")));
			player.setWheelImg(ImageIO.read(new File("bin/assets/wheel1.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return player;
	}
}
=======
package game;

import entity.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import entity.Robot;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(createPlayer());
		w.setVisible(true);
		w.start();
	}
	public static Robot createPlayer() {
		Robot player = new Robot(0,0);
		try {
			player.setHeadImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/head1.png")));
			player.setBodyImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/body1.png")));
			player.setWheelImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/wheel1.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return player;
	}
}
>>>>>>> 067c224ec5c9e78a5a2dcf25b6c1efd874f2675a
