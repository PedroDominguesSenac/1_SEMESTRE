/*
* Aluno: Pedro Domingues
* 4- O custo ao consumidor, de um carro novo, e a soma do custo de fabrica com a percentagem do distribuidor e dos impostos
* (aplicados ao custo de fabrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, criar um
* programa que leia o custo de fabrica de um carro e apresenta na tela o custo final ao consumidor.
*/

package ado1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float veiculo, dist, impost, valor;
        System.out.print("Qual o valor do custo de fabricacao do veiculo: ");
        valor = leitor.nextFloat();
        dist = valor * 0.28f;
        System.out.printf("O valor perante a percentagem de 28 por cento do distribuidor sobre a fabricacao do veiculo e: %.2f \n",dist);
        impost = valor * 0.45f;
        System.out.printf("O valor perante a percentagem de 45 por cento de impostos sobre o custo de fabricacao do veiculo e: %.2f \n",impost);
        veiculo = valor + dist + impost;
        System.out.printf("O valor do custo final do veiculo para o consumidor e: %.2f \n", veiculo);                  
    }  
}