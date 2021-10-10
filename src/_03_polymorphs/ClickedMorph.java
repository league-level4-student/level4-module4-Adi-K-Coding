package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class ClickedMorph extends Polymorph {

	ClickedMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		if ((PolymorphWindow.clickX <= getX() + getWidth()) && (PolymorphWindow.clickX >= getX())
				&& (PolymorphWindow.clickY <= getY() + getHeight()) && (PolymorphWindow.clickY >= getY())) {
			JOptionPane.showMessageDialog(null, "It Works!!");
			PolymorphWindow.clickX=5000;
			PolymorphWindow.clickY=5000;
		}
	}

}
