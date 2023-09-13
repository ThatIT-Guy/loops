package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//for (initialization; condition; updation) this is the syntax of for loop
        for (int count = 0; count <= 10; count ++) {
            System.out.println(count);
        }
//        in while we use  while(condition) as a syntax
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
//        in do while the assigned operation in do block will execute at least once whether the condition is fulfilled or not
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
//        in here the do while prints 11 and if you comment the while loop it prints o to 10
//        understand the implementation and you will understand why this happens

//        lets create a problem in which we print the some of number for 1+2+3+...n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum = sum + k;
//            System.out.println(sum);
//            if you use sum in for loop it will repeat with for loop and will provide output like 1,3, 6, 10, 15, 21, 28, 36, 45, 55,66
//            because with each iteration k value will increase by 1 and it will print that value
        }
//        to avoid this you need to use the print statement out of for loop
        System.out.println(sum);
//        similarly we can create a table of any number
        int num = sc.nextInt();
        int table = 0;
        for (int j = 1; j <= 10; j++) {
            table = num * j;
            System.out.println(table);
        }
    }
}