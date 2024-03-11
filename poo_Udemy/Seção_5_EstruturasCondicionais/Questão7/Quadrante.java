package poo_Udemy.Seção_5_EstruturasCondicionais.Questão7;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cordenada X: ");
        double X = sc.nextDouble();
        System.out.println("Digite a cordenada Y: ");
        double Y = sc.nextDouble();

        //Precisa usar 25,6 com virgula em vez de ponto

        if(X == 0 && Y == 0){
            System.out.println("origem");
        }else if(X > 0 && Y > 0){
            System.out.println("Q1");
        }else if(X < 0 && Y > 0){
            System.out.println("Q2");
        }else if(X < 0 && Y < 0){
            System.out.println("Q3");
        }else if(X > 0 && Y < 0){
            System.out.println("Q4");
        }else if(X == 0){
                System.out.println("Eixo das ordenadas");
        }else if(Y == 0){
            System.out.println("Eixo das abscissas");
        }else{
            System.out.println("Fora do intervalo de numeros positivos");
        }
        
        sc.close();
    } 
}
        