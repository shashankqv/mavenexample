package hello;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        System.out.println("hey");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int even = a % 2;
        if (a % 2 != 0) {
            System.out.println("Weird");
        } else if (a % 2 == 0 && a>= 2 && a <= 5) {
            System.out.println("Not Weird");
        }else if (a % 2 == 0 && a>= 6 && a <= 20) {
            System.out.println("Weird");
        }  else if (a % 2 == 0 && a> 20) {
        System.out.println("Weird");
    }
    }
}