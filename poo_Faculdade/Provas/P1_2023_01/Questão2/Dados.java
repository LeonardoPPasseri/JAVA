package poo_Faculdade.Provas.P1_2023_01.Questão2;
import java.util.Scanner;
public class Dados {
    String nome;
    double peso;
    double altura;
    public String fomatoDados(){
        return (nome+"#"+peso+"#"+altura);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String teste;
        do{
            
            System.out.println("Digite seu nome: ");

            System.out.println("Digite seu peso:");
            System.out.println("Digite sua altura:");

            System.out.println("Para finalizar digite (finalizar), para continuar aperte (enter)");
            teste = sc.nextLine();
        }while(teste != "finalizar");
        sc.close();
    }
}
