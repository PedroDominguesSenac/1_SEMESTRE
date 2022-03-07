/*
* 4 - Criar um programa que receba uma determinada hora (hora e minutos separados)
* e apresente na tela a
* hora em minutos.
*/

package aula4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Hora: ");
        int hora = leitor.nextInt();
        System.out.print("Minutos: ");
        int minutos = leitor.nextInt();
        int horaMinutos = hora * 60 + minutos;
        System.out.println("Hora em minutos: " + horaMinutos);
    }
}