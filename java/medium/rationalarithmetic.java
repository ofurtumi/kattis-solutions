import java.util.Scanner;

public class rationalarithmetic {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            String op = s.next();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            int x3 = 0;
            int y3 = 0;

            switch (op) {
                case "+":
                    x3 = x1*y2+x2*y1;
                    y3 = y1*y2;
                    break;

                case "-":
                    x3 = x1*y2-x2*y1;
                    y3 = y1*y2;
                    break;

                case "*":
                    x3 = x1*x2;
                    y3 = y1*y2;
                    break;

                case "/":
                    x3 = x1*y2;
                    y3 = y1*x2;
                    break;
            }

            int stud = Math.abs(euclid(x3,y3));

            int xout = x3/stud;
            int yout = y3/stud;

            out[i] = xout + " / " + yout;
        }

        for (String string : out) {
            System.out.println(string);
        }
    }

    private static int euclid (int x, int y) {
        if (y == 0) return x;
        return euclid(y, x % y);
    }
}