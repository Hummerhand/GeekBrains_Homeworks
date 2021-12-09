package Homework_7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (this.satiety < 15) {
            if (plate.getFood() >= appetite) {
                plate.decreaseFood(appetite);
                setSatiety(satiety += appetite);
                System.out.println("Кот поел и доволен");
            } else {
                System.out.println("Кот по-есть не может, в тарелке не достаточно еды");
            }
            System.out.println("Сытость кота равна: " + satiety);
            return;
        }
        if (satiety >= 15) {
            System.out.println("Кот сыть и есть не хочет");
            return;
        }
    }

}
