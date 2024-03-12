package poo_Udemy.Seção_8_Intro_a_POO.Problema2;
import java.util.Scanner;
public class Estoque {
    
    public static void main(String[] args) {
        int escolha;
        Scanner sc = new Scanner(System.in);
        Produto X = new Produto();
        System.out.println("Digite o nome do produto:");
        X.nome = sc.nextLine();
        System.out.println("Digite o valor unitario do produto: ");
        X.preço = sc.nextDouble();
        System.out.println("==================================");
        System.out.println("0 para Sair");
        System.out.println("1 para adicionar ao estoque");
        System.out.println("2 para remover do estoque");
        System.out.println("3 para saber o valor do estoque");
        System.out.println("==================================");
        
        do{
            System.out.print("Digite o numero: ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    X.addEstoque();
                    break;
                case 2:
                    X.removerEstoque();
                    break;
                case 3:
                    X.info();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(escolha != 0);
        
        sc.close();
    }
}
