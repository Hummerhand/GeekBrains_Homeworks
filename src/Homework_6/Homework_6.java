package Homework_6;

public class Homework_6 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Dog d1 = new Dog();

        c1.run(205);

        d1.run(200);
        d1.swim(15);

        Cat.showInfoCats();
        Dog.showInfoDogs();
    }
}
