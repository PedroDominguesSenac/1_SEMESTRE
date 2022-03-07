/*
* Resolva os exercicios abaixo utilizando apenas a estrutura switch case
* 5 - Criar um programa para identificar o valor a ser pago por um plano de saude dada a
* idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
* conforme a seguinte tabela:
* 1) criancas com menos de 10 anos pagam R$80;
* 2) conveniados com idade entre 10 e 30 anos pagam R$50;
* 3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
* 4) conveniados com mais de 60 anos pagam R$130.
*/
package aula7;


import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite idade: ");
        float idade = leitor.nextFloat();


        int mensalidade = 100;
        if (idade < 10){
            mensalidade +=  80;
        }else if (idade < 40){
            mensalidade +=  50;
        }else if (idade <= 60){
            mensalidade +=  95;
        } else{
            mensalidade +=  130;
        }
        System.out.print("Mensalidade " + mensalidade);
    }
}