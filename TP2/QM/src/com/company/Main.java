package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int sum_row, sum_col, sum_diagonal = 0, sum = 0;
        boolean magic = true;
        int[][] square = new int[4][4];
        Scanner input = new Scanner(System.in);

        System.out.println("Introduz os valores: ");
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++)
                square[i][j] = input.nextInt();

        System.out.println("Quadrado : ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(square[i][j] + " ");
            System.out.println();
        }
        for (j = 0; j < 4; j++)
            sum += square[0][j];

        for (i = 1; i < 4; i++) {
            sum_row = 0;
            for (j = 0; j < 4; j++)
                sum_row += square[i][j];
            if (sum_row != sum) {
                magic = false;
                break;
            }
        }
        if (magic) {
            for (j = 0; j < 4; j++) {
                sum_col = 0;
                for (i = 0; i < 4; i++)
                    sum_col += square[i][j];
                if (sum_col != sum) {
                    magic = false;
                    break;
                }
            }
        }
        if (magic) {
            for (i = 0; i < 4; i++)
                for (j = 0; j < 4; j++)
                    if (i == j)
                        sum_diagonal += square[i][j];
            if (sum_diagonal != sum) {
                magic = false;
            }
        }

        if (magic)
            System.out.println("Forma um quadrado magico");
        else
            System.out.println("Nao forma um quadrado magico");
    }
}
