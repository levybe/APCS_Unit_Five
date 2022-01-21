public class Fraction {
    int numerator, denominator = 0;

    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.numerator >= 0 && this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        reduceFraction();
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
        int newNumerator = x.numerator * y.denominator + y.numerator * x.denominator;
        int newDenominator = x.denominator * y.denominator;

        return new Fraction (newNumerator, newDenominator);
    }

    public static Fraction subtract (Fraction x, Fraction y) {
        int newNumerator = x.numerator * y.denominator - y.numerator * x.denominator;
        int newDenominator = x.denominator * y.denominator;

        return new Fraction (newNumerator, newDenominator);
    }

    public static Fraction multiply (Fraction x, Fraction y) {
        int newNumerator = x.numerator * y. numerator;
        int newDenominator = x.denominator * y.denominator;

        return new Fraction (newNumerator, newDenominator);
    }

    public static Fraction divide (Fraction x, Fraction y) {
        int newNumerator = x.numerator * y.denominator;
        int newDenominator = x.denominator * y.numerator;

        return new Fraction (newNumerator, newDenominator);
    }

    public int getNumerator () {
        return numerator;
    }

    public int getDenominator () {
        return denominator;
    }

    public String toString () {
        if (numerator > denominator) {
            if (numerator < 0) {
                return (numerator / denominator) + " " + ((numerator * -1) % denominator) + "/" + denominator;
            }
            return (numerator / denominator) + " " + (numerator % denominator) + "/" + denominator;
        }
        else {
           return numerator + "/" + denominator;
        }
    }
}