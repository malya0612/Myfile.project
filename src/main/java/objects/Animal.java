package objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;
    public void eat(){
        System.out.println(type + " is not mammal:" + isMammal + " is eating");
    }
    public void sleep(){
        System.out.println(type + " is sleeping in " + habitat) ;
    }
    public void play(){
        System.out.println(type + "is not carnivore" + " is play in age: " + age);
    }


}
