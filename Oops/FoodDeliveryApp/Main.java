package Oops.FoodDeliveryApp;

public class Main {
    public static void main(String[] args) {
        String [] fooditem1 = {"Pizza", "Pasta", "Burger"};

        Resturant r1 = new Resturant("Paramhansh", "Varanasi", fooditem1);

        System.out.println("----Resturent 1---");
        r1.displayItem();

        System.out.println("Available or Not");
        System.out.println("is Pasta there?" + r1.isFood("Pasta") );



    }

    
}
