package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Introduce una cadena de: X, O, _ ");
        Scanner entrada = new Scanner(System.in);
        String input = entrada.nextLine();

        if(input.contains("X") && input.contains("0") && input.contains("_")) {

           String a= "|";
            for (int i = 0; i <=5; i++) {
                System.out.print("-");

            }

            System.out.println("");
            char primera[] = new char[3];
            input.getChars(0, 3, primera, 0);
            System.out.print("|");
            System.out.print(primera);
            System.out.println("|");



            char segunda[] = new char[3];
            input.getChars(3, 6, segunda, 0);
            System.out.print("|");
            System.out.print(segunda);
            System.out.println("|");

            char tercera[] = new char[3];
            input.getChars(6, 9, tercera, 0);
            System.out.print("|");
            System.out.print(tercera);
            System.out.println("|");

            for (int i = 0; i <=5; i++) {
                System.out.print("-");

            }

        }
        else{
            System.out.println("Ingrese solo caracteres: X, O, _ ");
        }


    }

}