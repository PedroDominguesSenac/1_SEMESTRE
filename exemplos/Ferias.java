package exemplos;

import java.util.Scanner;

public class Ferias {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.print("Mes: ");

    int mes = leitor.nextInt();

    switch (mes) {

      case 1:

      case 12:

        System.out.println("Ferias!");

        break;

      case 2:

      case 3:

      case 4:

      case 5:

      case 6:

        System.out.println("1o Semestre Letivo");

        break;

      case 7:

        System.out.println("Recesso!");

        break;

      case 8:

      case 9:

      case 10:

      case 11:

        System.out.println("2o Semestre Letivo!");

        break;

      default:

        System.out.println("Mes Invalido!");

    }

  }

}