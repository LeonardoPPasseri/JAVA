package poo_Faculdade.aula2_Logica_Array;
import java.util.Scanner;

public class Construtores {
    int a;
    int b;
    int soma(int a, int b){
        return a + b;
    }
    public static void main(String[]args){
        Construtores y = new Construtores();
        
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        int a1 = x.nextInt();

        System.out.println("Digite o valor de b");
        int b1 = x.nextInt();
        x.close();
        y.a = a1;
        y.b = b1;

        System.out.println( "O valor de a + b: " + y.soma(y.a, y.b)); // é preciso colocar y.
    }
}