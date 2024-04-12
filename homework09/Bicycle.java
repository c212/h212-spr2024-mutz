public class Bicycle {
    //Have private variables
    private double cadence;
    private double gearSize;

    //Instantiate a bike
    public Bicycle(double _gearSize){
        gearSize = _gearSize;
        cadence = 0;
    }

    //Change the cadence
    public void setCadence(double newCadence){
        cadence = newCadence;
    }

    //Get the speed
    public double getSpeed(){
        //speed = (gearSize * pi) / (12 * 5280) * cadence * 60
        return ((gearSize * Math.PI) / (12 * 5280) * cadence * 60);
    }
}
