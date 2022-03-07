/*
*6 - Criar um programa que leia um numero inteiro e apresente a sua tabuada.
*/

package aula6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Numero: ");   
        int n = leitor.nextInt();
        System.out.println("*** TABUADA DO " + n + " ***");
        int r;
        for (int i = 1; i <= 10; i++) {
            r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }
    }
}