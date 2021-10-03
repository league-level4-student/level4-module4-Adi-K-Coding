package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;

	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int xValue) {
		x = xValue;
	}

	public int getY() {
		return y;
	}

	public void setY(int yValue) {
		y = yValue;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width1) {
		width = width1;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height1) {
		height = height1;
	}
}
