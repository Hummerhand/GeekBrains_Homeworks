package Homework_6;

public class Dog extends Animal {
    private static int count;

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
        if (length > 500) {
            System.out.println("Собака может пробежать не более 500 метров.");
            return;
        }
        System.out.println("Собака пробежала " + length + " метров.");
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Собака может проплыть не более 10 метров.");
            return;
        }
        System.out.println("Собака проплыла " + length + " метров.");
    }

    public static void showInfoDogs() {
        System.out.println("Количество созданных собак: " + count);
    }
}
