package com.homework.kirbasko;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char [][] map;
    public static final int size = 4;
    public static final int DotzToWin = 4;

    public static final char DotEmpty = '*';
    public static final char DotX = 'x';
    public static final char DotO = 'o';


    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j< size; j++) {
                map [i][j] = DotEmpty;
            }
        }
    }
    public static void printMap () {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.println(map [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    /* public static void main (String [] args) {
        initMap();
        printMap();
    } */

    // Ход человека
    public static Scanner sc = new Scanner(System.in);
    public static void Human () {
        int x, y;
        do {
            System.out.println("Введите координаты x, y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map [y][x] = DotX;
    }
    // Проверка валидации координат
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map [y][x] == DotEmpty) return true;
        return false;
    }
    // Ход железки
    public static Random rand = new Random();
    public static void AI () {
        int x,y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x,y));
        System.out.println("Комп походил в " + (x + 1) + " " + (y + 1));
        map [y][x] = DotO;
    }
    // проверка победы
    public static boolean CheckWin (char symb) {
        for (int i = 0; i < size; i++) {
            if (map [i][0] == symb && map [i][1] == symb && map [i][2] == symb && map [i][3] == symb
            || map [0][i] == symb && map [1][i] == symb && map [2][i] == symb && map [3][i] == symb) return true;
            if (map [3][0] == symb && map [2][1] == symb && map [1][2] == symb && map [0][3] == symb
                    || map [0][0] == symb && map [1][1] == symb && map [2][2] == symb && map [3][3] == symb) return true;
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DotEmpty) return false;
            }
        }
        return true;
    }

    public static void main (String [] args) {
        initMap();
        printMap();
        while (true) {
            Human();
            printMap();
            if (CheckWin(DotX)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            AI();
            printMap();
            if (CheckWin(DotO)) {
                System.out.println("Победил AI");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Game over!");
    }
}
