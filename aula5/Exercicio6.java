/*
* 6 - Criar um programa que leia dois numeros do usuario e um operador
* (+, - , * , /) e mostre o resultado da
* operacao na tela.
*/

package aula5;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("N1: ");
        float n1 = leitor.nextFloat();
        System.out.print("Operador: ");
        char op = leitor.next().charAt(0);
        System.out.print("N2: ");
        float n2 = leitor.nextFloat();
        float resultado = 0.0f;
        switch (op) {
        case '+':
            resultado = n1 + n2;
            break;
        case '-':
            resultado = n1 - n2;
            break;
        case '*':
            resultado = n1 * n2;
            break;
        case '/':
            resultado = n1 / n2;
            break;
        default:
            System.out.println("Operador Invalido!");
        }
        System.out.println("Resultado = " + String.format("%.2f", resultado));
    }
}