import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Tile {
	int degrees;
	int[] degreesChoices = {0, 90, 180, 270};
	ImageIcon img;
	BufferedImage img1;
	
	Tile(String filepath){
		img = new ImageIcon(getClass().getResource(filepath));
		img1 = LoadImage(filepath);
		Random rand = new Random();
		degrees = rand.nextInt(((3 + 1) - 0) + 0);
	}
	
	BufferedImage LoadImage(String filename) {
		BufferedImage img2 = null;
		try {
			img2 = ImageIO.read(getClass().getResource(filename));
		} catch (IOException e) {
			
		}
		return img2;
	}
}
