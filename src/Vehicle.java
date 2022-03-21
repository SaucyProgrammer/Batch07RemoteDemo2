public abstract class Vehicle {

    private double toll;
    private int distanceTraveled;

    public Vehicle(){

    }

   protected Vehicle( int distanceTraveled) {

        this.distanceTraveled = distanceTraveled;
    }

    public double getToll() {
        return toll;
    }

    public void setToll(double toll) {
        this.toll = toll;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public abstract void calculateToll();
}
