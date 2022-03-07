/*
* 1 - Em uma empresa, ha tabelas com o que foi gasto em cada mes. Para fechar o balanco do primeiro
* trimestre, eh necessario somar o gasto total. Sabendo que, em janeiro, foram gastos 15000 reais, em
* fevereiro, 23000 reais e em marco, 17000 reais, desenvolva um programa que calcule e apresente o gasto
* total no trimestre. Siga os seguintes passos:
* a. Criar uma classe chamada BalancoTrimestral com um bloco main.
* b. Dentro do main, declarar uma variÃ¡vel gastosJaneiro e inicializa-la com 15000;
* c. Declarar as variÃ¡veis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente;
* d. Declarar uma variÃ¡vel denominada gastosTrimestre e inicializa -la com a soma das outras tres
* variaveis;
* e. Imprimir o valor da variavel gastosTrimestre.
*/

package aula4;

public class Exercicio1 {
    
    public static void main(String[] args) {
    
        float gastosJaneiro = 15000f;
        float gastosFevereiro = 23000f;
        float gastosMarco = 17000f;
        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gastos no Trimestre = " + gastosTrimestre);
    }
}