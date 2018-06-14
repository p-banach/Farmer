import java.util.Random;

public class VegetableEnum {

    public static VegEnum getRandomVegetable() {
        Random random = new Random();
        return VegEnum.values()[random.nextInt(VegEnum.values().length)];
    }

    public enum VegEnum {
        POTATO,
        TOMATO,
        ONION
    }
}