import java.util.ArrayList;

public class Garden {

    private ArrayList<GardenSpot> gardenSpots;
    private int numberOfVegetableSlots;

    public Garden(int numberOfVegetableSlots) {
        this.numberOfVegetableSlots = numberOfVegetableSlots;
        this.gardenSpots = new ArrayList<>();

        //preparing vegetable spots
        for (int i = 0; i < numberOfVegetableSlots; i++) {
            gardenSpots.add(new GardenSpot());
        }
    }

    public ArrayList<GardenSpot> getGardenSpots() {
        return gardenSpots;
    }

    public int getNumberOfVegetableSlots() {
        return numberOfVegetableSlots;
    }

    public void elapseTime(int time) {
        for (GardenSpot spot : gardenSpots) {
            spot.getVegetable().setTimeSincePlanting(time);
        }
    }


}
