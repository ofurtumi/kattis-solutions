import java.util.Scanner;

public class expandingrods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            int L = s.nextInt();
            int n = s.nextInt();
            double c = s.nextDouble();

            if (!(L==-1 && n==-1 && c==-1)) {
                System.out.println("out: " + formula(L, n, c));
            }
            else break;
        }
    }

    private static double formula (int L, int n, Double c) {
        double Lmerkt = (1+n*c)*L;
        return Lmerkt;
    }
}
