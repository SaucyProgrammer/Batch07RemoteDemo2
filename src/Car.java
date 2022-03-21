public class Car extends Vehicle {

    private boolean HasTrailer;
    private boolean isHov;



    public Car(int distanceTraveled, boolean hasTrailer, boolean isHov) {
        super( distanceTraveled );
        HasTrailer = hasTrailer;
        this.isHov = isHov;
        calculateToll();
    }

    public boolean isHasTrailer() {
        return HasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        HasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean hov) {
        isHov = hov;
    }

    @Override
    public void calculateToll() {
     double toll = this.getDistanceTraveled()*0.020;
     if(this.isHov){
         toll = 0;
     }
     if (this.HasTrailer){
         toll++;
         this.setToll( toll );

     }
    }
    /** Added first edited line of code: 1**/

    /** Second line of edit code in this file: 3
     * System.out.println("Hello, World!");
     * **/


    @Override
    public String toString() {
        return "Car:   " + getDistanceTraveled()+ "   "+"$"+this.getToll();
    }
}