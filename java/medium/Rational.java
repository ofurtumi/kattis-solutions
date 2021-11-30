import java.util.Scanner;
import java.util.stream.IntStream;

public class Rational {
    private int numerator;
    private int denominator;

    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return this.numerator;
    }

    int getDenominator() {
        return this.denominator;
    }

    public Rational add(final Rational r) {

        final Rational sum = new Rational((this.numerator * r.denominator) + (r.numerator * this.denominator),
                this.denominator * r.denominator);

        return sum;
    }

    public Rational subtract(final Rational r) {

        final Rational diff = new Rational((this.numerator * r.denominator) - (r.numerator * this.denominator),
                this.denominator * r.denominator);

        return diff;
    }

    public Rational multiply(final Rational r) {

        final Rational product = new Rational(this.numerator * r.numerator, this.denominator * r.denominator);

        return product;
    }

    public Rational divide(final Rational r) {

        final Rational quotient = new Rational(this.numerator * r.denominator, this.denominator * r.numerator);

        return quotient;
    }

    private static int getGreatestCommonDivider(final int a, final int b) {
        if (b > a) {
            return getGreatestCommonDivider(b, a);
        }

        return IntStream.rangeClosed(1, a).filter(n -> (a % n) == 0).filter(n -> (b % n) == 0).max().orElse(1);
    }

    private static Rational merki(String op, Rational a, Rational b) {
        Rational;
        switch (op) {
            case "+":
                temp = a.add(b);

            case "-":
                temp = a.subtract(b);

            case "*":
                temp = a.multiply(b);

            case "/":
                temp = a.divide(b);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            String op = s.next();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            Rational b1 = new Rational(x1, y1);
            Rational b2 = new Rational(x2, y2);
            Rational bout = merki(op, b1, b2);

            

            int gcd = getGreatestCommonDivider(bout.getNumerator(),bout.getDenominator());
            out[i] = bout.getNumerator()/gcd + " / " + bout.getDenominator()/gcd;
        }

        for (String brot : out) {
            System.out.println(brot);
        }
    }
}

