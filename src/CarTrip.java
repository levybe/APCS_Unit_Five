public class CarTrip {
    int myStartOdometer = 0;
    int myEndOdometer = 0;
    double myTime = 0.0;
    double myGallonsUsed = 0.0;

    public CarTrip (int myStartOdometer, int myEndOdometer, double myTime, double myGallonsUsed) {
        this.myStartOdometer = myStartOdometer;
        this.myEndOdometer = myEndOdometer;
        this.myTime = myTime;
        this.myGallonsUsed = myGallonsUsed;
    }

    public CarTrip() {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public int getMyStartOdometer () {
        return myStartOdometer;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyStartOdometer (int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getTripDistance () {
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed () {
        return getTripDistance() / myTime;
    }

    public double getGasMileage () {
        return getTripDistance() / myGallonsUsed;
    }

    public double getTotalGasPrice (double pricePerGallon) {
        return myGallonsUsed * pricePerGallon;
    }
}
