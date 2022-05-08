package com.homework.kirbasko.Lesson7;

public class Main {

    public static void main (String[] args) {
        Plate plate = new Plate(21); // Количество еды в миске
        Cat[] CatArray = new Cat[5];
        CatArray[0] = new Cat("Панас", 2);
        CatArray[1] = new Cat("Мурзик", 8);
        CatArray[2] = new Cat("Иван", 5);
        CatArray[3] = new Cat("Васек", 5);
        CatArray[4] = new Cat("Веснушка", 7);
            for (int i = 0; i < CatArray.length; i++) {
                CatArray[i].eat(plate);
                plate.info();
                CatArray[i].info();
        }
        plate.increaseFood(100); // Добавление еды в тарелку
        plate.info();
    }
}
