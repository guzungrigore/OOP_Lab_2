import clases.*;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop("Andrei", new Espresso("Arabica", 7, 30, 0, 15, false, false));
        System.out.println(coffeeShop.getName() +" ordered " + coffeeShop.getEspresso().getTypeOFCoffee() + " Espresso with " + coffeeShop.getEspresso().getGramsOfCoffee() + " grams of coffee and "
                + coffeeShop.getEspresso().getMlOfWater() + " ml of water with " + coffeeShop.getEspresso().getSugarPacks() + " packs of sugar with the price of "
                + coffeeShop.getEspresso().getPrice() + " lei");

        CoffeeShop coffeeShop1 = new CoffeeShop("Lionea", new Ristretto("Robusta", 7, 22, 0, 15, false, false));
        
        CoffeeShop coffeeShop2 = new CoffeeShop("Alex", new Americano("Arabica", 16, 60, 2, 20, false, false));

        CoffeeShop coffeeShop3 = new CoffeeShop("Ana", new Doppio("Robusta", 16, 30, 1, 20, false, false));

        CoffeeShop coffeeShop4 = new CoffeeShop("Adelia", new Cappuccino("Arabica", 15, 50, 3, 30, true, false));

        CoffeeShop coffeeShop5 = new CoffeeShop("Greg", new Frappe("Arabica", 15, 30, 2, 35,true,true ));

        CoffeeShop coffeeShop6 = new CoffeeShop("Iuliana", new IcedCoffee("Robusta", 15, 100, 1, 30, false, true));

        CoffeeShop coffeeShop7 = new CoffeeShop("Bogdan", new Lungo("Robusta", 30, 30, 0, 30, false, false));

        CoffeeShop coffeeShop8 = new CoffeeShop("Nicu", new Latte("Arabica", 20, 40, 1, 30, true, false));

    }
}