package clases;

public class IcedCoffee {
    private String typeOFCoffee;
    private int gramsOfCoffee;
    private int mlOfWater;
    private int sugarPacks;
    private double price;
    private boolean milk;
    private boolean ice;

    public IcedCoffee(String typeOFCoffee, int gramsOfCoffee, int mlOfWater, int sugarPacks, double price, boolean milk, boolean ice) {
        this.typeOFCoffee = typeOFCoffee;
        this.gramsOfCoffee = gramsOfCoffee;
        this.mlOfWater = mlOfWater;
        this.sugarPacks = sugarPacks;
        this.price = price;
        this.milk = milk;
        this.ice = ice;
    }

    public String getTypeOFCoffee() {
        return typeOFCoffee;
    }

    public void setTypeOFCoffee(String typeOFCoffee) {
        this.typeOFCoffee = typeOFCoffee;
    }

    public int getGramsOfCoffee() {
        return gramsOfCoffee;
    }

    public void setGramsOfCoffee(int gramsOfCoffee) {
        this.gramsOfCoffee = gramsOfCoffee;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    public int getSugarPacks() {
        return sugarPacks;
    }

    public void setSugarPacks(int sugarPacks) {
        this.sugarPacks = sugarPacks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
