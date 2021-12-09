package Homework_7;

public class Homework_7 {
    public static void main(String[] args) {
        Plate plate1 = new Plate(10);
        Cat cat1 = new Cat("Tyson", 15);

        plate1.infoFood();
        cat1.eat(plate1);
        plate1.infoFood();
        cat1.eat(plate1);
        plate1.infoFood();
    }
}
