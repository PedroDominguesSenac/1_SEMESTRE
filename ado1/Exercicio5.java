/*
* Aluno: Pedro Domingues
* 5- Criar um programa que leia o salario de um funcionario (salario bruto), calcule e apresente na tela:
* • Desconto de 8% de INSS
* • Desconto de 15% de IR
* • Bonus de 5,75% sobre o salario liquido
* • Salario Bruto e Liquido
*/

package ado1;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float salariobruto, salarioinss, salarioir, salarioliquido, salariobonus, liquidobonus;
    
        System.out.print("Qual o salario bruto do funcionario?: R$ ");
        salariobruto = leitor.nextFloat();
        salarioinss = salariobruto * 0.08f;
        System.out.printf("Desconto de INSS e: R$ %.2f \n",salarioinss);
        salarioir = salariobruto * 0.15f;
        System.out.printf("Desconto de IR e: R$ %.2f \n",salarioir);
        salarioliquido = salariobruto - (salarioinss + salarioir);
        salariobonus = salarioliquido * 0.0575f;
        System.out.printf("O salario liquido e: R$ %.2f \n",salarioliquido);
        System.out.printf("O bonus sobre o salario liquido e: R$ %.2f \n",salariobonus);
        liquidobonus = salarioliquido + salariobonus;
        System.out.printf("O valor do salario liquido + o bonus é: R$ %.2f \n",liquidobonus);
        System.out.printf("O salario bruto e: R$ %.2f \n",salariobruto);     
    }   
}