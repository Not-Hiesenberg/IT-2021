
package hypergeometric;

import java.math.BigInteger;

/**
 *
 * @author Keeran Moodley
 */
public class Hypergeometric {

    static int binom(int N, int K) {
    BigInteger ret = BigInteger.ONE;
    for (int k = 0; k < K; k++) {
        ret = ret.multiply(BigInteger.valueOf(N-k))
                 .divide(BigInteger.valueOf(k+1));
    }
    return ret.intValue();
}
    
    public static void main(String[] args) {
        // CODE HERE
        int N = 20;  //population size
        int n= 6;   //sample size
        int p = 8;  //number of sucesses
        int r =n;   //number of sucesses required
        
       double sum = 0;
       double expected = 0;
        
       for (int i = 0; i <= r; i++) {
            double out;            
            out = (binom(p, i)*binom(N-p, n-i))/(double) binom(N, n);
            sum+=out;
            expected+= out*i;
            System.out.println(i+": "+out);
        }
        System.out.println("Expected : "+ expected);
        System.out.println("Sum: "+sum);
    }

}
