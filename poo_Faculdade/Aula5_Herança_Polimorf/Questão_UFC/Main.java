package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[2];
        Scanner sc = new Scanner(System.in);
        String nome;int idade;double peso;
        
        for(int i=0; i<lutadores.length;i++){
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Peso: ");
            peso = sc.nextDouble();
            sc.nextLine();
            if(peso <= 65){
                lutadores[i] = new PesoPena(nome,idade,peso);
            }else if(peso > 65 && peso <= 84){
                lutadores[i] = new PesoMedio(nome,idade,peso);
            }else if(peso > 84 && peso <= 93){
                lutadores[i] = new MeioPesado(nome,idade,peso);
            }else if(peso > 93 && peso <= 120.2){
                lutadores[i] = new PesoPesado(nome,idade,peso);
            }else{
                System.out.println("Desclassificado");
            }
            String lut = (nome + "/" + idade + "/" + peso);
            System.out.println(lut);
        }
        System.out.println("Escolha entre 0 e 9");
       // int escolha = sc.nextInt();
       // lutadores[escolha];

       sc.close();
    }
}
