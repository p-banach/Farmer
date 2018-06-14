public abstract class Vegetable {
    private int costOfPlanting;
    private int currentValue;
    private int finalValue;
    private int timeSincePlanting;
    private VegetableEnum.VegEnum vegEnum;

    public Vegetable(VegetableEnum.VegEnum vegEnum, int costOfPlanting) {
        this.vegEnum = vegEnum;
        this.costOfPlanting = costOfPlanting;
    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public int getTimeSincePlanting() {
        return timeSincePlanting;
    }

    public int getCostOfPlanting() {
        return costOfPlanting;
    }

    protected void setFinalValue(int finalValue) {
        this.finalValue = finalValue;
    }

    public void setFinalValue() {
        this.finalValue = getCurrentValue();
    }

    @Override
    public String toString() {
        switch (vegEnum) {
            case POTATO:
                return "POTATO";
            case TOMATO:
                return "TOMATO";
            case ONION:
                return "ONION";
            default:
                return "Something's wrong with this vegetable";
        }
    }

    public abstract int getCurrentValue();

}
