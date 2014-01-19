/**
 * Created by SilverHazard on 19.01.14.
 */
public class euler9 {
	public static void main(String[] args){
		for(int a = 0; a < 997; a++){
			for(int b = 0; b < 998; b++){
				for(int c = 0; c < 998; c++){
					if((a+b+c) == 1000 && a<b && b < c && ((a*a)+(b*b)==(c*c))){
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}