public class Problem4 {
    public static void main(String[] args) {
        //Running the bicycle
        Bicycle myBike = new Bicycle(7);
        myBike.setCadence(600);

        System.out.println(myBike.getSpeed());
    }
}
