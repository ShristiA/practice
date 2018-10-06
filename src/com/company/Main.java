package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scr.nextInt();
        int countend = num;
        for(int counter=1; counter<= countend; counter++) {
            //for(int counter = num ; counter>=1; counter--){
            //do{
            //while(num>=1){
            if (num % 5 == 0) {
                System.out.println("Copy");
            } else if (num % 7 == 0) {
                System.out.println("cat");
            } else {
                System.out.println(num);
            }
            num = num - 1;
            //}
            //}while(num>=1);
            //}
        }
    }
}
