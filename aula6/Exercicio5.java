/*
* 5 - Criar um programa que apresente uma contagem regressiva de 100 a 0,
* com decremento de 10 em 10.
*/

package aula6;

public class Exercicio5 {
    
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i -= 10) {
            System.out.println(i);
        }       
    }   
}