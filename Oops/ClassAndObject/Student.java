package Oops.ClassAndObject;

public class Student {
    String name;
    int rollnumber;
    String address;


    Student(String name,int rollnumber, String address){
        this.name = name;
        this.rollnumber = rollnumber;
        this.address = address;
    }

    void display(){
        System.out.println("Name : " + name + " Roll number: " + rollnumber + " Address: " + address);
    }

    public static void main(String[] args) {
        Student s = new Student("Sharad",46,"Varanasi");
        s.display();
    }
    
}
