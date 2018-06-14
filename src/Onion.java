public class Onion extends Vegetable {

    public Onion(VegetableEnum.VegEnum vegEnum) {
        //cost of planting an onion is 1
        super(vegEnum, 1);
    }

    public int getCurrentValue(){
        // Onions stay fresh up to a year,
        // so their value is constant
        return 1;
    }

    @Override
    public void setFinalValue(){
        super.setFinalValue(1);
    }
}
