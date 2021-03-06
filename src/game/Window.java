package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import entity.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entity.Robot;

public class Window extends JFrame implements Observer {
	private int width = 1080;
	private int height = 480;
	private int viewOffset = 50;

	private JPanel drawPanel;
	private Game game;

	public Window(Robot robot) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		addKeyListener(new Controller());
		game = new Game(robot);
		
		game.addObserver(this);
		pack();
	}
	private void initComponents() {
		
		this.setResizable(false);
	 	this.setUndecorated(true);
		drawPanel = new JPanel() {
			{
				setPreferredSize(new Dimension(width, height));
			}

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.white);
				g.fillRect(0, 0, width, height);
				drawGround(g);
				drawCharacters(g);
				drawBar(g);
				if(game.isOver()) {
					gameOver();
				}
			}

		};
		add(drawPanel);

	}
	
	private void gameOver(){
		GameOver go = new GameOver(game.getRobot().getName(), game.getScore());
		go.runGameOver();
		this.dispose();
	}
	

	private void drawSmoke(Graphics g) {
		// TODO Auto-generated method stub
			ImageIcon icon = new ImageIcon(Window.class.getResource("/assets/smokeloop.gif"));
			g.drawImage(icon.getImage(), viewOffset + game.getRobot().getX(),
					height - (game.getRobot().getY() + game.getRobot().getHeight()+90), this);
		
	}

	private void drawCharacters(Graphics g) {
		//Robot Render
		g.drawImage(game.getRobot().getHeadImg(), viewOffset + game.getRobot().getX(),
				height - (game.getRobot().getY() + game.getRobot().getHeight()+90), this);
		g.drawImage(game.getRobot().getBodyImg(), viewOffset + game.getRobot().getX()-25,
				height - (game.getRobot().getY() + game.getRobot().getHeight()+40), this);
		g.drawImage(game.getRobot().getWheelImg(), viewOffset + game.getRobot().getX(),
				height - (game.getRobot().getY() + game.getRobot().getHeight()), this);
		
		//RobotHead Render
		
		BufferedImage robotHead = game.getRobotHead().getHeadImg();
		double locationX = robotHead.getWidth() / 2;
		double locationY = robotHead.getHeight() / 2;
		AffineTransform tx = AffineTransform.getRotateInstance(game.getRobotHead().getAngle(), locationX, locationY);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		g.drawImage(op.filter(robotHead, null), viewOffset + game.getRobotHead().getX(),
				height - (game.getRobotHead().getY()+ game.getRobot().getHeight()+90), this);
		
		
		//Monster Render
		for (int i = 0;i<game.getMonsters().size();i++) {
			Monster monster = game.getMonsters().get(i);
			
			g.drawImage(monster.getImg(), monster.getX(),
				height - (monster.getY() + game.getRobot().getHeight()+90), this);
		
		}
	}
	private void drawBar(Graphics g) {
		
		String scoring = "Score : " + game.getScore();
		g.setFont(new Font("Humanoid", Font.PLAIN, 50));
		g.setColor(Color.WHITE);
		g.drawString(scoring, 700,50);
		

		g.setFont(new Font("Humanoid", Font.PLAIN, 50));
		g.setColor(Color.WHITE);
		g.drawString(game.getRobot().getName(), 50,50);
		
	
	}
	
	private void drawGround(Graphics g) {
		g.drawImage(game.getGround().getImg(), game.getGround().getX(),
				0, this);
		g.drawImage(game.getBackground().getImg(), game.getBackground().getX(),
				-80, this);
		
	}
	
	public void start() {
		game.start();
	}

	class Controller extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_X) {
				game.jumpPressed();
			} else if (e.getKeyCode() == KeyEvent.VK_Z) {
				game.launchHeadPressed();
			}
		}

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
}
