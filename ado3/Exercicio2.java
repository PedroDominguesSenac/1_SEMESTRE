/*
* Aluno: Pedro Domingues
* 2 - Desenvolver um programa que leia um vetor de 16 posicoes de valores 
* inteiros e troque os 8 primeiros valores pelos 8 ultimos valores e vice-versa.
* Ao final apresentar na tela os dados do vetor obtido.
*/

package ado3;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner prog = new Scanner(System.in);
        
        int[] vetor = new int[16];
        int[] vetorx = new int[16];
        int[] vetory = new int[8];
        int[] vetorz = new int[8];
        
        for(int i = 0; i < 16; i++) {
            System.out.printf("\n Qual posicao %d: ", i + 1);
            
            vetor[i] = prog.nextInt();
            
            if(i < 8)
                vetory[i] = vetor[i];
            else
                vetorz[(i - 8)] = vetor[i];
        }
            
        for(int i = 0; i < 8; i++)
            vetorx[i] = vetorz[i]; 
        
        for(int i = 8; i < 16; i++)
            vetorx[i] = vetory[(i - 8)];
        
        System.out.printf("Vetor original: %s \n", Arrays.toString(vetor));
        System.out.printf("Vetor substituido: %s \n", Arrays.toString(vetorx));
    }
}