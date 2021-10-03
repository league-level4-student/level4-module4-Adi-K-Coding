package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
	static int mouseX;
	static int mouseY;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);

		timer = new Timer(1000 / 30, this);
		timer.start();
		polymorphs.add(new BluePolymorph(50, 50, 50, 50));
		polymorphs.add(new RedPolymorph(250, 500, 50, 50));
		// polymorphs.add(new MovingMorph(0, 0, 50, 50));
		polymorphs.add(new MathMorph(300, 300, 50, 50));
		polymorphs.add(new MouseMorph(200, 200, 50, 50));
//		polymorphs.add(new PictureMorph(200, 200, 50, 50));
//		polymorphs.add(new MessageMorph(200, 200, 50, 50));

	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.pink);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// draw polymorph
		for (int i = 0; i < polymorphs.size(); i++) {
			polymorphs.get(i).draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (int i = 0; i < polymorphs.size(); i++) {
			polymorphs.get(i).update();
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		mouseX = arg0.getX();
		mouseY = arg0.getY();
	}
}
