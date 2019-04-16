public class Company {
	private String name;
	private String address;
	private int NumberOfEmployees;

	//コンストラクタ
	public Company(String name,String address,int number) {
	this.setName(name);
	this.setAddress(address);
	this.setNumberOfEmployees(number);
	}

	//nameのアクセサメソッド
	public String getName() {
		return name;
	}
	//setNameは参照できないように
	private void setName(String name) {
		this.name = name;
	}

	//addressのアクセサメソッド
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//numのアクセサメソッド
	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}


}