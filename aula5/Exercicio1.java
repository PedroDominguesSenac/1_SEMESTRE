/*
* 1 - Dado um numero, verificar se ele Ã© maior que 100. Se for, o algoritmo 
* deve somar 150 a esse numero.
* No final, imprimir o resultado da soma.
*/

package aula5;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.print("Numero: ");
        int numero = leitor.nextInt();
        if (numero > 100) {
            int soma = numero + 150;
            System.out.println("Soma = " + soma);
        }
    }
}