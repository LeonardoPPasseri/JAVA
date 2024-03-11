package poo_Udemy.Seção_5_EstruturasCondicionais.Questão6;
import java.util.Scanner;
public class Intervalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero: ");
        double num = sc.nextDouble();

        //  num = (num*num)/num; Deixa o numero positivo
        //Precisa usar 25,6 com virgula em vez de ponto
        if(num <= 25.0){
            System.out.println("Intervalo [0 - 25]");
        }else if(num <= 50.0){
            System.out.println("Intervalo [25 - 50]");
        }else if(num<= 75.0){
            System.out.println("Intervalo [50 - 75]");
        }else if(num <= 100.0){
            System.out.println("Intervalo [75 - 100]");
        }else if(num > 100.0){
            System.out.println("Intervalo [>100]");
        }else{
            System.out.println("Fora do intervalo de numeros positivos");
        }
        
        sc.close();
    } 
}
    