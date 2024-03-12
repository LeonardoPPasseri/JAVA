package poo_Udemy.Seção_6_EstruturasDeRepetição.Questão2;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        int X;
        int Y;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<1;){
            System.out.println("Digite a coordenada X:");
            X = sc.nextInt();
            System.out.println("Digite a coordenada Y:");
            Y = sc.nextInt();
            if(X == 0  || Y == 0){
                break;
            }else if(X > 0 && Y > 0){
                System.out.println("Primeiro");
            }else if(X < 0 && Y > 0){
                System.out.println("Segundo");
            }else if(X < 0 && Y < 0){
                System.out.println("Terceiro");
            }else{
                System.out.println("Quarto");
            }
        } 
        sc.close();
    }
}