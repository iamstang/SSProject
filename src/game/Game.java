package game;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import javax.imageio.ImageIO;

import entity.*;

public class Game extends Observable {

	public static final int FPS = 60;
	public static final float GRAVITY = -600;

	private Robot robot;
	private RobotHead robotHead;
	private boolean running;
	private Thread gameThread;
	private ArrayList<Monster> monsters;
	private HashMap<Integer, String> imgMap;

	public Game(Robot robot) {
		this.robot = robot;
		this.robotHead = new RobotHead(robot);
		this.imgMap = new HashMap<Integer, String>();
		fetchImg();
		this.monsters = createMonsterPool();
	}

	public void start() {
		running = true;
		gameThread = new Thread() {
			@Override
			public void run() {
				super.run();
				while (running) {
					singleFrame();
					try {
						Thread.sleep(1000 / FPS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start();
	}

	private void singleFrame() {
		robot.update();
		robotHead.update();
		for (int i = 0; i < monsters.size(); i++) {
			monsters.get(i).update(robotHead, robot);
		}

		setChanged();
		notifyObservers();
	}

	public ArrayList<Monster> createMonsterPool() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for (int i = 0; i < 4; i++) {
			try {
				monsters.add(new Monster(800, (int)(Math.random()*250), (int)(Math.random()*18), ImageIO.read(new File(imgMap.get(i)))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return monsters;
	}

	public void fetchImg() {
		imgMap.put(0, "C:/Users/ood/Desktop/assets 2/assets/monster-walk-red.png");
		imgMap.put(1, "C:/Users/ood/Desktop/assets 2/assets/monster-walk-yellow.png");
		imgMap.put(2, "C:/Users/ood/Desktop/assets 2/assets/monster-walk-green.png");
		imgMap.put(3, "C:/Users/ood/Desktop/assets 2/assets/monster-walk-rainbow.png");
	}

	public void jumpPressed() {
		robot.jumpPressed();
	}

	public void launchHeadPressed() {
		robot.launchHeadPressed();
	}

	public Robot getRobot() {
		return this.robot;
	}

	public RobotHead getRobotHead() {
		return this.robotHead;
	}

	public ArrayList<Monster> getMonsters() {
		return this.monsters;
	}
}
