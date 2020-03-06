package grade_5kyu;

public class HumanReadableTime {

	public static void main(String[] args) {
		System.out.println(makeReadable(86399));
	}

	public static String makeReadable(int seconds) {
		int h = seconds / 3600;
		int m = (seconds % 3600) / 60;
		int s = (seconds % 3600) % 60;

		StringBuilder time = new StringBuilder();
		
		appendAppropriately(h, time);
		time.append(":");
		appendAppropriately(m, time);
		time.append(":");
		appendAppropriately(s, time);
		return time.toString();
	}
	
	public  static StringBuilder appendAppropriately(int value, StringBuilder time) {
		if (value < 10)
			time.append("0" + value);
		else
			time.append(value);
		
		return time;
	}
}
