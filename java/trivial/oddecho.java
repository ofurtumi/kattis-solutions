import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String temp = "";
        for (int i = 1; i <= n; i++) {
            temp = s.next();
            if (i%2 != 0) System.out.println(temp);
        }
    }
}
