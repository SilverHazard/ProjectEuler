/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler3 {
	public static boolean isPrime (int p) {
		if (p % 2 == 0) return false;
		for (int i = 3; i * i <= p; i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main (String[] args) {
		int pf = 1;
		double check = 600851475143.0;
		for (int i = 1; i <= Math.sqrt(check); i += 2) {
			if (check % i == 0 && isPrime(i)) {
				pf = i;
			}
		}
		System.out.println(pf);
	}
}