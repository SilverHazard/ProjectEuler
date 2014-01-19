/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler6 {
	public static void main (String[] args) {
		int sumsquare = 0;
		int squaressum = 0;
		for(int i = 0; i<=100; i++)	{
			squaressum += i * i;
		}
		for(int i = 0; i <= 100; i++){
			sumsquare += i;
		}
		sumsquare *= sumsquare;
		System.out.println(sumsquare-squaressum);
	}
}