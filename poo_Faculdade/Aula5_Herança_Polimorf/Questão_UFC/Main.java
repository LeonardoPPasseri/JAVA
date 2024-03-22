package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[4];
     //   Lutador objeto = new  Lutador(null, 0,0);
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
            
        }
        for(Lutador lutador : lutadores){
            String lut = (lutador.getNome() + "/" + lutador.getIdade() + "/" + lutador.getPeso());
            System.out.println(lut);
        }
        System.out.println("Escolha entre 0 a " + (lutadores.length-1));
        int escolha = sc.nextInt();
        Lutador.possiveisLutas(lutadores, escolha);
        Lutador.sorteioLutas(lutadores,escolha);
       sc.close();
    }
}
