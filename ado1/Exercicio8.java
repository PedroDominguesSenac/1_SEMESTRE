/*
* Aluno: Pedro Domingues
* 8- Criar um programa que leia a hora de inicio e a hora de fim de um jogo de xadrez (considere apenas horas inteiras, sem os
* minutos), calcule e apresente na tela a duracao do jogo em horas, sabendo-se que o tempo maximo de duracao do jogo e de
* 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
*/

package ado1;

import java.util.Scanner;


public class Exercicio8 {

    public static void main(String[] args) {
        Scanner chess  = new Scanner(System.in);
        
        byte start, end, game;
        
        System.out.print("Informar o inicio do jogo, somente Horas/sem minutos:\nSTART: ");
        start = chess.nextByte();
        System.out.print("Informar o final do jogo, somente Horas/sem minutos:\nEND: ");
        end = chess.nextByte();
        game = (byte) (end - start);
        if (game <= 0) {
            game = (byte) (game + 24);
            System.out.println("Total: " + game + " Horas");
        }
        else{
            System.out.println("Total: " + game + " Horas");       
        }
    }  
}