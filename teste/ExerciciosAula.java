/* 
* Leia numeros positivos ate que um negativo seja informado
* Ao final imprime a soma dos positivos
*/

package teste;

import java.util.Scanner;

public class ExerciciosAula {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        System.out.print("Numero: ");
        int numero = leitor.nextInt();
        while (numero >= 0) {
        soma += numero; // soma = soma + numero
        System.out.print("Numero: ");
        numero = leitor.nextInt();
        }
        System.out.println("Soma = " + soma);
    }
}