package exemplos;

import java.util.Scanner;

public class ExemploIfElse {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Velocidade: ");
        int veloc = leitor.nextInt();
        if (veloc > 70) {
            System.out.println("Multado!");
        }
        else {
            System.out.println("Nao Multado!");
        }
    }
    
}
