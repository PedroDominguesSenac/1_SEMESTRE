/*
* Aluno: Pedro Domingues
* 7- Criar um programa que leia dois numeros inteiros e apresente uma mensagem indicando se o primeiro numero e multiplo do
* segundo.
*/

package ado1;

import java.util.Scanner;


public class Exercicio7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Digite o primeiro numero: ");
        num1 = leitor.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = leitor.nextInt();
        result = num1%num2;
        if (result == 0) { 
            System.out.println("O numero " + num1 + " eh multiplo do numero " + num2);
        }
        if (result >= 1) {
            System.out.println("O numero " + num1 + " nao eh multiplo do numero " + num2);   
        }    
    }
}