package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	Random rand = new Random();

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		int xUpdate = rand.nextInt(PolymorphWindow.WIDTH);
		int yUpdate = rand.nextInt(PolymorphWindow.HEIGHT);
		setX(xUpdate);
		setY(yUpdate);
	}
}
