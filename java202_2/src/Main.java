import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {


		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		//日付を取得
		int day = cal.get(Calendar.DAY_OF_MONTH);

		//100日足した時間をカレンダーcalにセット
		cal.set(Calendar.DAY_OF_MONTH,(day+100));

		Date f_day = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(f_day));

	}
}
