import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {

		//追加課題　Bookクラスにタイトル、発行日、コメントを表示できるようにtoString()をオーバーライドしたメソッドを作成しなさい

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Book book1 = new Book("Java入門",format.parse("2019-4-18"),"あああああ");
		Book book2 = new Book("Java実践",format.parse("2019-4-18"),"いいいいい");
		Book book3 = new Book("Java入門",format.parse("2019-4-18"),"ううううう");
		Book book4 = new Book("Java入門",format.parse("2019-5-18"),"えええええ");
		Book book5 = new Book("Java入門",format.parse("2019-3-18"),"おおおおお");


		//equals
		System.out.println("\nequalsによる等価判定");
		if (book1.equals(book2)) {
			System.out.println("book1とbook2は等価である");
		}else {
			System.out.println("book1とbook2は等価ではない");
		}

		if (book1.equals(book3)) {
			System.out.println("book1とbook3は等価である");
		}else {
			System.out.println("book1とbook3は等価ではない");
		}

		//HashCode
		System.out.println("\nハッシュ値による等価判定");
		Set<Book> set = new HashSet<>();

		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		set.add(book5);


		//book1とbook3は等価なので格納しようとしても無視される
		for(Book b : set) {
			System.out.println(b.toString());
		}

		//compareTo
		System.out.println("\ncompareToによるソート");
		List<Book> list = new ArrayList<>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		System.out.println("ソート前");

		for(Book b : list) {
			System.out.println(b.toString());
		}

		System.out.println("ソート後");
		Collections.sort(list);
		for(Book b : list) {
			System.out.println(b.toString());
		}


		//clone
		System.out.println("\n深いクローン");
		System.out.println(book1);
		Book clonedBook1 = book1.clone();
		System.out.println(clonedBook1);
	}


	public static int kaijo(int i) {
		if (i == 1)
			return 1;
		return kaijo(i - 1) * i;
	}
}