package org.example;

import java.util.Scanner;

/**
 * @author Vinayagamoorthy Ezhumalai <n520492> on 26/07/2023
 */

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int even[] = new int[length];
        int odd[] = new int[length];
        int count = 0;
        int count1 = 0;
        int a = 0, b = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                even[count] = arr[i];
                count++;
                a++;
            } else {
                odd[count1] = arr[i];
                count1++;
                b++;
            }
        }
        if (a == b) {
            int min = even[0];
            int min1 = odd[0];
            for (int i = 1; i < even.length; i++) {
                if (even[i] != 0) {
                    min = Math.min(min, even[i]);
                }}
            for (int j = 1; j < even.length; j++) {
                if (odd[j] != 0) {
                    min1 = Math.min(min1, odd[j]);
                }
            }
            System.out.println(min);
            System.out.println(min1 + " odd");
        }
    }
}

