package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "1223456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Issa";
        student2.phone = "773453422";
        student2.email = "isss123@gmail.com";
        student2.age = 27;
        student2.major = "programmer";

        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();

    }
}
