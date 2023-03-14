package objects;

public class Car {
    String model;
    int year;
    String price;
    String color;
    public void drive(){
        System.out.println(model +  color +" is driving ");
    }
    public void stop(){
        System.out.println(model + " car" + price + " is stopping");
    }
    public void playMusic(){
        System.out.println(" car's model is " + model + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = " Toyota Camry";
        car1.year = 2019;
        car1.price = " $25k";
        car1.color = " White";

        car1.drive();
        car1.stop();
        car1.playMusic();
    }
}
