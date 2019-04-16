
public class SeitoScore {
	private String name;
	private int score;

	SeitoScore(String name,int score){
		this.setName(name);
		this.setScore(score);
	}

	public void dispName() {
		System.out.println(this.getName());
	}

	public void dispScore() {
		System.out.println(this.getScore());
	}


	//アクセサメソッド
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
