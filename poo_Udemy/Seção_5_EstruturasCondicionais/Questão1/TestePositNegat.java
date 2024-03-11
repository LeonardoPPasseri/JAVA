package poo_Udemy.Seção_5_EstruturasCondicionais.Questão1;
import java.util.Scanner;

public class TestePositNegat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        if(numero < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
