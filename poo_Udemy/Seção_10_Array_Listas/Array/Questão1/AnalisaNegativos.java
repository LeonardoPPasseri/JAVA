package poo_Udemy.Seção_10_Array_Listas.Array.Questão1;
import java.util.Scanner;
public class AnalisaNegativos {
    public int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos? ");
        AnalisaNegativos[] numeros = new AnalisaNegativos[sc.nextInt()];
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = new AnalisaNegativos();
            System.out.print("Digite um numero: ");
            numeros[i].num = sc.nextInt();
        }
        for(int c = 0;c<numeros.length;c++){
            if(numeros[c].num < 0){
                System.out.println(numeros[c].num);
            }
        }
        sc.close();
    }
}
