/*
* 3 - Criar um algoritmo que efetua a leitura sucessiva de valores numericos inteiros positivos ou negativos,
* finalizando a leitura quando for fornecido o numero zero. Ao final, apresente a soma dos numeros
* positivos, a soma dos numeros negativos e a soma das duas parciais.
*/

package aula6;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int somaPos = 0;
        int somaNeg = 0;
        System.out.print("Numero: ");
        int n = leitor.nextInt();
        while (n != 0) {
            if (n > 0) {
                somaPos += n; // somaPos = somaPos + n;
            }
            else {
                somaNeg += n; // somaNeg = somaNeg + n;
            }
            System.out.print("Numero: ");
            n = leitor.nextInt();
        }           
        int somaParciais = somaPos + somaNeg;
        System.out.println("Soma Positivos = " + somaPos);
        System.out.println("Soma Negativos = " + somaNeg);
        System.out.println("Soma Parciais = " + somaParciais);
    }
}