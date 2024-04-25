package poo_Faculdade.Provas.P1_2023_01.Questão2;
import java.util.Scanner;
public class Dados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String teste = "";
        int contador = 0;
        double totalpeso = 0;
        double doublePeso;

        while(!teste.equalsIgnoreCase("finalizar") && contador < 1000 ){
            
            System.out.println("Digite nome peso altura no formato(nome#peso#altura): ");
            teste = sc.nextLine();
            String[] vetor = teste.split("#");
            doublePeso = Double.parseDouble(vetor[1]); //String -> Double;
            totalpeso += doublePeso;

            System.out.println("Para finalizar digite (finalizar), para continuar aperte (enter)");
            teste = sc.nextLine();
            contador++;
        }
       
        double mediapeso = totalpeso/contador;
        System.out.println(mediapeso);
        sc.close();
    }
}
