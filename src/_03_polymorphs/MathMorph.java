package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MathMorph extends Polymorph {
	double angle = 0;

	MathMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect((int) (getX() + Math.cos(angle) * 100), (int) (getY() + Math.sin(angle) * 100), getWidth(),
				getHeight());
	}

	public void update() {
		angle += 0.05;
	}
}
