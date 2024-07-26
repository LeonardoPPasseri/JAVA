package poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demostrações;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemostraçãoStackTrace {
    //Uso do printStackTrace() para mostrar o caminho da exceção
    public static void main(String[] args) {

        metodo1();

        System.out.println("Fim do programa");
    }

    public static void metodo1(){
        System.out.println("***INICIO METODO 1***");
        metodo2();
        System.out.println("***FIM METODO 1***");
    }

    public static void metodo2(){
        System.out.println("***INICIO METODO 2***");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vetor = sc.nextLine().split(" ");
            int local = sc.nextInt();
            System.out.println(vetor[local]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("Input Error");
            e.printStackTrace();
        }
        
       
        System.out.println("***FIM METODO 2***");
        sc.close();
    }
}

