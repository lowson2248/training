
public class SeitoScore {
	String name;
	int score;

	SeitoScore(String name,int score){
		this.name = name;
		this.score = score;
	}

	public void dispName() {
		System.out.println(this.name);
	}

	public void dispScore() {
		System.out.println(this.score);
	}
}
