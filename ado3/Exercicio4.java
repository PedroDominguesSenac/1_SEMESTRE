/*
* Aluno: Pedro Domingues
* 4 - Desenvolver um programa que leia uma matriz 2 x 2 de valores inteiros 
* e apresente o seu determinante.
*/

package ado3;

import java.util.Scanner;

public class Exercicio4 {
    
    static void xMatriz(int[][] matriz) {
        Scanner leitor = new Scanner(System.in);
        
        for(int x = 0; x < matriz.length; x++) {
        
        for(int y = 0; y < matriz[x].length; y++) {
           
            System.out.println("Linha: " + x + " Coluna: " + y);
            matriz[x][y] = leitor.nextInt();
        } 
    }
}

    static int Determ(int[][] matriz) {
        
        int diag1, diag2, deter;
        
        diag1 = matriz[0][0] * matriz[1][1];
        diag2 = matriz[0][1] * matriz[1][0];
        deter = diag1 - diag2;
        
        return deter;
    }
   
    public static void main(String[] args) {
        
        int [][] matriz;
        
        matriz = new int[2][2];
        
        xMatriz(matriz);
        
        int deter = Determ(matriz);
        
        System.out.println("Determinante: " + deter);
    }
}