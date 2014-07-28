import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;




public class ReadFromURL {
	public static void main(String[] args) {
		BufferedImage image = null;
		try {

			// URL url = new URL("http://www.mkyong.com/image/mypic.jpg");
			URL url = new URL(args[0]);
			image = ImageIO.read(url);


			// ImageIO.write(image, "gif", new File("C:\\out.gif"));
			ImageIO.write(image, args[1], new File(args[2]));


		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
