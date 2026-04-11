package Oops.ClassAndObject;

public class TrevelDetails {
    String fromCity,toCity;
    double distance;

    TrevelDetails(String fromCity, String toCity,double distance){
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    void display(){
        System.out.println("Traveling from " + fromCity + " to " + toCity + " covers " + distance + " km.");
    }

    public static void main(String[] args) {
        TrevelDetails t = new TrevelDetails("Varanasi", "Mathura", 800);
        t.display();
    }
    
}
