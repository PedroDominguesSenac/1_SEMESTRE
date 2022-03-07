/*
* 3 - Criar um algoritmo que leia a idade e o peso de 15 pessoas e apresente na 
tela a media dos pesos das pessoas da mesma faixa etaria. As faixas etarias sao:
* de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 30 anos.
* Aluno: Pedro Domingues
*/

package ado2;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner software = new Scanner(System.in);
        
        
        int[] age = new int[15];
        int[] weigth = new int[15];
        int[] age2 = new int[15];
        int[] weigth2 = new int[15];
        int[] age3 = new int[15];
        int[] weigth3 = new int[15];
        int[] age4 = new int[15];
        int[] weigth4 = new int[15];
        int[] age5 = new int[15];
        int[] weigth5 = new int[15];
        
        int a = 0, b = 0, c = 0, d = 0;
        int media = 0, media2 = 0, media3 = 0, media4 = 0;
        int cont1 = -1, cont2 = -1, cont3 = -1, cont4 = -1;      
        
        for (int num = 0; num < 15; num++) {
        System.out.println("Idade: ");
        age[num] = software.nextInt();
        System.out.println("Peso: ");
        weigth[num] = software.nextInt();
        
        
        if (age[num] >= 1 && age[num] <= 10) {
            cont1++;
            weigth2[cont1] = weigth[num];
            a = a + weigth2[cont1];
            media = a/(cont1 + 1);
        }
        
        if (age[num] >= 11 && age[num] <= 20) {
            cont2++;
            weigth3[cont2] = weigth[num];
            b = b + weigth3[cont2];
            media2 = b/(cont2 + 1);
        }
        
        if (age[num] >= 21 && age[num] <= 30) {
            cont3++;
            weigth4[cont3] = weigth[num];
            c = c + weigth4[cont3];
            media3 = c/(cont3 + 1);
        }
        
        if (age[num] > 30) {
            cont4++;
            weigth5[cont4] = weigth[num];
            d = d + weigth5[cont4];
            media4 = d/(cont4 + 1);
        }     
               
        }
        System.out.println("Pessoas de 1 a 10 anos:\n Peso: " + media + "\nPessoas de 11 a 20 anos:\n Peso: " + media2 + "\nPessoas de 21 a 30 anos\n Peso: " + media3 + "\nMaiores 30 anos\n Peso: " + media4);
    }   
}