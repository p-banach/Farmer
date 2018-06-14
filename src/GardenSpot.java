public class GardenSpot {
    private Vegetable vegetable;
    private boolean isFree;
    public GardenSpot() {
        this.isFree = true;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public void plantVegetableInSpot(Vegetable vegetable){
        if(isFree && vegetable!=null)
         this.vegetable = vegetable;
    }

    public void freeSpot(){
        this.isFree = true;
        this.vegetable = null;
    }
}
