
package binomialdistribution;
import java.math.BigInteger;
public class BinomialDistribution {
    
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
        
        int n = 6;         // number of trials
        double p = 0.50;    // probability of event
        int x = n;          // [0;x] values of random variable
        double sum=0;
        double expected=0;
        
        for (int i = 0; i <= x; i++) {
            double out;            
            out = binom(n,i)*Math.pow(p, i)*Math.pow(1-p, n-i);
            sum+=out;
            expected+= out*i;
            System.out.println(i+": "+out);
        }
        System.out.println("Expected : "+ expected);
        System.out.println("Sum: "+sum);
        
    }

}
