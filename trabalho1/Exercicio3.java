/*
* Aluno: Pedro Domingues
* 3- (1,0) Criar um programa que leia tres numeros inteiros e apresente na tela o maior deles.
*/

package trabalho1;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner maiornu = new Scanner(System.in);
        
        int pri, seg, ter;
        
        System.out.print("Informe o 1º numero: ");
        pri = maiornu.nextInt();
        System.out.print("Informe o 2º nÃºmero: ");
        seg = maiornu.nextInt();
        System.out.print("Informe o 3º numero: ");
        ter = maiornu.nextInt();
        
        if (pri > seg && pri > ter){
            System.out.println("O maoir numero eh: " + pri);   
        }
        else if (seg > ter){
          System.out.println("O maior numero eh: " + seg);  
        }
        else {
            System.out.println("O maior numero eh: " + ter);
        }
    }
}