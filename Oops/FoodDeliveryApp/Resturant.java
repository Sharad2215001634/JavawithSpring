package Oops.FoodDeliveryApp;

public class Resturant {
    private String name;
    private String location;
    private String []fooditem;


    public Resturant(String name, String location, String fooditem[]){
        this.name = name;
        this.location = location;
        this.fooditem = fooditem;
    }

    public void displayItem(){
        System.out.println("Resturant Name : " + name);
        System.out.println("Resturant Location : " + location);
        System.out.println("Resturant Food Items : " + fooditem);

        for(String item : fooditem){
            System.out.println("-" + item);
        }
    }

    public boolean isFood(String food){
        for(String item : fooditem){
            if(item.equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }
    
}
