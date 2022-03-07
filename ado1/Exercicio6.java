/*
* Aluno: Pedro Domingues
* 6- As macas custam R$ 1,30 cada se forem compradas menos de uma duzia, e R$ 1,00 se forem compradas pelo menos 12. Criar
* um programa que leia o numero de macas compradas, calcule e apresente na tela o custo total da compra.
*/

package ado1;

import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.print("Digite quanta(s) maca(s) voce quer comprar: ");
        a = leitor.nextFloat();            
        if (a < 1) {
            System.out.println("Compra invalida!");   
        }
        if (a >= 12){
            b = a * 1;
            System.out.println("O custo das macas e: R$ " + b);
        }
        else {
            b = a * 1.3f;
            System.out.println("O custo das macas e: R$ " + b);
        }     
        
    }    
}