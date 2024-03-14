package poo_Faculdade.aula3.Questão;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        do{
            System.out.println("===============");
            System.out.println(" 1 --- Saldo");
            System.out.println(" 2 --- Depositar");
            System.out.println(" 3 --- Sacar");
            System.out.println(" 0 --- Sair");
            System.out.println("===============");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldoFormatado());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    conta.depositar(sc.nextDouble());
                    System.out.println("Saldo atualizado: R$ "+conta.getSaldoFormatado()); 
                    break;
                case 3:
                    System.out.print("Digite o valor a ser retirado: ");
                    conta.sacar(sc.nextDouble());
                    System.out.println("Saldo atualizado: R$ " + conta.getSaldoFormatado()); 
                    break;
                case 0:
                    break;
            }
        }while(x != 0);
        sc.close();
    }
}
