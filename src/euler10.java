/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler10 {
	public static void main(String[] args){
		long sum = 2;
		int i = 3;
		while (i < 2000000){
			if(isPrime(i)){
				sum += i;
			}
			i+=2;
		}
		System.out.println(sum);
	}

	public static boolean isPrime (int p) {
		if (p % 2 == 0) return false;
		for (int i = 3; i <= Math.sqrt(p); i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
