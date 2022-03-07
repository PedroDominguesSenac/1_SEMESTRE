/*
* Aluno: Pedro Domingues
* 9- Criar um programa que leia o peso e a altura de uma pessoa, calcule o seu IMC (Indice de Massa Corporal), e apresente na
* tela uma mensagem informando se a pessoa esta ou nao no seu peso ideal, de acordo com a tabela abaixo. A formula para
* calcular o IMC eh: IMC = peso / altura^2.
* IMC Mensagem
* IMC < 20 Abaixo do peso
* 20 <= IMC < 25 Peso Ideal
* IMC >= 25 Acima do peso
*/

package ado1;

import java.util.Scanner;


public class Exercicio9 {

    public static void main(String[] args) {
        Scanner weigth = new Scanner(System.in);
        
        float kg, mts, poten, imc;
                
        System.out.print("Peso_Kg: ");
        kg = weigth.nextFloat();
        System.out.print("Altura_Metros: ");
        mts = weigth.nextFloat();
        poten = (float)Math.pow(mts, 2);
        imc = kg/ poten;
        System.out.println("Seu IMC e: " + imc);
        
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        }
        if (imc >= 20 && imc < 25) {
            System.out.println("Peso ideal");
        }
        if (imc >= 25) {
            System.out.println("Acima do peso"); 
        }
    }    
}
