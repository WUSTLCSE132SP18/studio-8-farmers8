package studio8;

//import java.io.InputStreamReader;
//import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
	public class CountSteps {
		
	void main() throws IOException {
			
		String content = new String(Files.readAllBytes(Paths.get("data.csv")));
		System.out.println(content);
		/*Scanner sys = new Scanner( new InputStreamReader(System.in));
		while (true) {
			if (sys.hasNext() == true) {
				String input = sys.nextLine();
				byte[] strBytes = input.getBytes();
				for (int i = 0; i < strBytes.length; i++) {
					
				}
			}
		}*/
			
	}
		
	}