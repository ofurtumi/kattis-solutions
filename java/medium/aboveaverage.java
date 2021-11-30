import java.util.Arrays;
import java.util.Scanner;

public class aboveaverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int C = s.nextInt();
        double[] outs = new double[C];

        for (int i = 0; i < C; i++) {
            int n = s.nextInt();
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = s.nextInt();
            }

            double av = Arrays.stream(m).average().orElse(Double.NaN);
            int counter = 0;
            for (int j : m) {
                if (j > av) {
                    counter++;
                }
            }

            outs[i] = ((double)counter / n) * 100;
        }

        for (double d : outs) {
            System.out.printf("%.3f%%%n",d);
        }
    }
}
