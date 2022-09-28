package clases;

public class CoffeeShop {
    private String name;
    private Espresso espresso;
    private Ristretto ristretto;
    private Americano americano;
    private Doppio doppio;
    private Cappuccino cappuccino;
    private Frappe frappe;
    private IcedCoffee icedCoffee;
    private Latte latte;
    private Lungo lungo;

    public CoffeeShop(String name, Espresso espresso) {
        this.name = name;
        this.espresso = espresso;
    }

    public CoffeeShop(String name, Ristretto ristretto) {
        this.name = name;
        this.ristretto = ristretto;
    }

    public CoffeeShop(String name, Americano americano) {
        this.name = name;
        this.americano = americano;
    }

    public CoffeeShop(String name, Doppio doppio) {
        this.name = name;
        this.doppio = doppio;
    }

    public CoffeeShop(String name, Frappe frappe) {
        this.name = name;
        this.frappe = frappe;
    }

    public CoffeeShop(String name, IcedCoffee icedCoffee) {
        this.name = name;
        this.icedCoffee = icedCoffee;
    }

    public CoffeeShop(String name, Latte latte) {
        this.name = name;
        this.latte = latte;
    }

    public CoffeeShop(String name, Lungo lungo) {
        this.name = name;
        this.lungo = lungo;
    }

    public CoffeeShop(String name, Cappuccino cappuccino) {
        this.name = name;
        this.cappuccino = cappuccino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Espresso getEspresso() {
        return espresso;
    }

    public void setEspresso(Espresso espresso) {
        this.espresso = espresso;
    }

    public Ristretto getRistretto() {
        return ristretto;
    }

    public void setRistretto(Ristretto ristretto) {
        this.ristretto = ristretto;
    }

    public Americano getAmericano() {
        return americano;
    }

    public void setAmericano(Americano americano) {
        this.americano = americano;
    }

    public Doppio getDoppio() {
        return doppio;
    }

    public void setDoppio(Doppio doppio) {
        this.doppio = doppio;
    }

    public Cappuccino getCappuccino() {
        return cappuccino;
    }

    public void setCappuccino(Cappuccino cappuccino) {
        this.cappuccino = cappuccino;
    }

    public Frappe getFrappe() {
        return frappe;
    }

    public void setFrappe(Frappe frappe) {
        this.frappe = frappe;
    }

    public IcedCoffee getIcedCoffee() {
        return icedCoffee;
    }

    public void setIcedCoffee(IcedCoffee icedCoffee) {
        this.icedCoffee = icedCoffee;
    }

    public Latte getLatte() {
        return latte;
    }

    public void setLatte(Latte latte) {
        this.latte = latte;
    }

    public Lungo getLungo() {
        return lungo;
    }

    public void setLungo(Lungo lungo) {
        this.lungo = lungo;
    }
}
