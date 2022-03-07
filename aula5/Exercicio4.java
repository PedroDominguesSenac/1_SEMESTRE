/*
* 4 - Calcular a conta de consumo de energia eletrica de um consumidor, dado o kWh consumido, de acordo
* com a tabela abaixo:
* Kw Consumido: < 150 kWh ---- Valor do Kwh: R$ 0,20
* Kw Consumido: >= 150 e < 500 ---- Valor do Kwh: R$ 0,25
* Kw Consumido: >= 500 ---- Valor do Kwh: R$ 0,30
* Valor minimo da conta: R$ 11,90
*/

package aula5;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("kWh Consumido: ");
        int kwhConsumido = leitor.nextInt();
        float valor;
        if (kwhConsumido < 150) {
            valor = kwhConsumido * 0.20f;
        }
        else if (kwhConsumido < 500) {
            valor = kwhConsumido * 0.25f;
        }
        else {
            valor = kwhConsumido * 0.30f;
        }
        if (valor < 11.90f) {
            valor = 11.90f;
        }
        System.out.println("Valor da Conta: " + String.format("%.2f", valor));
    }
}