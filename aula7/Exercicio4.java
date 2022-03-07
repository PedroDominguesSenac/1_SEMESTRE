/*
* Resolva os exercicios abaixo utilizando apenas a estrutura switch case
* 4 - Criar um programa para identificar se um mes digitado pelo usuario eh de alta ou baixa
* temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro,
* junho e julho).
*/

package aula7;


import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Mes: ");
        int mes = leitor.nextInt();
        switch (mes) {
            case 1:
            case 2:
            case 12:
            case 6:
            case 7:
                System.out.println("Alta temporada");
                break;
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Baixa Temporada");
                break;
            default:
                System.out.println("Mes Invalido!");
        }
    }
}