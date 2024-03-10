package poo_Faculdade.aula2_Logica;
import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        System.out.println("Insira seu nome");
        Scanner sc = new Scanner(System.in); //Class Scanner que é importada.Usada para ler o que é escrito
        String n = sc.nextLine(); //nextLine() metodo para receber a string que sera digitado
        System.out.println("Insira sua idade");
        int i = sc.nextInt(); //nextInt() metodo para receber o int que será digitado
        System.out.println("A idade de " + n + " é " + i);
        sc.close(); //Fecha o programa
    }
}