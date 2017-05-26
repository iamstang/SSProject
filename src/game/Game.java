<<<<<<< HEAD
package game;

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
	private int score;
	private Robot robot;
	private RobotHead robotHead;
	private boolean running;
	private Thread gameThread;
	private ArrayList<Monster> monsters;
	private HashMap<Integer, String> wormImg;
	private HashMap<Integer, String> birdImg;
	private Background ground;
	private Background background;

	public Game(Robot robot) {
		this.robot = robot;
		this.robotHead = new RobotHead(robot);
		this.wormImg = new HashMap<Integer, String>();
		this.birdImg = new HashMap<Integer, String>();
		fetchImg();
		this.monsters = createMonsterPool();
		this.score = 0;
		
		try {
			this.ground = new Background(ImageIO.read(new File("bin/assets/bg.png")), 10);
			this.background = new Background(ImageIO.read(new File("bin/assets/cloud.png")), 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		ground.update();
		background.update();
		for (int i = 0; i < monsters.size(); i++) {
			score+=monsters.get(i).update(robotHead, robot);
		}

		setChanged();
		notifyObservers();
	}

	public ArrayList<Monster> createMonsterPool() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for (int i = 0; i < 4; i++) {
			try {
				monsters.add(new SkyWorm(800, (int)(Math.random()*250), (int)(Math.random()*18), ImageIO.read(new File(wormImg.get(i)))));
				monsters.add(new LandBird(800, -30, (int)(Math.random()*10), ImageIO.read(new File(birdImg.get(i)))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return monsters;
	}

	public void fetchImg() {
		wormImg.put(0, "bin/monster/monster-walk-red.png");
		wormImg.put(1, "bin/monster/monster-walk-yellow.png");
		wormImg.put(2, "bin/monster/monster-walk-green.png");
		wormImg.put(3, "bin/monster/monster-walk-rainbow.png");
		birdImg.put(0, "bin/monster/monster-fly-red.png");
		birdImg.put(1, "bin/monster/monster-fly-yellow.png");
		birdImg.put(2, "bin/monster/monster-fly-green.png");
		birdImg.put(3, "bin/monster/monster-fly-rainbow.png");
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
	public Background getGround() {
		return this.ground;
	}
	public Background getBackground() {
		return this.background;
	}
}
=======
package game;

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
	private int score;
	private Robot robot;
	private RobotHead robotHead;
	private boolean running;
	private Thread gameThread;
	private ArrayList<Monster> monsters;
	private HashMap<Integer, String> wormImg;
	private HashMap<Integer, String> birdImg;
	private Background ground;
	private Background background;

	public Game(Robot robot) {
		this.robot = robot;
		this.robotHead = new RobotHead(robot);
		this.wormImg = new HashMap<Integer, String>();
		this.birdImg = new HashMap<Integer, String>();
		fetchImg();
		this.monsters = createMonsterPool();
		this.score = 0;
		
		try {
			this.ground = new Background(ImageIO.read(new File("C:/Users/ood/Desktop/assets/bg-ground.png")), 10);
			this.background = new Background(ImageIO.read(new File("C:/Users/ood/Desktop/assets/bg.png")), 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		ground.update();
		background.update();
		for (int i = 0; i < monsters.size(); i++) {
			score+=monsters.get(i).update(robotHead, robot);
		}

		setChanged();
		notifyObservers();
	}

	public ArrayList<Monster> createMonsterPool() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for (int i = 0; i < 4; i++) {
			try {
				monsters.add(new SkyWorm(800, (int)(Math.random()*250), (int)(Math.random()*18), ImageIO.read(new File(wormImg.get(i)))));
				monsters.add(new LandBird(800, -30, (int)(Math.random()*10), ImageIO.read(new File(birdImg.get(i)))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return monsters;
	}

	public void fetchImg() {
		wormImg.put(0, "/monster/monster-walk-red.png");
		wormImg.put(1, "/monster/monster-walk-yellow.png");
		wormImg.put(2, "/monster/monster-walk-green.png");
		wormImg.put(3, "/monster/monster-walk-rainbow.png");
		birdImg.put(0, "/monster/monster-fly-red.png");
		birdImg.put(1, "/monster/monster-fly-yellow.png");
		birdImg.put(2, "/monster/monster-fly-green.png");
		birdImg.put(3, "/monster/monster-fly-rainbow.png");
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
	public Background getGround() {
		return this.ground;
	}
	public Background getBackground() {
		return this.background;
	}
}
>>>>>>> 067c224ec5c9e78a5a2dcf25b6c1efd874f2675a
