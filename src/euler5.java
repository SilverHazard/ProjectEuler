/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler5 {
	public static void main (String[] args) {
		int i = 1;
		for (; ; i++) {
			if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 14 == 0 && i % 13 == 0 &
					i % 11 == 0) {
				break;
			}
		}
		System.out.println(i);
	}
}
