package poo_Udemy.Seção_14_TratamentoDeExceções.Exceções_Personalizadas.Demostrações;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemostraçãoFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String[] vetor = sc.nextLine().split(" ");
            int local = sc.nextInt();
            System.out.println(vetor[local]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position: " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Input Error: " + e.getMessage());
        }
        finally{
            //Bloco de codigo que sera executado independentende de ter ocorrido exceção
            //Usado para fechar arquivos apos o uso
            sc.close();
        }
        System.out.println("Fim do programa");
    }
}
