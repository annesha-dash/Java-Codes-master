package cbabyballbounce;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CBabyBallBounce extends JFrame implements ActionListener, KeyListener, ChangeListener {

	int hours = 0, minutes = 0, seconds = 0, counter = 0, rs = 0, ls = 0;
	GameCanvas canvas;
	JMenuBar menuBar;
	JMenu menuScenario, menuEdit, menuControls, menuHelp;
	JMenuItem menuSave, menuExit, menuOpen, menuCut, menuCopy, menuPaste, menuAbout;
	JSlider speedSlider;
	JButton playerButton2, playerButton4, multiButton, exitButton, actButton, runButton, resetButton, ForwardButton,
			BackwardsButton, UpButton, DownButton, BallButton, Button1, Button2, Button3, Button4, DirectionButton;
	JPanel RightPanel, BottomPanel;
	JLabel Timer, Score, OptionLable, SquareLable, DirectionLable, player, SpeedL;
	JTextField Hour, Mins, Seconds, LeftScore, RightScore, Options, Square, Direction;
	Border loweredetched;
	Timer t1, t2;
	boolean run = false, stepDirection = false, gameOver = false;
	int LeftCounter = 0, RightCounter = 0;

	int t;
	int directionX;
	int directionY;

	public static void main(String[] args) {
		new CBabyBallBounce();

	}

	public CBabyBallBounce() {

		super("CBabyBallBounce � Baby Ball Bounce Application");
		setLayout(null);
		setSize(825, 585);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Right Panel
		RightPanel = new JPanel();
		RightPanel.setSize(200, 470);
		RightPanel.setLocation(585, 0);
		RightPanel.setLayout(null);
		RightPanel.setBorder(loweredetched);
		add(RightPanel);
		RightPanel.setBackground(Color.WHITE);

		// Add components to right panel
		Timer = new JLabel("DIGITAL TIMER");
		Timer.setSize(100, 30);
		Timer.setLocation(65, 1);
		RightPanel.add(Timer);

		// Add the hour text box
		Hour = new JTextField("00");
		Hour.setLocation(20, 30);
		Hour.setSize(40, 22);
		RightPanel.add(Hour);

		// Add the minutes text box
		Mins = new JTextField("00");
		Mins.setLocation(80, 30);
		Mins.setSize(40, 22);
		RightPanel.add(Mins);

		// Add the seconds text box
		Seconds = new JTextField("00");
		Seconds.setLocation(140, 30);
		Seconds.setSize(40, 22);
		RightPanel.add(Seconds);

		// Add the score
		Score = new JLabel("SCORE");
		Score.setLocation(80, 50);
		Score.setSize(100, 30);
		RightPanel.add(Score);

		// Add the left score panel
		LeftScore = new JTextField();
		LeftScore.setLocation(20, 75);
		LeftScore.setSize(40, 22);
		RightPanel.add(LeftScore);

		player = new JLabel(" <  L : R  > ");
		player.setLocation(70, 70);
		player.setSize(60, 30);
		RightPanel.add(player);

		// Add the right score panel
		RightScore = new JTextField();
		RightScore.setLocation(140, 75);
		RightScore.setSize(40, 22);
		RightPanel.add(RightScore);
		// end

		// text fields for option square direction.
		OptionLable = new JLabel("Option:");
		OptionLable.setSize(50, 20);
		OptionLable.setLocation(20, 100);
		RightPanel.add(OptionLable);

		// textfield for options
		Options = new JTextField("");
		Options.setSize(90, 20);
		Options.setLocation(90, 100);
		RightPanel.add(Options);

		SquareLable = new JLabel("Square:");
		SquareLable.setSize(60, 20);
		SquareLable.setLocation(20, 125);
		RightPanel.add(SquareLable);

		// textfield for Square
		Square = new JTextField("");
		Square.setSize(90, 20);
		Square.setLocation(90, 125);
		RightPanel.add(Square);

		DirectionLable = new JLabel("Direction:");
		DirectionLable.setSize(60, 20);
		DirectionLable.setLocation(20, 150);
		RightPanel.add(DirectionLable);

		// textfield for Direction
		Direction = new JTextField("");
		Direction.setSize(90, 20);
		Direction.setLocation(90, 150);
		RightPanel.add(Direction);

		UpButton = new JButton("^");
		UpButton.setSize(50, 30);
		UpButton.setLocation(80, 180);
		UpButton.setBackground(Color.white);
		UpButton.addActionListener(this);
		RightPanel.add(UpButton);

		Button1 = new JButton("");
		Button1.setSize(50, 30);
		Button1.setLocation(20, 180);
		Button1.setBackground(Color.lightGray);
		RightPanel.add(Button1);

		Button2 = new JButton("");
		Button2.setSize(50, 30);
		Button2.setLocation(140, 180);
		Button2.setBackground(Color.lightGray);
		RightPanel.add(Button2);

		BallButton = new JButton("");
		BallButton.setSize(50, 30);
		BallButton.setLocation(80, 215);
		RightPanel.add(BallButton);
		BallButton.setBackground(Color.white);
		ImageIcon iconball = new ImageIcon("images\\ball.png");
		BallButton.setIcon(iconball);

		DownButton = new JButton("v");
		DownButton.setSize(50, 30);
		DownButton.setBackground(Color.white);
		DownButton.setLocation(80, 250);
		DownButton.addActionListener(this);
		RightPanel.add(DownButton);

		ForwardButton = new JButton(">");
		ForwardButton.setSize(50, 30);
		ForwardButton.setBackground(Color.white);
		ForwardButton.setLocation(140, 215);
		ForwardButton.addActionListener(this);
		// setVisible(true);
		RightPanel.add(ForwardButton);

		BackwardsButton = new JButton("<");
		BackwardsButton.setSize(50, 30);
		BackwardsButton.setLocation(20, 215);
		BackwardsButton.setBackground(Color.white);
		BackwardsButton.addActionListener(this);
		RightPanel.add(BackwardsButton);

		Button3 = new JButton("");
		Button3.setSize(50, 30);
		Button3.setLocation(20, 250);
		Button3.setBackground(Color.lightGray);
		RightPanel.add(Button3);

		Button4 = new JButton("");
		Button4.setSize(50, 30);
		Button4.setLocation(140, 250);
		Button4.setBackground(Color.lightGray);
		RightPanel.add(Button4);

		// compass
		DirectionButton = new JButton("");
		DirectionButton.setSize(92, 92);
		DirectionButton.setLocation(65, 290);
		DirectionButton.setBackground(Color.white);
		RightPanel.add(DirectionButton);
		ImageIcon iconcompass = new ImageIcon("images\\North.jpg");
		DirectionButton.setIcon(iconcompass);

		// 2 Player, 4 Player, Multi� and �Exit�.
		playerButton2 = new JButton("2 Player");
		playerButton2.setSize(80, 30);
		playerButton2.setLocation(20, 385);
		playerButton2.setBackground(Color.white);
		playerButton2.setVisible(true);
		playerButton2.addActionListener(this);
		RightPanel.add(playerButton2);

		playerButton4 = new JButton("4 Player");
		playerButton4.setSize(80, 30);
		playerButton4.setLocation(110, 385);
		playerButton4.setBackground(Color.white);
		playerButton4.addActionListener(this);
		playerButton4.setVisible(true);
		RightPanel.add(playerButton4);

		multiButton = new JButton("Multi");
		multiButton.setSize(80, 30);
		multiButton.setLocation(20, 420);
		multiButton.setBackground(Color.white);
		multiButton.addActionListener(this);
		multiButton.setVisible(true);
		RightPanel.add(multiButton);

		exitButton = new JButton("Exit");
		exitButton.setSize(80, 30);
		exitButton.setLocation(110, 420);
		exitButton.setBackground(Color.white);
		exitButton.setVisible(true);
		exitButton.addActionListener(this);
		RightPanel.add(exitButton);

		// end of right panel elements.
		// Bottom panel layout
		BottomPanel = new JPanel();
		BottomPanel.setSize(765, 190);
		BottomPanel.setLocation(30, 485);
		BottomPanel.setLayout(new FlowLayout());
		add(BottomPanel);
		// BottomPanel.setBackground(Color.red);

		// bottom panel buttons act, run, reset
		actButton = new JButton("Act");
		actButton.setSize(75, 30);
		actButton.setLocation(50, 20);
		actButton.setVisible(true);
		actButton.setBackground(Color.white);
		actButton.addActionListener(this);
		BottomPanel.add(actButton);
		ImageIcon icon = new ImageIcon("images\\step.png");
		actButton.setIcon(icon);

		runButton = new JButton("Run");
		runButton.setSize(75, 30);
		runButton.setLocation(135, 20);
		runButton.setVisible(true);
		runButton.setBackground(Color.white);
		runButton.addActionListener(this);
		BottomPanel.add(runButton);
		ImageIcon icon2 = new ImageIcon("images\\run.png");
		runButton.setIcon(icon2);

		resetButton = new JButton("Reset");
		resetButton.setSize(90, 30);
		resetButton.setLocation(220, 20);
		resetButton.setVisible(true);
		resetButton.setBackground(Color.white);
		resetButton.addActionListener(this);
		BottomPanel.add(resetButton);
		ImageIcon icon3 = new ImageIcon("images\\reset.png");
		resetButton.setIcon(icon3);

		SpeedL = new JLabel("                 Speed:");
		SpeedL.setSize(60, 20);
		// SpeedL.setLocation(20,125);
		BottomPanel.add(SpeedL);

		speedSlider = new JSlider(10, 200);
		speedSlider.setMajorTickSpacing(10);
		speedSlider.setPaintTicks(true);
		speedSlider.addChangeListener(this);
		speedSlider.setVisible(true);
		BottomPanel.add(speedSlider);

		canvas = new GameCanvas();
		canvas.Xlocation = 200;
		canvas.Ylocation = 100;
		canvas.setSize(520, 470);
		canvas.setLocation(30, 0);
		canvas.setBackground(Color.red);
		add(canvas);

		t1 = new Timer(100, this);
		t2 = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				counter++;
				hours = counter / 3600;
				minutes = counter / 60;
				seconds = counter;
				Hour.setText(hours + "");
				Mins.setText(minutes + "");
				Seconds.setText(seconds + "");

				if (seconds > 60) {
					seconds = 0;
				}

			}
		});

		// menu Bar
		menuBar = new JMenuBar();
		menuScenario = new JMenu("Scenario");
		menuExit = new JMenuItem("Exit");
		menuControls = new JMenu("Controls");
		menuSave = new JMenuItem("Save");
		menuOpen = new JMenuItem("Open");
		menuEdit = new JMenu("Edit");
		menuCut = new JMenuItem("Cut");
		menuCopy = new JMenuItem("Copy");
		menuPaste = new JMenuItem("Paste");
		menuHelp = new JMenu("Help");
		menuAbout = new JMenuItem("About");
		menuControls.add(menuSave);
		menuControls.add(menuOpen);
		menuScenario.add(menuExit);
		menuEdit.add(menuCut);
		menuEdit.add(menuCopy);
		menuEdit.add(menuPaste);
		menuHelp.add(menuAbout);
		menuBar.add(menuScenario);
		menuBar.add(menuEdit);
		menuBar.add(menuControls);
		menuBar.add(menuHelp);
		setJMenuBar(menuBar);

		directionX = 10;
		directionY = 5;
		addKeyListener(this);
		this.requestFocus();
		setResizable(false);
		setVisible(true);

		// end of bottom panel components
		// http://www.dummies.com/programming/java/how-to-use-sliders-in-java/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ball movement
		if (e.getSource() == t1) {
			canvas.Ylocation += directionY;
			canvas.Xlocation += directionX;

			if (canvas.Xlocation >= canvas.getWidth() - 50 || canvas.Xlocation <= 0) {
				directionX = -directionX;
			}
			if (canvas.Ylocation >= canvas.getHeight() - 50 || canvas.Ylocation <= 0) {
				directionY = -directionY;
			}
		}

		// baby1
		if ((canvas.Xlocation >= canvas.XlocationB1 - 10 && canvas.Xlocation <= canvas.XlocationB1 + 10)
				&& (canvas.Ylocation >= canvas.YlocationB1 - 10 && canvas.Ylocation <= canvas.YlocationB1 + 10)) {

			rs++;
			directionX = -directionX;
			RightScore.setText(rs + "");
		}

		// baby2
		if ((canvas.Xlocation >= canvas.XlocationB2 - 10 && canvas.Xlocation <= canvas.XlocationB2 + 10)
				&& (canvas.Ylocation >= canvas.YlocationB2 - 10 && canvas.Ylocation <= canvas.YlocationB2 + 10)) {

			ls++;
			directionX = -directionX;
			LeftScore.setText(ls + "");

		}

		// baby3
		if ((canvas.Xlocation >= canvas.XlocationB3 - 10 && canvas.Xlocation <= canvas.XlocationB3 + 10)
				&& (canvas.Ylocation >= canvas.YlocationB3 - 10 && canvas.Ylocation <= canvas.YlocationB3 + 10)) {

			ls++;
			directionX = -directionX;
			LeftScore.setText(ls + "");
		}
		// baby4
		if ((canvas.Xlocation >= canvas.XlocationB4 - 10 && canvas.Xlocation <= canvas.XlocationB4 + 10)
				&& (canvas.Ylocation >= canvas.YlocationB4 - 10 && canvas.Ylocation <= canvas.YlocationB4 + 10)) {

			rs++;
			directionX = -directionX;
			RightScore.setText(rs + "");
		}

		// making the buttons work
		if (e.getSource() == exitButton) {
			System.exit(0);
		}

		if (e.getSource() == playerButton2) {
			canvas.BabyNum = 2;
		}

		if (e.getSource() == playerButton4) {
			canvas.BabyNum = 4;
		}

		if (e.getSource() == multiButton) {

		}

		if (e.getSource() == runButton) {
			run = !run;
			if (run) {
				stepDirection = false;
				t1.start();
				t2.start();

			} else {
				stepDirection = true;
				t1.stop();
				t2.stop();

			}
		}
		if (e.getSource() == actButton) {
			stepDirection = true;
		}

		if (e.getSource() == resetButton) {

			dispose();
			// GameDemo game = new GameDemo();
			new CBabyBallBounce().setVisible(true);

		}

		if (e.getSource() == UpButton) {

			canvas.Ylocation -= 32;
			canvas.repaint();

		}

		if (e.getSource() == DownButton) {

			canvas.Ylocation += 32;
			canvas.repaint();

		}

		if (e.getSource() == ForwardButton) {

			canvas.Xlocation += 32;

		}

		if (e.getSource() == BackwardsButton) {

			canvas.Xlocation -= 32;

		}

		canvas.repaint();
		this.requestFocus();

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// JOptionPane.showMessageDialog(null,"Test");
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			canvas.YlocationB2 -= 5;
		}

		if (key == KeyEvent.VK_DOWN) {
			canvas.YlocationB2 += 5;
		}

		if (key == KeyEvent.VK_W) {
			canvas.YlocationB3 -= 5;
		}

		if (key == KeyEvent.VK_S) {
			canvas.YlocationB3 += 5;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		t1.setDelay(210 - speedSlider.getValue());
	}

}

