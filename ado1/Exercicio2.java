/*
* Aluno: Pedro Domingues
* 2- Criar um programa que leia a idade de uma pessoa expressa em anos, mes e dias e apresente na tela a idade dessa pessoa
* expressa apenas em dias. Considerar ano com 365 dias e mes com 30 dias.
*/

package ado1;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a idade de uma pessoa expressa dessa forma e ordem: ano(s), mes(es), dia(s): ");
        
        System.out.print("ano(s): ");
        float anos = leitor.nextFloat();
        System.out.print("mes(es): ");
        float mes = leitor.nextFloat();
        System.out.print("dia(s): ");
        float dias = leitor.nextFloat();
        float idade = anos*365 + mes*30 + dias;
        System.out.printf("A quantidade de dias equivalentes a idade dessa pessoa e:  %.0f", idade);
        System.out.println(" dias");
    } 
}