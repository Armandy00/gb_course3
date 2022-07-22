package lesson1;

import lesson1.Fruits.Apple;
import lesson1.Fruits.Fruit;
import lesson1.Fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Первая задача
        String[] myArray = new String[]{"Первый", "Третий", "Второй", "Четвертый"};
        Object[] myObjArray = swapStringElementsArray(myArray, 2,3);
        String[] myNewArray = Arrays.copyOf(myObjArray, myObjArray.length, String[].class);

        //Вторая задача
        List<String> myArrayList = Arrays.asList(myArray);

        //Третья задача
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Apple> appleTwoBox = new FruitBox<>(new Apple(), new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());


        System.out.println("Результат сравнения двух коробок яблок: " + appleBox.compare(appleTwoBox));
        appleBox.transfer(appleTwoBox);
        System.out.println("После пересыпки яблок в первой коробке осталось " + appleBox.getWeight());
        System.out.println("После пересыпки яблок в второй коробке получилось" + appleTwoBox.getWeight());
    }

    private static Object[] swapStringElementsArray(Object[] obj, Integer indexOne, Integer indexTwo) {
        Object tempObj = obj[indexOne];
        obj[indexOne] = obj[indexTwo];
        obj[indexTwo] = tempObj;
        return obj;
    }
}
