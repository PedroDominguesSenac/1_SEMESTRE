/*
* Aluno: Pedro Domingues
* 5 - Desenvolver uma funcao que recebe uma matriz bidimensional por parametro
* e retorne a transposta desta matriz.
*/
package ado3;

public class Exercicio5 {
            
        static void Transposta(int[][] matriz) {
            
            matriz[0][0] = 1;
            matriz[0][1] = 2;
            matriz[1][0] = 3;
            matriz[1][1] = 4;
        }
        
        public static void main(String[] args) {
        
            int [][] matriz;
            matriz = new int[2][2];
            matriz[0][0] = 1;
            matriz[0][1] = 3;
            matriz[1][0] = 2;
            matriz[1][1] = 4;
            
            System.out.println("Matriz: ");
            
            for(int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.println("Linha: " + x + " Coluna: " + y + " = " + matriz[x][y]);     
                }
            }
            
            Transposta(matriz);
            System.out.println("Transposta: ");
            
            for (int x = 0; x < matriz.length; x++) {
                for(int y = 0; y < matriz.length; y++) {
                    
                    System.out.println("Linha: " + x + " Coluna: " + y + " = " + matriz[x][y]);
                }
            }        
    } 
}