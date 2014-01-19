/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler7 {
	public static void main(String[] args){
		int count = 1;
		int number = 1;
		int prime = 0;
		while (count <= 10001){
			if (isPrime(number)){
				prime = number;
				count++;
			}
			number++;
		}
		System.out.println(prime);
	}
	public static boolean isPrime (int p) {
		if (p % 2 == 0) return false;
		for (int i = 3; i * i <= p; i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
