/*
* Aluno: Pedro Domingues
* 1- (2.0)Crie um programa que simule uma calculadora simples capaz de realizar as operacoes basicas. 
* O programa deve receber 3 dados: dois numeros e um caractere. Este caractere podera ser '+', '-', '*' ou '/' , e 
* representarao a operacao matematica que voce deseja realizar entre os numeros.
*/

package prova1;

import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        float result, a, b;
        
        System.out.print("Digite o primeiro numero: ");
        a = calculadora.nextFloat();
        System.out.print("Dentre os operadores matematicos (+ - * /), escolha qual sera utilizado para operacao: ");
        String c = calculadora.next();
        System.out.print("Digite o segundo numero: ");
        b = calculadora.nextFloat();
        
        
        switch(c){
                case "+":
                   result = a + b;
                    System.out.println(+ a + " + " + b + " = " +result);
                break;
                case "-":
                    result = a - b;
                    System.out.println(+ a + " - " + b +" = " +result);
                break;
                case "*":
                    result = a * b;
                    System.out.println(+ a + " * " + b + " = " +result);
                break;
                case "/":
                    result= a / b;
                    System.out.println(+ a + " / " + b + " = " +result);
                break;
              
        }
    }    
}