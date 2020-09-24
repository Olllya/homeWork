package homeWork;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Plate plate = new Plate(15);
        Cat cat1 = new Cat("Ronya", 4, false);
        Cat cat2 = new Cat("Snikers", 5, false);
        Cat cat3 = new Cat("Kusya", 2, false);
        Cat cat4 = new Cat("Ryzhik", 6, false);
        Cat[] cats = {cat1, cat2, cat3, cat4};
        System.out.println("Еды в тарелке: " + plate.food);
        for (int i = 0; i < cats.length; i++) {
            if (plate.food >= cats[i].appetite) {
                cats[i].eat(plate);
                cats[i].decreaseAppetite(cats[i].appetite);
                System.out.println("Осталось еды после приема пищи: " + plate.food);
                System.out.println(cats[i].appetite);
                cats[i].whatSatiety(cats[i].appetite);
            } else {
                System.out.println("Еды не хватило");
                cats[i].whatSatiety(cats[i].appetite);
            }
            System.out.println("Осталось еды в тарелке: " + plate.food);
        }
        System.out.println("Хочешь добавить еды в тарелку? Давай!");
        Scanner scanner = new Scanner(System.in);
        int addFood = scanner.nextInt();
        if (addFood == 0) {
            System.out.println("Еды больше не будет");
        } else {
            plate.food = plate.food + addFood;
            System.out.println("Еды в тарелке: " + plate.food);
            for (int i = 0; i < cats.length; i++) {
                if (plate.food >= cats[i].appetite) {
                    cats[i].eat(plate);
                    cats[i].decreaseAppetite(cats[i].appetite);
                    System.out.println("Осталось еды после приема пищи: " + plate.food);
                    System.out.println(cats[i].appetite);
                    cats[i].whatSatiety(cats[i].appetite);
                } else {
                    System.out.println("Еды не хватило");
                    cats[i].whatSatiety(cats[i].appetite);
                }
                System.out.println("Осталось еды в тарелке: " + plate.food);
            }
        }
    }
}