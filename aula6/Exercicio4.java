/*
* 4 - Criar um programa que apresente os anos bissextos de 2004 a 2050.
* (2004 eh um ano bissexto).
*/

package aula6;

public class Exercicio4 {

    public static void main(String[] args) {

        for (int i = 2004; i <= 2050; i+=4) {
            System.out.println(i);
        }
    }
}