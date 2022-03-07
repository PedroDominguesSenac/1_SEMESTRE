/*
* 2 - Criar um algoritmo que leia o ano atual e o ano de nascimento de uma pessoa. Apresentar na tela uma
* mensagem que diga se ela podera¡ ou nao votar este ano (nao eh necessario considerar o mes em que a
* pessoa nasceu).
*/

package aula5;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Ano Atual: ");
        int anoAtual = leitor.nextInt();
        System.out.print("Ano de Nascimento: ");
        int anoNasc = leitor.nextInt();
        if (anoAtual - anoNasc >= 16) {
            System.out.println("Pode Votar!");
        }
        else {
            System.out.println("Nao Pode Votar!");
        }
    }
}