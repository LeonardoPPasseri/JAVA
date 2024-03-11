package poo_Udemy.Seção_4_EstruturasSequênciais.Questão1;
import java.util.Scanner;

public class Soma {
    
    public static void main(String[] args) {
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros para serem somados: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        int total = a+b;
        System.out.println("Entrada:  =========== Saida:");
        System.out.println(a + "                    Soma = "+ total);
        System.out.println(b);
        sc.close();
    }
}
