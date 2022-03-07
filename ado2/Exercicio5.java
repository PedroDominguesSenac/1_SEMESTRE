/*
* 5. Uma loja esta levantando o valor total de todas as mercadorias em estoque.
* Criar um algoritmo que leia o valor da mercadoria e pergunte Mais Mercadorias
* (S/N)?. Ao final, apresentar na tela o total em estoque e a media de valores 
* das mercadorias em estoque.
* Aluno: Pedro Domingues
*/

package ado2;

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float merc, cont1 = 0, total = 0, total2 = 0;
        char S, N, result = 'S';
                
        while ((result == 'S') || (result == 's')) {
            
        cont1++;
        
        System.out.println("Qual o valor da mercadoria: ");
        merc = leitor.nextFloat();
        System.out.println("Deseja mais mercadorias, S ou N");
        result = leitor.next().charAt(0);
        total = total + merc;
        total2 = total/cont1;          
        }
        
        System.out.println("A media dos valores das mercadorias e: " + total2);
    }   
    
}