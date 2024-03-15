package poo_Udemy.Seção_9_FerramentasPOO;
import java.util.Scanner;
public class Programa {
    
    public static void main(String[] args) {
        ContaBancaria newConta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("===================");
        System.out.println("1 Deposito");
        System.out.println("2 Saque");
        System.out.println("3 Dados");
        System.out.println("0 Sair");
        System.out.println("===================");
        do{
            System.out.print("Digite o numero: ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o deposito: ");
                    newConta.deposito(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Digite o saque: ");
                    newConta.saque(sc.nextDouble());
                    break;
                case 3:
                    newConta.dados();
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
