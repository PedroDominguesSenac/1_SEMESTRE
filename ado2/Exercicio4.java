/*
* 4 - Criar um algoritmo que leia o sexo (M ou F), a idade e o tempo de carteira
* de habilitacao de varias pessoas. Ao final, apresentar na tela a quantidade de 
* mulheres (F) com idade entre 24 e 30 anos com tempo de carteira de habilitacao 
* superior a 3 anos. Para encerrar a entrada de dados o usuario deve digitar uma
* idade menor ou igual a zero.
* Aluno: Pedro Domingues
*/

package ado2;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        char M, F, result;
        int age = 1, driv;
        int cont1 = 0;     
        
        while( age > 0) {        
                
        System.out.println("Sexo M ou F: ");
        result = leitor.next().charAt(0);
              
        System.out.println("Qual a sua idade: ");
        age = leitor.nextInt();
        System.out.println("Quanto(s) ano(s) possui habilitacao: ");
        driv = leitor.nextInt();
        
        if ((age >= 24 && age <= 30) && (result == 'F' || result == 'f') && (driv > 3)){
        cont1++;   
        }   
        }
        System.out.println("A quantidade de mulheres entre 24 e 30 anos com habilitacao superior a 3 anos: " + cont1 + " mulheres");
    } 
}