/*
* Aluno: Pedro Domingues
* 3- Criar um programa que calcule e apresente na tela o volume de uma esfera de raio R, em que R e um dado fornecido pelo
* usuario. O volume de uma esfera eh dado por V = (4/3)x(pi)x R^3*. ------ Professor, tentei de todas as formas colocar o simbolo de P.I(π),
* mas meu NetBeans nao aceitou, ficou minusculo, entao coloquei pi. Retirei todos acentos tambem para melhor entendimento.
*/

package ado1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o raio R da esfera: ");
        float raio = leitor.nextFloat();
        float a = (float)Math.pow(raio, 3);
        float volume = 1.33f*3.14f*a; 
        System.out.printf("O volume da esfera e = %.2f \n", volume);           
    }
}