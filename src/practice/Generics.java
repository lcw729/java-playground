package practice;

import practice.coffee.CoffeeByUser;
import practice.user.User;
import practice.user.VIPUser;

import java.util.ArrayList;

class AnimalList<T> {
    private ArrayList<T> animalList = new ArrayList<T>();

    void add(T animal) {
        animalList.add(animal);
    }

    void remove (T animal) {
        animalList.remove(animal);
    }

    T get(int index) {
        return animalList.get(index);
    }

    void print() {
        for (T animal : animalList) {
            System.out.print(animal + " ");
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printArray(iArray);
        printArray(dArray);
        printArray(sArray);

        AnimalList<String> animalList = new AnimalList<>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Monkey");
        animalList.print();
        System.out.println(animalList.get(2));
        animalList.remove("Cat");
        animalList.print();

        User user = new User("강하늘");
        CoffeeByUser<User> c1 = new CoffeeByUser<User>(user);
        c1.ready();

        CoffeeByUser<User> c2 = new CoffeeByUser<>(new VIPUser("정소민"));
        c2.ready();

        orderCoffee("김영철");
        orderCoffee("김희철", "아메리카노");

    }

    private static <T> void printArray(T[] arr) {
        for (T element : arr ){
            System.out.println(element);
        }
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료: " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료: " + name);
    }
}
