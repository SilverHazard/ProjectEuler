/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler2 {
	public static void main (String[] args) {
		int a;
		int b = 2;
		int c = 3;
		int sum = 2;
		while (c <= 4000000) {
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
			c = a + b;
		}
		System.out.print(sum);
	}
}
