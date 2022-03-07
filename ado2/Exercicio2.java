/*
* 2 - O numero 3025 possui a seguinte caracteristica: 30 + 25 = 55 e 55 * 55 = 3025
* Criar um algoritmo que apresente na tela todos os numeros positivos de quatro 
* algarismos que possuem a caracteristica citada.
* Aluno: Pedro Domingues
*/

package ado2;

public class Exercicio2 {
    
    public static void main(String[] args) {
              
        for (int num = 1000; num <= 9999; num++) {
            double quadrado = Math.pow(((num/100) + (num%100)), 2);
               
            if (num == quadrado) {
                System.out.printf("\n%d \n" , num);
            }           
        }
    }
}