/*
Fazer um programa para ler um número N. 
Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
Se o denominador for igual a zero, mostrar a mensagem "divisao impossível".
 */
package com.mycompany.ex4for;

import java.util.Scanner;

public class Ex4For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos pares de números quer: ");
        int n = teclado.nextInt();
        System.out.println("Digite dois números para dividirem um pelo outro: ");
        for (int i = 0; i < n; i++) {
            System.out.println("1º Número: ");
            int x = teclado.nextInt();
            System.out.println("2º Número: ");
            int y = teclado.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double div = (double) x / y;
                System.out.println("O resultado de " + x + " dividido por " + y + " é: " + div);
            }
        }

        teclado.close();
    }
}
