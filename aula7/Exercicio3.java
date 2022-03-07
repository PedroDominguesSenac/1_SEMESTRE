/*
* 3 - Fazer um algoritmo que leia dois numeros e imprime a divisao do 
* maior pelo menor.
 */

package aula7;


import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite primeiro numero: ");
        float num1 = leitor.nextFloat();
        System.out.print("Digite segundo numero: ");
        float num2 = leitor.nextFloat();   

       
        if (num1 > num2){
            System.out.print("Quadrado maior " + num1/num2);
        } else{
            System.out.print("Circulo maior " + num2/num1);
        }  
    }
}