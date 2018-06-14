public class Simulation {

    public static void main(String[] args) {

        System.out.println("EFFICENT FARMER");
        Farmer farmer1 = new EfficientFarmer();
        farmer1.setUpGarden(10);
        farmer1.simulate(farmer1.getGarden(), 50);
        farmer1.printRaport();

        System.out.println();

        System.out.println("INEFFICENT FARMER");
        Farmer farmer2 = new InefficientFarmer();
        farmer2.setUpGarden(10);
        farmer2.simulate(farmer2.getGarden(), 50);
        farmer2.printRaport();
    }

}
