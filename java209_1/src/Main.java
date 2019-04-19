import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String inPath = args[0];
		String outPath = args[1];

		System.out.println(inPath);
		System.out.println(outPath);

		FileInputStream is = new FileInputStream(inPath);
		FileOutputStream 	os = new FileOutputStream(outPath);
			int i = is.read();
			while(i != -1) {
				os.write(i);
				i= is.read();
			}

			os.flush();
			os.close();
			is.close();
	}
}
