package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // wap to input 2Array and check wheather they are equal or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array: ");
        int n = sc.nextInt();


        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == arr1[i]) {
                System.out.println("Both the array are equal");


            } else {
                System.out.println("they are not equal");
            }
        }
    }

}

