package poo_Udemy.Seção_10_Array_Listas.Array.Questão3;
import java.util.Scanner;
public class Alturas {
    public String nome;
    public double altura;
    public int idade;
    public static void main(String[] args) {
        double total = 0.0;
        double media = 0.0;
        double qtd_menos16 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos? ");
        int tamanho = sc.nextInt(); 
        Alturas[] dados = new Alturas[tamanho];
        for(int i = 0;i<dados.length;i++){
            dados[i] = new Alturas();
            System.out.print("Digite o nome: ");
            sc.nextLine();
            dados[i].nome = sc.nextLine();
            System.out.print("Digite a altura: ");
            dados[i].altura = sc.nextDouble();
            System.out.print("Digite a idade: ");
            dados[i].idade = sc.nextInt();
            total += dados[i].altura;
            if(dados[i].idade < 16){  
                qtd_menos16 += 1; 
            }
        }
        double tamDouble = tamanho;
        System.out.println();
        media = total/dados.length;
        System.out.println("Altura media: " + media);
        System.out.println("Menores de 16 anos: "+ qtd_menos16 + "  " +  (double)(qtd_menos16/tamDouble)*100 + "%");
        for(int i = 0;i<dados.length;i++){
            if(dados[i].idade < 16){  
                System.err.println(dados[i].nome + " ");
            }  
        }
        sc.close();
    }
}




    
