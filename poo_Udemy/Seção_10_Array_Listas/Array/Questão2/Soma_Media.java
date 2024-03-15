package poo_Udemy.Seção_10_Array_Listas.Array.Questão2;
import java.util.Scanner;
public class Soma_Media {
    public double num;
    public static void main(String[] args) {
        double total = 0.0;
        double media = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos? ");
        Soma_Media[] numeros = new Soma_Media[sc.nextInt()];
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = new Soma_Media();
            System.out.print("Digite um numero: ");
            numeros[i].num = sc.nextDouble();
            total += numeros[i].num;
        }
        System.out.print("Numeros digitados: ");
        for(int i = 0;i<numeros.length;i++){
            System.err.print(numeros[i].num + " ");
        }
        media = total/numeros.length;
        System.out.println();
        System.out.println("Total : "+total);
        System.out.println("Media: "+media);
        sc.close();
    }
}




    
