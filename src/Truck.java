public class Truck {
    private String truckID;
    private double odometer, mpg, fuel;
    private final double CAPACITY = 20.0;
    private static double totalFuel;

    public Truck (String truckID) {
        this.truckID = truckID;
        odometer = 0.0;
        mpg = 0.0;
        fuel = 0.0;
    }

    public Truck (String truckID, double odometer, double mpg, double fuel) {
        this.truckID = truckID;
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }

    public String getTruckID () {
        return truckID;
    }

    public double getOdometer () {
        return odometer;
    }

    public double getMpg () {
        return mpg;
    }

    public void setMpg (double mpg) {
        this.mpg = mpg;
    }

    public double getFuel () {
        return fuel;
    }

    public boolean enoughFuel (double miles) {
        if (mpg * fuel >= miles) {
            return true;
        }
        else {
            return false;
        }
    }

    public int drive (double miles) {

    }
}