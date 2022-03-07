/*
* Aluno: Pedro Domingues
* 2- (1,0) Criar um programa que leia o nome de um vendedor, o seu salario fixo e o total de vendas 
* efetuadas por ele no mes (em dinheiro). Sabendo que este vendedor ganha 15% de comissao sobre suas vendas efetuadas, 
* calcular e imprimir o total a receber no final do mes.
*/

package prova1;

import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        Scanner vendedor = new Scanner(System.in);
        
        float salario, comis, total;
        
        System.out.print("Qual o nome do funcionario(a)? : ");
        String nome = vendedor.nextLine();
        System.out.print("Qual o salario fixo dele(a)? : ");
        salario = vendedor.nextFloat();
        System.out.print("Qual o total de vendas efetuadas por " + nome + " em R$? : ");
        comis = vendedor.nextFloat();
        
        total = salario + (comis * 0.15f);
        System.out.println("O total do salario de " + nome + " eh: " + total);
    }
}