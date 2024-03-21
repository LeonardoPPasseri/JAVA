package poo_Faculdade.Provas.P1_2023_01.Questão2;
import java.util.Scanner;
public class Dados {
    String nome;
    Double peso;
    Double altura;
    public String fomatoDados(){
        return (nome+"#"+peso+"#"+altura);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String teste;
        int i=0;
        double totalpeso=0;
        do{
            
            System.out.println("Digite nome peso altura no formato(nome#peso#altura): ");
            teste = sc.nextLine();
            String[] vetor = teste.split("#");
            totalpeso = Double.valueOf(vetor[1]).doubleValue();//String -> Double;
            totalpeso += totalpeso;
            

            System.out.println("Para finalizar digite (finalizar), para continuar aperte (enter)");
            teste = sc.nextLine();
            i++;
        }while(teste != "x");
        double mediapeso = totalpeso/i;
        System.out.println(mediapeso);
        sc.close();
    }
}
