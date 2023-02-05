    /*
* Aluno: Pedro Domingues
* 5- (1,0) Criar um programa que leia a idade de um nadador e apresente a sua
* categoria de acordo com a tabela abaixo:
* Idade
* Categoria
* 5 a 7 anos
* Infantil A
* 8 a 10 anos
* Infantil B
* 11-13 anos
* Juvenil A
* 14-17 anos
* Juvenil B
* Maiores de 18 anos (inclusive)Adulto
*/

package trabalho1;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner nadador = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Idade nadador: ");
        idade = nadador.nextInt();
        
        if (idade >= 5 && idade <= 7){
            System.out.println("Nadador Categoria Infantil A");
        }
        else if (idade >= 8 && idade <= 10) {
            System.out.println("Nadador Categoria Infantil B");
            }
        else if (idade >= 11 && idade <= 13){  
            System.out.println("Nadador Categoria Juvenil A");
        }
        else if (idade >= 14 && idade <= 17) {
        System.out.println("Nadador Categoria Juvenil B");
        }
        else if(idade >= 18) {
        System.out.println("Nadador Categoria Adulta");
        }
        else {
            System.out.println("Idade incompativel");
        }
    }
}