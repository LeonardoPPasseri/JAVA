package poo_Udemy.Seção_4_EstruturasSequênciais.Questão3;
import java.util.Scanner;
public class DiferençaDosProdutos {
 
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 numeros para acontecer a operação: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println((A*B)-(C*D));
        sc.close();
    }
}
