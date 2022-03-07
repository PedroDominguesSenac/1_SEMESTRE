/*
* 2 - Fazer um algoritmo que leia dois numeros L e R. O programa deve verificar a maior area entre um
* quadrado de lado L e um circulo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
*/

package aula7;


import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite L: ");
        float L = leitor.nextFloat();
        System.out.print("Digite R: ");
        float R = leitor.nextFloat();   
        float quadrado = L*L;
        float circulo = 3.14f*R*R;
       
        if (quadrado == circulo){
            System.out.print("Mesma Ã¡rea ");
        }else if (quadrado > circulo){
            System.out.print("Quadrado maior " + quadrado);
        } else{
            System.out.print("Circulo maior " + circulo);
        }
    }
}