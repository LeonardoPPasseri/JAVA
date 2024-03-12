package poo_Udemy.Seção_8_Intro_a_POO.Problema1;
import java.util.Scanner;
public class AreadoTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CalculaArea T1 = new CalculaArea();
        CalculaArea T2 = new CalculaArea();
        System.out.println("Digite o valor dos lados do Triangulo 1(Espaço entre eles)(a b c):");
        T1.a = sc.nextDouble();
        T1.b = sc.nextDouble();
        T1.c = sc.nextDouble();
        System.out.println("Digite o valor dos lados do Triangulo 2(Espaço entre eles)(a b c):");
        T2.a = sc.nextDouble();
        T2.b = sc.nextDouble();
        T2.c = sc.nextDouble();
        System.out.println("Area do triangulo 1 é igual a: " + T1.calcula()); 
        System.out.println("Area do triangulo 2 é igual a: " + T2.calcula()); 
        if(T1.calcula() > T2.calcula()){
            System.out.println("Area de T1 é MAIOR que T2");
        }else{
            System.out.println("Area de T1 é MENOR que T2");
        }
        sc.close();
    }
}
