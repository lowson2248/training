public class Main{
	public static void main(String[] args){
		Employee engineer = new Engineer();
		Employee sales = new Sales();
		Employee designer = new Designer();

		EmployeeIntroducer introducer = new EmployeeIntroducer();

		introducer.introduce(engineer);
		introducer.introduce(sales);
		introducer.introduce(designer);

	}
}