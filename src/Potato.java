public class Potato extends Vegetable {

    public Potato(VegetableEnum.VegEnum vegEnum) {
        //cost of planting a potato is 2
        super(vegEnum, 2);
    }

    public int getCurrentValue() {

        // It's growing for the first 10 seconds,
        if (isBetween(getTimeSincePlanting(), 0, 10)) {
            return 0;
        }
        // It's worth 5 after that.
        if (isBetween(getTimeSincePlanting(), 11, Integer.MAX_VALUE)) {
            return 5;
        }

        return 0;
    }
}
