public class Tomato extends Vegetable {

    public Tomato(VegetableEnum.VegEnum vegEnum) {
        //cost of planting a tomato is 3
        super(vegEnum, 3);
    }

    public int getCurrentValue() {

        // It's growing for the first 10 seconds,
        // and rots after 20.
        if (isBetween(getTimeSincePlanting(), 0, 10) ||
                isBetween(getTimeSincePlanting(), 21, Integer.MAX_VALUE)) {
            return 0;
        }

        // Increases linearly by 2, every second after tenth.
        if (isBetween(getTimeSincePlanting(), 11, 15)) {
            return (getTimeSincePlanting()-10)*2;
        }

        // Decreases linearly by 2, every second after tenth.
        if (isBetween(getTimeSincePlanting(), 16, 20)) {
            return 10 - (getTimeSincePlanting()-15)*2;
        }

        return 0;
    }
}
