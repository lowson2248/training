
public class StrongBox<E> {

	//鍵の種類
	private keyType keyType;
	private E item;

	//鍵の施行回数カウント
	private int count = 0;

	//put
	public void put(E i) {
		this.item = i;
	}

	//get
	public E get() {
		this.count++;
		switch(this.keyType) {

			case PADLOCK :
				if(count < 1024) return null;
				break;

			case BUTTON :
				if(count < 10000) return null;
				break;

			case DIAL :
				if(count < 30000) return null;
				break;

			case FINGER :
				if(count < 1000000) return null;
				break;
		}//switch END
		this.count = 0;
		return this.item;
	}
}
