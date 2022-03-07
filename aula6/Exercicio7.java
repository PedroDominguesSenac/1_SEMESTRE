/*
* 7 - Criar um programa que leia dois numeros inteiros. Se o segundo valor informado for ZERO, deve ser
* lido um novo valor, ou seja, para o segundo valor nÃ£o pode ser aceito o valor zero. Apresentar na tela o
* resultado da divisao do primeiro valor lido pelo segundo valor lido.
*/

package aula6;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Primeiro Numero: ");
        int n1 = leitor.nextInt();
        int n2;
        do {
            System.out.print("Segundo Numero: ");
            n2 = leitor.nextInt();
            if (n2 == 0) {
                System.out.println("\tValor Invalido. Nao pode ser zero!");
            }
        } while (n2 == 0);
        float divisao = (float) n1 / n2;
        System.out.println("Resultado = " + String.format("%.2f", divisao));
    }
}