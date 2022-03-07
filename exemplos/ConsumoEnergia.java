package exemplos;

import java.util.Scanner;
        
public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("ContaDeEnergia: ");
        
        float energia = leitor.nextFloat();
        float ConsumodeEnergia;
        
        if (energia < 11.90f) {
            System.out.println("ContaDeEnergia = R$11,90");
       
        }
        else if (energia < 150) {
            ConsumodeEnergia = energia * 0.20f;
        {
        if (energia < 500) {
            ConsumodeEnergia = energia * 0.25f;
        }
        else
            ConsumodeEnergia = energia * 0.30f;
        }
        System.out.println("ConsumoDeEnergia = " + ConsumodeEnergia);
        }
    }
}