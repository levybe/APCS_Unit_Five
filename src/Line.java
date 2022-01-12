class Line {
    int a, b, c = 0;

    public Line (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope () {
        return  ((double) (a * -1) / b);
    }

    public boolean isOnLine (int x, int y) {
        if ((a * x) + (b * y) + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isParallel (Line other) {
        if (this.getSlope() == other.getSlope()) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString () {
        return a + "x + " + b + "y + " + c;
    }
}
