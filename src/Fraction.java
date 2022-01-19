public class Fraction {
    int numerator, denominator = 0;

    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.numerator >= 0 && this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    public Fraction () {
        numerator = 1;
        denominator = 1;
    }

    public int findGCD (int m, int n) {
        int m2, n2 = 0;
        while (m % n != 0) {
            m2 = m;
            n2 = n;
            m = n;
            n = m2 % n2;
        }
        if (n < 0) {
            return n * -1;
        }
        else return n;
    }

    public void reduceFraction () {
        int GCD = findGCD(numerator, denominator);
        numerator /= GCD;
        denominator /= GCD;
    }

    public static Fraction add (Fraction x, Fraction y) {

    }
}