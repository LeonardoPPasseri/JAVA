package poo_Faculdade.Aula2_Logica_Array.QuestãoSlide_Array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mochila[] mochilas = new Mochila[4];
        Scanner sc = new Scanner(System.in);
        int total=0;
        for(int i = 0;i<mochilas.length;i++){
            mochilas[i] = new Mochila();
            sc.nextLine(); //Usado para corrigir o erro do Scanner que aceita o Enter como String
            System.out.print("Digite a cor: ");
            mochilas[i].cor = sc.nextLine();
            
            System.out.print("Digite o ano de fabricação: ");
            mochilas[i].ano = sc.nextInt();
            System.out.println();
            total += mochilas[i].ano; 
        }  
        System.out.println("A media do ano de fabricação das mochilas é " + total/mochilas.length);    
        sc.close();  
    }
}
