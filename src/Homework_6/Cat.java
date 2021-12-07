package Homework_6;

public class Cat extends Animal {
    private static int count;

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
        if (length > 200) {
            System.out.println("Кот может пробежать не более 200 метров.");
            return;
        }
        System.out.println("Кот пробежал " + length + " метров.");
    }

    public static void showInfoCats() {
        System.out.println("Количество созданных котов: " + count);
    }
}


