package Homework_5;

public class Homework_5 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Maumov Samat", "Developer", "sm@gmail.com", "87019000584", 800, 37);
        empArray[1] = new Employee("Issakov Askhad", "Seller", "ia@gmail.com", "87017859258", 700, 49);
        empArray[2] = new Employee("Zhailaubayev Nurlybek", "Manager", "zn@gmail.com", "87018554565", 600, 30);
        empArray[3] = new Employee("Askanbekov Bakdaulet", "Bayer", "ab@gmail.com", "87016541232", 650, 28);
        empArray[4] = new Employee("Shilkov Vladimir", "IT specialist", "sv@gmail.com", "87018995412", 550, 43);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.println(empArray[i]);
            }
        }
    }
}
