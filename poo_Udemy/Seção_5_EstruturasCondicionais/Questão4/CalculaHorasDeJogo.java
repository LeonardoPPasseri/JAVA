package poo_Udemy.Seção_5_EstruturasCondicionais.Questão4;
import java.util.Scanner;
public class CalculaHorasDeJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio;
        int fim;
        int total;
        System.out.println("Digite a hora inicial: ");
        inicio = sc.nextInt();
        System.out.println("Digite a hora final: ");
        fim = sc.nextInt();
        
        total = fim - inicio;
        if(fim == inicio){
            total = 24;
        }
        System.out.println("O tempo de jogo foi de " + total + " Horas");
        sc.close();
    }   
}