public class InefficientFarmer extends Farmer {

    public void simulate(Garden garden, int time) {

        for (GardenSpot spot : garden.getGardenSpots()) {
            plantVegetable(spot, VegetableEnum.getRandomVegetable());
        }

        for (int timeElapsed = 0; timeElapsed < time; timeElapsed += 10) {
            // this farmer checks on his crops every ten seconds
            // and plants them randomly
            garden.elapseTime(timeElapsed);

            for (GardenSpot spot : garden.getGardenSpots()) {
                collectVegetable(spot);
            }

            for (GardenSpot spot : garden.getGardenSpots()) {
                plantVegetable(spot, VegetableEnum.getRandomVegetable());
            }

        }
    }

}
