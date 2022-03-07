/*
* 2 - Adicionar codigo (sem alterar as linhas que ja existem) na classe criada anteriormente para imprimir
* a media mensal de gasto, criando uma variavel mediaMensal junto com uma mensagem. Para isso,
* concatenar a String com o valor, usando:
* "Valor da media mensal = " + mediaMensal
*/

package aula4;

public class Exercicio2 {

    public static void main(String[] args) {

        float gastosJaneiro = 15000f;
        float gastosFevereiro = 23000f;
        float gastosMarco = 17000f;
        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gastos no Trimestre = " + gastosTrimestre);
        // Parte referente ao exercÃ­cio 02
        float mediaMensal = gastosTrimestre / 3;
        System.out.println("Valor da mÃ©dia Mensal = " + mediaMensal);
    }
}