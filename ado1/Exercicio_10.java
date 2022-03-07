/*
* Aluno: Pedro Domingues
* 10- Criar um programa que leia o valor de tres notas escolares de um aluno. Calcular a media aritmetica e apresentar na tela a
* mensagem “Aprovado” se a media obtida for maior ou igual a 7; caso contrario, o programa deve solicitar a nota de exame
* do aluno e calcular uma nova media aritmetica entre a nota do exame e a primeira media aritmetica. Se o valor da nova
* media for maior ou igual a 5, apresentar na tela a mensagem “Aprovado em exame”; caso contrario, apresentar a mensagem
* “Reprovado”. Informar junto com cada mensagem o valor da media obtida.
*/

package ado1;

import java.util.Scanner;


public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner escola = new Scanner(System.in);
        float nota1, nota2, nota3, media1, exame, media2;
        System.out.print("Digite a primeira nota: ");
        nota1 = escola.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = escola.nextFloat();
        System.out.print("Digite a terceita nota: ");
        nota3 = escola.nextFloat();
        media1 = (nota1 + nota2 +nota3)/3;
        System.out.println(media1);
        
        if (media1 >= 7) {
            System.out.println("Aprovado!");           
        }
        else {
            System.out.println("A sua nota eh menor que 7, fazer exame.");
            System.out.print("Digite a nota do exame: ");
            exame = escola.nextFloat();
            media2 = (media1+exame)/2;
        if (media2 >= 5) {
            System.out.println("Aprovado! \nMedia: " + media2);
        }      
        else {
            System.out.println("Reprovado! \nMedia: " + media2 ); }
        }
    }
}