import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {
		Reader r = new FileReader("C:\\Training\\pref.properties");
		Properties pr = new Properties();
		pr.load(r);

		System.out.println(pr.getProperty("aichi.capital") + " : " + pr.getProperty("aichi.food"));

	}
}
