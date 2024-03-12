package poo_Udemy.Seção_6_EstruturasDeRepetição.Questão1;
import java.util.Scanner;
public class ValidadorSenha {
    public static void main(String[] args) {
        int senha = 1699;
        int teste;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite a senha(4 numeros):");
            teste = sc.nextInt();
            if(teste != senha){
                System.out.println("Senha Invalida");
            }
        }while(senha != teste);
        System.out.println("Acesso Concedido");
    }
}
