import java.util.ArrayList;

public class Garden {

    private GardenSpot[] gardenSpots;

    public GardenSpot[] getGardenSpots() {
        return gardenSpots;
    }

    public int getNumberOfVegetableSlots() {
        return numberOfVegetableSlots;
    }

    private int numberOfVegetableSlots;

    public Garden(int numberOfVegetableSlots) {
        this.numberOfVegetableSlots = numberOfVegetableSlots;
        this.gardenSpots = new GardenSpot[numberOfVegetableSlots];
        for (GardenSpot spot:gardenSpots) {
            spot = new GardenSpot();
        }
    }

    public void recalculateVegetableValues() {
        for (GardenSpot spot : gardenSpots) {
            spot.getVegetable().getCurrentValue();
        }
    }


}
