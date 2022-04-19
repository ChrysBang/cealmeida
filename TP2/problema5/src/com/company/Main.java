package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static String nomes;
    public static double compras;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inteiro = new ArrayList<String>();
        ArrayList<Double> valor = new ArrayList<Double>();
        System.out.println("Digite os nomes:");
        String nomes = sc.nextLine();
        System.out.println("Digite os valores das compras:");
        double compras = sc.nextDouble();
        inteiro.add(String.valueOf(compras));
    }

    static String nameOfBestCustomer(ArrayList<Double> compras, ArrayList<String> nomes) {

        return nomes();
    }
}
