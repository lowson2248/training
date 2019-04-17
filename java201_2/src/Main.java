
public class Main {

	public static void main(String[] args) {

		System.out.println(buildPath("C:\\abc\\efg", "test.txt"));

	}

	public static String buildPath(String folder,String file) {

		//\で終わるか調べる(エスケープのため、\\に。)
		if(!folder.endsWith("\\")) {
			//フォルダ名に\を追加
			folder += "\\";
		}
		return folder + file;
	}

}
