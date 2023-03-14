package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = "Fox";
        animal1.isMammal = false;
        animal1.isCarnivore = false;
        animal1.age = 3;
        animal1.habitat = "habitat";

        animal1.eat();
        animal1.play();
        animal1.sleep();







    }
}
