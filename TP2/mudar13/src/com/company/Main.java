package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String frase, fraseInv;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        frase = leitor.nextLine();
        for (int x = frase.length() - 1; x >= 0; x--) {
            fraseInv += frase.charAt(x);
        }
        System.out.println(fraseInv);
    }
}
    /*public String rodartexto(String frase,String fraseInv){
        for(int x=frase.length()-1;x>=0;x--){
            fraseInv += frase.charAt(x);
        }
        System.out.println(fraseInv);
        return fraseInv;
    }
}
*/