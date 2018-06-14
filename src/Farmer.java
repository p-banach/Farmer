import java.util.ArrayList;

public abstract class Farmer {

    private Garden garden;
    private ArrayList<Vegetable> collectedVegetables;

    public Farmer() {
    }

    public void setUpGarden(int vegetableSpots) {
        garden = new Garden(vegetableSpots);
    }

    public void collectVegetable(int garden_spot, ArrayList<Vegetable> collectedVegetables) {
        if (garden_spot >= 0 && garden_spot <= garden.getNumberOfVegetableSlots()) {
            garden.getGardenSpots()[garden_spot].getVegetable().setFinalValue();
            collectedVegetables.add(garden.getGardenSpots()[garden_spot].getVegetable());

            System.out.println("Picked up: " + garden.getGardenSpots()[garden_spot] +
                    " (value: " + garden.getGardenSpots()[garden_spot].getVegetable().getCurrentValue());

            garden.getGardenSpots()[garden_spot].freeSpot();
        }
    }

    public void plantVegetable(int garden_spot, VegetableEnum.VegEnum vegEnum) {
        if (garden_spot >= 0 && garden_spot <= garden.getNumberOfVegetableSlots()) {

            Vegetable vegBeingPlanted = null;

            switch (vegEnum) {
                case POTATO:
                    vegBeingPlanted = new Potato(VegetableEnum.VegEnum.POTATO);
                    break;
                case TOMATO:
                    vegBeingPlanted = new Tomato(VegetableEnum.VegEnum.TOMATO);
                    break;
                case ONION:
                    vegBeingPlanted = new Onion(VegetableEnum.VegEnum.ONION);
                    break;
                default:
                    break;
            }
            System.out.println("Planted: " + vegBeingPlanted);

            garden.getGardenSpots()[garden_spot].plantVegetableInSpot(vegBeingPlanted);
        }
    }

    public abstract void simulate(Garden g, int time);

}


