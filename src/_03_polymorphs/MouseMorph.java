package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MouseMorph extends Polymorph {

	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		setX(PolymorphWindow.mouseX);
		setY(PolymorphWindow.mouseY);
	}

}
