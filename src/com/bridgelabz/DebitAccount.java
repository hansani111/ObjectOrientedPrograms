package com.bridgelabz;

import java.util.Scanner;

public class DebitAccount {
    float balance;

    public DebitAccount(float balance) {
        this.balance = balance;
    }
    public void debitMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for debit thorugh account:");
        int debitAmount = sc.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debit amount is : " + debitAmount);
            System.out.println("Account balance after update : " + balance);
        } else {
            System.out.println("Debit amount exceeded Account balance");
            sc.close();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance : ");
        DebitAccount account = new DebitAccount(sc.nextFloat());
        account.debitMethod();
        sc.close();
    }
}