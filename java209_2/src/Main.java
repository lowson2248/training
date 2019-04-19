import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {

	public static void main(String[] args) {

		String inPath = args[0];
		String outPath = args[1];
		FileInputStream fis = null;
		GZIPOutputStream gzip = null;

		try {
			fis = new FileInputStream(inPath);
			FileOutputStream fos = new FileOutputStream(outPath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzip = new GZIPOutputStream(bos);
			int i = fis.read();
			while(i != -1) {
				gzip.write(i);
				i= fis.read();
			}
			gzip.flush();
			gzip.close();
			fis.close();

		}catch(IOException e) {
			System.out.println("ファイル操作に失敗しました。");
			try {
				if(fis != null) { fis.close(); }
				if(gzip != null) { gzip.close(); }
			}catch(IOException ee) {}
		}//catch END

	}
}
