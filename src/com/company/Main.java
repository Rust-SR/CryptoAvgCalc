package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите кол-во ордеров:");
        Scanner orderInput = new Scanner(System.in);
        int order = orderInput.nextInt();
        float summa = 0;
        float dollars = 0;
        float totalDollars = 0;
        float total = 0;
        float totalCoin = 0;

        for (int i = 1; i <= order; i++) {
            System.out.println("Введите цену ордера №" + i);
            summa = orderInput.nextFloat();
            System.out.println("Введите кол-во $");
            dollars = orderInput.nextFloat(); //на сколько купили
            float coin = dollars / summa; //кол-во монет
            totalDollars = totalDollars + dollars;
            totalCoin = totalCoin + coin;
            // dollars1+dollars2 / coin1+coin2
        }
        float average = totalDollars / totalCoin;
        System.out.println("Средняя цена покупки за " + order + " ордера: " + average);



























    }
}
