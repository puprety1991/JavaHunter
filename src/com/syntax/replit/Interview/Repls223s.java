package com.syntax.replit.Interview;

public class Repls223s {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);

        System.out.print("Tri-Loops# : ");
        int input = scan.nextInt();
        System.out.println();
        for (int a = 1; a <= input; a++) {
            for (int b = input; b >= a; b--) {
                System.out.print(" ");
            }

            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }

            System.out.println();

        }*/
        int i, j, k, rows = 9;
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

