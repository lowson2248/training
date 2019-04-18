import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Comparable<Book>,Cloneable{
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


	//本のタイトル
	private String title;
	//発行日
	private Date publishDate;
	//コメント
	private String comment;


	public Book(String title, Date publish, String comnt) {
		this.setTitle(title);
		this.setPublishDate(publish);
		this.setComment(comnt);
	}

	public Book() throws Exception{
		this.setTitle("名称不明");
		this.setPublishDate(format.parse("2018-7-11"));
		this.setComment("おそらくアンパンマンかと");
	}


	//hashCodeのオーバーライド
	public int hashCode() {
		int result = 37;
		result = result * 31 + title.hashCode();
		result = result * 31 + publishDate.hashCode();
		return result;
	}//hashCode END


	//equalsのオーバーライド
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}else if(this == null) {
			return false;
		}//if END

		//Bookに変換可能か見る。
		if(!(o instanceof Book)) {
			return false;
		}//if END

		//オブジェクトをBook型へ。
		Book b = (Book) o;

		//発行日チェック
		if(!publishDate.equals(b.getPublishDate())) {
			return false;
		}//if END

		//タイトルチェック
		if(!title.equals(b.getTitle())) {
			return false;
		}//if END

		return true;
	}//equals END


	//発行日で順序決め
	public int compareTo(Book b) {
		return this.getPublishDate().compareTo(b.getPublishDate());
	}//compareTo END


	//クローンづくり
	public Book clone() {
		Book b=null;

		try {
			b = new Book();
		} catch (Exception e) {
			e.printStackTrace();
		}

		b.setTitle(this.getTitle());
		b.setPublishDate(this.getPublishDate());
		b.setComment(this.getComment());
		return b;
	}//clone END

	//アクセサメソッド
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
