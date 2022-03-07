/*
* Aluno: Pedro Domingues
* 1- Criar um programa que receba o valor do salario de um funcionario e o valor do salario minimo e apresente na tela quantos
* salarios minimos ganha esse funcionario.
*/

package ado1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.print("Digite qual o valor do salario do funcionario: ");
        float salario = leitor.nextFloat();
        System.out.print("Digite o valor do salario minimo: ");
        float salariomin = leitor.nextFloat();
        float valor = salario/salariomin; 
        System.out.printf("A quantidade de salario(s) minimo(s) equivalente ao salario do funcionario e igual a: %.1f ",valor);
        System.out.println("salario(s) minimo(s)");
    }
}