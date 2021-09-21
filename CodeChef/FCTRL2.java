package CodeChef;

import java.math.BigInteger;
import java.util.*;

/**
 * FCTRL2
 */
public class FCTRL2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int k = sc.nextInt();
                BigInteger bi = new BigInteger("1");

                for (int i = 2; i <= k; i++) {
                    bi = bi.multiply(BigInteger.valueOf(i));
                }
                System.out.println(bi);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}