/*
* 4 - Criar um programa que apresente os anos bissextos de 2004 a 2050.
* (2004 eh um ano bissexto).
*/

package teste;

import java.util.Scanner;

public class Aula6_Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.println("Anos Bissextos entre --2004 a 2050--");
        for (int i = 2004; i <= 2050; i += 4) {
            System.out.println("Ano Bissexto: " + i);
        }
    }
}