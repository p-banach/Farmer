public class EfficientFarmer extends Farmer {

    // a notebook to record vegetable values
    private int[] notebook;

    @Override
    public void setUpGarden(int numberOfVegetableSpots) {
        // this farmer takes more time setting up a garden,
        // and carries a notebook
        super.setUpGarden(numberOfVegetableSpots);
        notebook = new int[numberOfVegetableSpots];
    }

    public void simulate(Garden garden, int time) {

        for (GardenSpot spot : garden.getGardenSpots()) {
            plantVegetable(spot, VegetableEnum.getRandomVegetable());
        }

        for (int timeElapsed = 0; timeElapsed < time; timeElapsed++) {
            // this farmer checks on his crops every second
            // and collects them, if their value is lower than
            // last time he checked

            for (int j = 0; j < garden.getNumberOfVegetableSlots(); j++) {
                notebook[j] = garden.getGardenSpots().get(j).getVegetable()
                        .getCurrentValue();
            }

            garden.elapseTime(timeElapsed);

            for (int j = 0; j < garden.getNumberOfVegetableSlots(); j++) {
                if (garden.getGardenSpots().get(j).getVegetable().getCurrentValue() <
                        notebook[j]) {
                    collectVegetable(garden.getGardenSpots().get(j));
                    plantVegetable(garden.getGardenSpots().get(j), VegetableEnum.getRandomVegetable());
                }
            }
        }
    }

}
