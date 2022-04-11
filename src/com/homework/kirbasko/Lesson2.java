package com.homework.kirbasko;

public class Lesson2 {
    public static void main (String[] args) {
            TwoDotOne();
            TwoDotTwo();
            TwoDotThree();
            TwoDotFour();
            TwoDotFive();
    }
        public static void TwoDotOne() {
            int a = 5;
            int b = 6;
            boolean bool = a + b >= 10 && a + b <= 20;
            System.out.println(bool);
        }
        public static void TwoDotTwo() {
            int a = -10;
            if (a >= 0){
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }
        public static void TwoDotThree() {
            int a = -2;
            boolean bool = a<=0;
            System.out.println(bool);
        }
        public static void TwoDotFour() {
            int e = 5;
            String b = "Hey, Teacher, leave those kids alone!";
            for (int k = 0; k <= e; k++) {
                System.out.println(b);
            }
    }
        public static void TwoDotFive() {
            int y = 2480;
            boolean bool = y % 4 == 0 && y % 100 != 100;
                if (y % 400 == 0) {
                    System.out.println(bool);
            } else {
                    System.out.println(bool);
                }
        }
}



