/*
* 1 - Criar um programa que mostre os numeros pares entre 1 e 100, inclusive.
* Use o laco while.
 */

package aula6;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }       
            i = i + 1;
        }
        System.out.println("");
    }
}