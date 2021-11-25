import java.util.Scanner;

public class arrangement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int af = m%n;
        int lid = (m-af)/n;
        // System.out.println(af);
        // System.out.println(lid);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lid; j++) {
                System.out.print("*");
            }
            if (i<af) System.out.println("*");
            else System.out.println();
        }
    }
}
