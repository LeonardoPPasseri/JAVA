package poo_Udemy.Seção_4_EstruturasSequênciais.Questão4;
import java.util.Scanner;

public class CalculaSalário {
    public static void main(String[] args) {
        int horas;
        String numero;
        double valorPorHora;
        double salario;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do funcionario(10 Digitos): ");
        numero = sc.nextLine();
        System.out.println("Digite as horas de trabalho no mês: ");
        horas = sc.nextInt();
        System.out.println("Digite o valor por hora de trabalho: ");
        valorPorHora = sc.nextDouble();

        salario = horas*valorPorHora;
        System.out.println(numero + " " + salario);
        
        sc.close();
    }
}
