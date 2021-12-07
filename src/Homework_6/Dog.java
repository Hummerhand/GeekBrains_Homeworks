package Homework_6;

public class Dog extends Animal {
    private static int count;
    private int maxLengthRun = 500;
    private int maxLengthSwim = 10;

    public Dog() {
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
            System.out.println("Собака может пробежать не более " + maxLengthRun + " метров.");
            return;
        }
        System.out.println("Собака пробежала " + length + " метров.");
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Собака может проплыть не более " + maxLengthSwim + " метров.");
            return;
        }
        System.out.println("Собака проплыла " + length + " метров.");
    }

    public static void showInfoDogs() {
        System.out.println("Количество созданных собак: " + count);
    }
}
