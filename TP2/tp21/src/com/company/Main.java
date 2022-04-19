package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static double x1,x2,y1,y2;
    public static double distancia;
    public static double p1,p2;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("valor de x1: ");
        x1=leitor.nextDouble();
        System.out.println("valor de y1: ");
        y1=leitor.nextDouble();
        System.out.println("valor de x2: ");
        x2=leitor.nextDouble();
        System.out.println("valor de y2: ");
        y2=leitor.nextDouble();
        p1=Math.pow(x2-x1,2);
        p2=Math.pow(y2-y1,2);
        distancia=Math.sqrt(p1+p2);
        System.out.println("distancia"+ distancia);
    }
    private static double distanciaDePontos(double x1, double y1, double x2, double y2){

        return distancia;
    }
}
