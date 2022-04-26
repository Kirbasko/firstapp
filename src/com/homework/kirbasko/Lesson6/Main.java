package com.homework.kirbasko.Lesson6;


import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args) {
        Cats cat1 = new Cats("Вася", 10);
        Cats cat2 = new Cats("Рыжий", 4);
        Dogs dog1 = new Dogs("Шарик", 15);

        System.out.println("Всего собак: " + Dogs.getCount());
        System.out.println("Всего котов: " + Cats.getCount());
        System.out.println(cat1.run());
        System.out.println(cat1.swim());
        System.out.println(cat2.run());
        System.out.println(cat2.swim());
        System.out.println(dog1.run());
        System.out.println(dog1.swim());
    }


}
