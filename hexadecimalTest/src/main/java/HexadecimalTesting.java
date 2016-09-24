/**
 * Created by ScorpionOrange on 2016/09/24.
 */
public class HexadecimalTesting {
    public static void main(String[] args){
        System.out.println("53 % 3 = " + new HexadecimalTesting().hexadecimal(5, 2));
    }

    public String hexadecimal(int m, int n){
        int remainder = 0;
        String output = "";

        while ( m > n ){
            remainder = m % n;
            m = m / n;
            output = remainder + output;
        }
        output = m % n + output;
        return output;
    }
}
