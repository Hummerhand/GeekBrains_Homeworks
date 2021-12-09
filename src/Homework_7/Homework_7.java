package Homework_7;

public class Homework_7 {
    public static void main(String[] args) {

        Plate plate1 = new Plate(40);
        Cat cat1 = new Cat("Tyson", 15);
        Cat cat2 = new Cat("Arny", 22);
        Cat cat3 = new Cat("Thomas", 10);

        Cat[] cats = new Cat[] {cat1, cat2, cat3};


        for (Cat cat: cats) {
            plate1.infoFood();
            cat.eat(plate1);
        }
        plate1.infoFood();

    }
}
