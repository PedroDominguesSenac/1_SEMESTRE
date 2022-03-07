package exemplos;

import java.util.Scanner;

public class ConsumoEnergia2 {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.print("kWh Consumido: ");

    int kwhConsumido = leitor.nextInt();

    float valor;

    if (kwhConsumido < 150) {

      valor = kwhConsumido * 0.20f;

    } else if (kwhConsumido < 500) {

      valor = kwhConsumido * 0.25f;

    } else {

      valor = kwhConsumido * 0.30f;

    }

    if (valor < 11.90f) {

      valor = 11.90f;

    }

    System.out.println("Valor da Conta: " + String.format("%.2f", valor));

  }

}