class GameCanvas extends JPanel {

	Image image;
	int BabyNum = 2;
	int Xlocation, Ylocation, XlocationB1 = 330, YlocationB1 = 250, XlocationB2 = 400, YlocationB2 = 250,
			XlocationB3 = 80, YlocationB3 = 250, XlocationB4 = 160, YlocationB4 = 250, XlocationW = 230, YlocationW = 0,
			XlocationBOX = 0, YlocationBOX = 0;

	Image imgball, imgbaby1, imgbaby2, imgbaby3, imgbaby4, imgWall, imgBox;

	public GameCanvas() {
		imgBox = Toolkit.getDefaultToolkit().getImage("images\\white.jpg");
		imgbaby1 = Toolkit.getDefaultToolkit().getImage("images\\baby1.png");
		imgbaby2 = Toolkit.getDefaultToolkit().getImage("images\\baby2.png");
		imgbaby3 = Toolkit.getDefaultToolkit().getImage("images\\baby1.png");
		imgbaby4 = Toolkit.getDefaultToolkit().getImage("images\\baby2.png");
		imgWall = Toolkit.getDefaultToolkit().getImage("images\\bricks2.jpg");
		imgball = Toolkit.getDefaultToolkit().getImage("images\\ball.png");
		Xlocation = 200;
		Ylocation = 300;
	}

	public void paint(Graphics g) {

		g.clearRect(0, 0, getWidth(), getHeight());
		for (YlocationBOX = 0; YlocationBOX <= 470; YlocationBOX += 32) {

			for (XlocationBOX = 0; XlocationBOX <= 520; XlocationBOX += 32) {
				g.drawImage(imgBox, XlocationBOX, YlocationBOX, this);
			}
		}

		g.drawImage(imgbaby2, XlocationB2, YlocationB2, this);
		g.drawImage(imgbaby3, XlocationB3, YlocationB3, this);

		if (BabyNum >= 4) {

			g.drawImage(imgbaby1, XlocationB1, YlocationB1, this);
			g.drawImage(imgbaby4, XlocationB4, YlocationB4, this);
		}

		for (YlocationW = 0; YlocationW <= 470; YlocationW += 72) {

			g.drawImage(imgWall, XlocationW, YlocationW, this);

		}
		g.drawImage(imgball, Xlocation, Ylocation, this);
	}

}
