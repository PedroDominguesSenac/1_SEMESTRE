/*
* Aluno: Pedro Domingues
* 1 -  Desenvolver uma funcao que recebe, por parametro, dois valores X e Z e 
* calcula e retorna X elevado Z (sem utilizar funcoes ou operadores de potencia prontos).
*/

package ado3;

import java.util.Scanner;

public class Exercicio1 {
    
    static int pot(int x, int z) {
        int pot = x;
            for(int i = 1; i < z; i++) {
                pot = pot * x;
            }
        return pot;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);       
        
        System.out.print("Digite o numero base: ");
        int x = leitor.nextInt();
        
        System.out.print("Digite o numero expoente: ");
        int z = leitor.nextInt();
        
        int total = pot(x,z);
                   
            System.out.println("O numero " + x + " elevado ao numero " + z + " e igual ao numero: " + total);   
    }        
}