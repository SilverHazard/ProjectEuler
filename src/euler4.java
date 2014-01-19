/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler4 {
	public static boolean isPalindrome (int n) {
		String p = Integer.toString(n);
		String reversed = new StringBuffer(p).reverse().toString();
		return p.equalsIgnoreCase(reversed);
	}

	public static void main (String[] args) {
		int pal = 0;
		for (int a = 100; a < 1000; a++) {
			for (int b = 100; b < 1000; b++) {
				if (isPalindrome(a * b) && (a * b) > pal) {
					pal = a * b;
				}
			}
		}
		System.out.println(pal);
	}
}
