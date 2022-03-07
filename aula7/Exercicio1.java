/*
* 1 - Fazer um algoritmo que leia um numero e verifica se ele eh negativo.
* Se for negativo, imprimir na tela a
* mensagem "Numero negativo".
*/

package aula7;


import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");

        
        int numero = leitor.nextInt();
        
        if (numero < 0){
            System.out.println("Numero negativo ");
        }   
    }
}