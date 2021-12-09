package Homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


    public void decreaseFood(int amountEatFood) {
        if (food > 0) {
            food -= amountEatFood;
        }
        if (food <= 0){
            System.out.println("Еды в тарелке не достаточно");
            return;
        }
    }

    public void infoFood() {
        System.out.println("Количество еды в тарелке: " + food);
    }
}
