package trabalho2;

import java.util.Scanner;

public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nomes[] = new String[50], nome = "", nome2, nomes3;
       String nomes2[] = new String[50];
       int menu, a = 0, cond = 2, d = 0;
       Scanner leitor = new Scanner(System.in);
       for(int i = 0; i <= 49; i++){
           nomes2[i] = " ";
       }
       nomes = nomes2;
       for(int i = 0; i != -1; i++){
           System.out.println("1 - Adicionar novo nome\n2 - Apresentar nomes\n3 - Pesquisar um nome\n4 - Remover um nome\n0 - Sair");
           menu = leitor.nextInt();
           if(menu == 1){
                System.out.println("Digite um nome:");
                nome = leitor.next();
                if(!nomes[0].equals(" ")){
                    
                   cond = Projeto.NomeRepetido(nome, nomes);

                   if(cond == 1){
                       for(int c = 0; c <= 49; c++){
                           d = c + 1;
                           if(nomes[c].equals(" ")){
                                nomes[c] = nome;
                                break;
                            }
                           else if(d >= 50){
                               System.out.println("Nome nao adicionado, lista cheia");
                           }
                        }
                    }
                    if(cond == 2){
                     System.out.println("Nome Repetido");
                    }
                }
                else if(nomes[0].equals(" ")){
                    for(int c = 0; c <= 49; c++){
                        if(nomes[c].equals(" ")){
                            nomes[c] = nome;
                            break;
                        }
                    }
                }
            }
                
            if(menu == 2){
                Projeto.ApresentarNome(nomes, nome);
            }
            if(menu == 3){
                System.out.println("Digite o nome que quer pesquisar:");
                nome2 = leitor.next();
                Projeto.PesquisarNome(nome2, nomes); 
            }
            if(menu == 4){
                System.out.println("Digite o nome que quer remover:");
                nomes3 = leitor.next();
                Projeto.RemoverNome(nomes3, nomes);
            }
            if(menu == 0){
                System.out.println("Adeus!");
                break;
            }
        }
    }
    
    public static void ApresentarNome(String nomes[], String nomes4){
        for(int i = 0; i <= 49 ; i++){
            if(nomes[0].equals(" ")){
                System.out.println("-----------\nLista Vazia\n-----------");
                break;
            }
            if(!nomes[i].equals(" ")){
                System.out.println("Nome:\n" + nomes[i]);
            }
            else{
                break;
            }
            
        }
    }
    public static int NomeRepetido(String nome, String nomes[]){
        int valor = 0;
        System.out.println("Procurando nome...");
        for(int i = 0;i <= 49; i++){
            if(nomes[i].equals(nome)){
                valor = 2;
                break;  
            }
            
        }
        
        if(valor == 2){
            return valor;
        }
        else{
            System.out.println("Nome nao e repetido");
            valor = 1;
            return valor;
        }
    }
           
    public static void PesquisarNome(String nome2, String nomes[]){
        int valor = 0, retorno = 0;
        System.out.println("-------------\nPesquisando nome...\n-------------");
        for(int i = 0; i <= 49; i++){
            if(nomes[i].equals(nome2)){
                valor = i;
                retorno = 1;
                break;
            }
            else{
                retorno = 0;
            }
        }
        if(retorno == 1){
            System.out.println("O Nome " + nome2 + " foi encontrado na posiÃ§ao " + (valor));
        }
        else if(retorno == 0){
            System.out.println("Nome nao encontrado!");
        }
    }
    public static void RemoverNome(String nome3, String nomes[]){
        for(int i = 0; i <= 49; i++){
            
            if(nomes[i].equals(nome3)){
               for(int a = i; a <= 48; a++){
                   nomes[a] = nomes[a + 1];
                   if(nomes[2].equals(nomes[3])){
                       nomes[3] = " ";
                    }              
                }
                if(nomes[3].equals(nome3)){
                nomes[3] = " ";
            }
               System.out.println("-----------------\nNome Removido...\n-----------------");
               break;
            }
            else if(i == 3){
                System.out.println("Nome nao encontrado!");
            }
            
        }
        
    }
}