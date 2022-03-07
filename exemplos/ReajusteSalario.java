package exemplos;

import java.util.Scanner;

public class ReajusteSalario {  
    
   public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
   
    System.out.print("Salario: ");
    
    float salario = leitor.nextFloat();
    float novoSalario;
    if (salario < 500) {
        novoSalario = salario * 1.15f;
    }
    else if (salario <= 1000) {
        novoSalario = salario * 1.10f;
    }
    else {
        novoSalario = salario * 1.05f;
    }
    System.out.println("Salario Reajustado = " + novoSalario);  
   
  }    
}