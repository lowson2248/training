package sakaQ2;

public class Elats {

	public static void main(String[] args) {

		//素数候補
		int sieve[] = new int[1001];
		sieve[0] = 0;
		sieve[1] = 0;
		for(int idx = 2 ; idx < sieve.length ; idx++) {
			sieve[idx] = 1;
		}

		int count = 0;

		for(int i=2 ; i < sieve.length ; i++) {
			for(int j = 1 ; j<sieve.length-2;j++) {

					if(j*i < 999 && j*i != i && sieve[j*i] == 1) {
						sieve[j*i] = 0;
					}//if END

					if(j*i < 999 && sieve[j*i] == 1) {
						count++;
					}
			}//for END
		}//for END

		//count出力
		System.out.println("countは" + count);
	}

}
