package poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demostrações;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemostraçãoTryCatch {
    //TryCatch é usado para TRATAR uma exceção
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String[] vetor = sc.nextLine().split(" ");
            int local = sc.nextInt();
            System.out.println(vetor[local]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
        }
        catch(InputMismatchException e){
            System.out.println("Input Error");
        }
        System.out.println("Fim do programa");
       

        sc.close();
    }
}
