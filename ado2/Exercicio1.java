/*
* 1 - Criar um programa que leia um numero inteiro N maior do que zero e calcule
* o fatorial desse numero. Fatorial de N eh
* representado por N! e calculado da seguinte maneira:
* N! = N* (N - 1) * (N - 2) * ... * 3 * 2 * 1
* Aluno: Pedro Domingues
*/

package ado2;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner fator = new Scanner(System.in);
        
        double num, f = 1;
        
        System.out.print("Digite um numero inteiro para calcular seu fatorial: ");
        num = fator.nextInt();
        
        if (num >= 0) {
            for (double i = 1; i <= num; i++){
            f = f * i;
        }
            System.out.println("O fatorial do numero: " + num + " e igual ao numero: " + f);
        }else {
            System.out.println("Informe um numero natural, (maoir ou igual a zero)");
        }       
    }       
}