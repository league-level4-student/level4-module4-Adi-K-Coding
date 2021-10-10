package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	public static BufferedImage image;

	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		loadImage("leagueImage.png");
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	void loadImage(String imageFile) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		} catch (Exception e) {
		}
	}

}
