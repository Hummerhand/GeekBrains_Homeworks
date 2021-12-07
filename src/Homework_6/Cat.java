package Homework_6;

public class Cat extends Animal {
    private static int count;
    private int maxLengthRun = 200;
    private int maxLengthSwim = 0;

    public Cat() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run(int length) {
        if (length > maxLengthRun) {
            System.out.println("Кот может пробежать не более " + maxLengthRun +  " метров.");
            return;
        }
        System.out.println("Кот пробежал " + length + " метров.");
    }

    @Override
    public void swim(int length) {
        if ((length >= maxLengthSwim) || (length < maxLengthSwim)) {
            System.out.println("Кот не умеет плавать.");
            return;
        }
    }

    public static void showInfoCats() {
        System.out.println("Количество созданных котов: " + count);
    }
}


