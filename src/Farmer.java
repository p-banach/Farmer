import java.util.ArrayList;

public abstract class Farmer {

    private Garden garden;
    private ArrayList<Vegetable> collectedVegetables = new ArrayList<>();
    private int income;
    private int costs;

    public Farmer() {}

    public Garden getGarden() {
        return garden;
    }

    public void setUpGarden(int numberOfVegetableSpots) {
        garden = new Garden(numberOfVegetableSpots);
    }

    void collectVegetable(GardenSpot spot) {
        if (spot != null) {
            spot.getVegetable().saveFinalValue();
            collectedVegetables.add(spot.getVegetable());

            System.out.println("Picked up: " + spot.getVegetable() +
                    " (value: " + spot.getVegetable().getCurrentValue() +")");
            income += spot.getVegetable().getCurrentValue();
            spot.freeSpot();
        }
    }

    void plantVegetable(GardenSpot spot, VegetableEnum.VegEnum vegEnum) {
        if (spot == null) {
            spot = new GardenSpot();
        }

        Vegetable vegBeingPlanted = getVegetableTypeByEnum(vegEnum);

        System.out.println("Planted: " + vegBeingPlanted);
        spot.plantVegetableInSpot(vegBeingPlanted);

        costs += spot.getVegetable().getCostOfPlanting();

    }

    private Vegetable getVegetableTypeByEnum(VegetableEnum.VegEnum vegEnum) {
        switch (vegEnum) {
            case POTATO:
                return new Potato(VegetableEnum.VegEnum.POTATO);
            case TOMATO:
                return new Tomato(VegetableEnum.VegEnum.TOMATO);
            case ONION:
                return new Onion(VegetableEnum.VegEnum.ONION);
            default:
                return null;
        }
    }

    public void printRaport() {
        System.out.println("This season I earned: " + income);
        System.out.println("              spent: " + costs);
        System.out.println("Collected vegetables:");
        for (Vegetable veg : collectedVegetables) {
            System.out.println(veg);
        }

    }

    public abstract void simulate(Garden g, int time);

}


