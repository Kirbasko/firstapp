package com.homework.kirbasko;


import java.util.Arrays;

public class Lesson3 {
    public static void main (String[] args){
        threeDotOne();
        threeDotTwo();
        threeDotThree();
        threeDotFour();
        threeDotSix();
        printArrayInConsole(retLenArr(5, 25));
    }

        public static void threeDotOne() {
        int [] arr = {0, 1, 0, 1, 1, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr [i] == 1) {
                    arr [i] = 0;
                } else arr [i] = 1;
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void threeDotTwo () {
            int[] numb = new int[100];
            for (int i = 0; i < 100; i++) {
                numb[i] = i + 1;
                System.out.println("numb[" + i + "] = " + numb[i]);
            }
        }

        public static void threeDotThree () {
            int[] numbs = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < numbs.length; i++) {
                if (numbs [i] < 6) {
                    numbs [i] = numbs [i] * 2;
                }
            }
            System.out.println(Arrays.toString(numbs));
        }

// Не смог придумать закономерности, чтоб описать другую диагональ.

        public static void threeDotFour(){
            int [][] table = new int [4][4];
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (i == j) {
                                table [i][j] = 1;
                            }
                            System.out.print(table[i][j] + " ");
                        }
                    }
        }

        /* С 5 заданием вообще не разбериха, в методичке об это ничего нет, на уроках не рассматривали. Пришлось
        прибегать к помощи интернета. */
        public static int[] retLenArr (int len, int initialValue){
            int arr[] = new int[len];
                for (int i = 0; i < arr.length; i++){
                    arr[i] = initialValue;
                }
                return arr;
            }
        public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
        }

        public static void threeDotSix () {
            int [] arr = { 10, 50, 220, 140, 2};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int maxNum = arr[arr.length - 1];
            System.out.println("Max = " + maxNum);
            int minNum = arr[0];
            System.out.println("Min = " + minNum);
        }

}
