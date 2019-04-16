
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();

		p1.setName("岩瀬");
		p1.setAddress("岡山");
		p1.setAge(21);

		Company c1 = new Company("株式会社ABC","岡山",100);

		System.out.println("私の名前は" + p1.getName() + "です。");
		System.out.println(p1.getAddress() + "生まれの" + p1.getAge() + "歳です。");

		System.out.println("私の会社は" + c1.getName() + "です。");
		System.out.println(p1.getAddress() + "の会社で、従業員数は" + c1.getNumberOfEmployees() + "人です。");

		c1.setAddress("東京");
		c1.setNumberOfEmployees(150);
		//c1.setName("")は、nameが読み取り専用なので使用できない。

		System.out.println("数年前に" + c1.getAddress() + "に移転し、" );
		System.out.println("従業員数も" + c1.getNumberOfEmployees() + "人にまで増えました。" );


	}

}
