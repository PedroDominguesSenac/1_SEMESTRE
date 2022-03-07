/*
* Aluno: Pedro Domingues
* 3 - Um vetor eh palindromo se ele nao se altera quando as posicoess das componentes
* sao invertidas. Por exemplo, o vetor v = {1, 3, 5, 2, 2, 5, 3, 1} eh palindromo. 
* Desenvolver uma funcao que recebe por parametro um vetor de
* inteiros e retorna uma valor booleano indicando de o vetor eh ou nao palindromo.
*/

package ado3;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int a; 
        
        System.out.printf("Numero de posicoes: ");
        a = leitor.nextInt();
        
        int[] vetor = new int[a];
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Qual posicao: %d: ", i + 1);
            
            vetor[i] = leitor.nextInt();
        }
            System.out.println("E um palindromo: " + pali(vetor));
    }
    
    public static boolean pali(int vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] != vetor[vetor.length - i - 1])
                return false;    
        }
                return true;
    }
}