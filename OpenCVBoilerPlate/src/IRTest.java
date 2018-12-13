import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

import nu.pattern.OpenCV;

public class IRTest {
	
	public static void main(String[] args) {
		OpenCV.loadShared();
		 System.out.println("Welcome to OpenCV " + Core.VERSION);
		 VideoCapture videoCapture = new VideoCapture(0); //0 is my laptopCam, 1 is the logitech cam
		 Mat image = new Mat();
		 videoCapture.read(image);
		 Imgcodecs.imwrite("test.jpg", image);
		 System.out.println("Wrote image");
	        
	}

}
