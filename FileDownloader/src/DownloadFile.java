
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadFile {

	public static void main(String[] args) throws IOException {
		String imageUrl = args[0];
		String destinationFile = args[1];
		saveImage(imageUrl, destinationFile);
	}

	public static void saveImage(String imageUrl, String destinationFile)
			throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}
}