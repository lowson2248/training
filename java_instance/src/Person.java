
public class Person {

		String name;
		String address;
		int age;

		public Person(String name,String address,int age){
			this.name = name;
			this.address = address;
			this.age = age;
		}
		public void selfIntroduction() {
			System.out.println("私の名前は" + this.name + "です。");
			System.out.println(this.address + "生まれの" + this.age + "歳です。");
		}
}
