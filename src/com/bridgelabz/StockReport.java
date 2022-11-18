package com.bridgelabz;

import java.util.Scanner;

public class StockReport {

    static int totalValue;
    String Stock_Name;
    int No_Of_Shares;
    int Share_Price;

    static void acceptInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the stock :");
        String name = sc.next();
        System.out.print("Enter the number of shares :");
        int shares = sc.nextInt();
        System.out.print("Enter the price of the share of this stock :");
        int price = sc.nextInt();
    }

    static int calculate(int shares, int price) {
        totalValue = shares * price;
        return totalValue;
    }

    static void print() {
        System.out.println("---------------------------------------------");
        System.out.println("Total Value Of The Stock : " + totalValue);
        System.out.println();
    }

    public static void main(String[] args) {

        StockReport stockReport = new StockReport();
        calculate(40, 400);
        acceptInput();
        print();
    }
}