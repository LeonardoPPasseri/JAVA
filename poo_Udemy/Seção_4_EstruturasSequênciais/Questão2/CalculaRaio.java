package poo_Udemy.Seção_4_EstruturasSequênciais.Questão2;
import java.util.Scanner;

public class CalculaRaio {
    public static void main(String[] args) {
        double π = 3.14159;
        double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        System.out.println(π*(raio * raio));
        sc.close();
    }
}
