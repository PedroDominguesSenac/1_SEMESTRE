/*
* 3 - Criar um programa que leia o valor correspondente ao salario mensal de um
* trabalhador e tambem o valor do percentual de reajuste a ser atribui­do ao salario.
* Apresente na tela o valor do novo salario.
*/

package aula4;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Salario: ");
        float salario = leitor.nextFloat();
        System.out.print("Reajuste: ");
        float reajuste = leitor.nextFloat();
        float novoSalario = salario + (salario * reajuste / 100);
        System.out.println("Novo Salario = R$ " + novoSalario);
    }   
}