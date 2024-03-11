package poo_Udemy.Seção_5_EstruturasCondicionais.Questão3;
import java.util.Scanner;
public class TesteMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        System.out.println("Digite um numeros: ");
        A = sc.nextInt();
        System.out.println("Digite outro numeros: ");
        B = sc.nextInt();
        
        if(A % B == 0){
            System.out.println("MULTIPLOS");
        }else if(B % A == 0){
            System.out.println("MULTIPLOS");
        }else{
            System.out.println("NÃO MULTIPLOS");
        }
        sc.close();
    }   
}
        