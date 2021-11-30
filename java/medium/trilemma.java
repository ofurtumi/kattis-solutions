import java.util.Scanner;

public class trilemma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        
        for (int i = 0; i < n; i++) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            int x3 = s.nextInt();
            int y3 = s.nextInt();

            if (x1 == x2 && x1 == x3) {
                System.out.println("Case #" + i + ": not a triangle");
                continue;
            }
            if (y1 == y2 && y1 == y3) {
                System.out.println("Case #" + i + ": not a triangle");
                continue;
            }

            
        }
    }
}
