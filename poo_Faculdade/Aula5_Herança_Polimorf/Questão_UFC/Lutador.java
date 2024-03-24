package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

import java.util.ArrayList;
import java.util.List;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;

    public Lutador(String nome,int idade,double peso){
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    public static void possiveisLutas(Lutador lutadores[], int lutador){
        String className = lutadores[lutador].getClass().getSimpleName();
        System.out.println("Esse lutador pode ser oponente de: ");
        for (int i = 0;i<lutadores.length;i++) {
            if(lutadores[i].getNome() == lutadores[lutador].getNome()){  
            //.getClass().getSimpleName(); Usado para pegar o nome da classe que foi instanciada e colocar em string
            }else if (lutadores[i].getClass().getSimpleName().toString() == className) {
                System.out.println(lutadores[i].getNome());
            }
        }
    }

    public static void sorteioLutas(Lutador lutadores[], int lutador){
        String className = lutadores[lutador].getClass().getSimpleName();
        Lutador lutPrincipal = lutadores[lutador];
        List <Lutador> todosLut = new ArrayList<>();
        for(int i=0;i<lutadores.length;i++){
            todosLut.add(lutadores[i]);
        }
        List <Lutador> qualificados = new ArrayList<>();
        
        for (Lutador quali : todosLut) {
            if(quali.getNome() == lutadores[lutador].getNome()){  

            }else if (quali.getClass().getSimpleName() == className) {
                qualificados.add(quali);
            }
        }
    
        int escolhido = (int)(Math.random() * qualificados.size());
        //System.out.println(escolhido);
        Lutador oponente = qualificados.get(escolhido);
        
        System.out.println("===========================");
        System.out.println(lutPrincipal);
        System.out.println("============= vs =============");
        System.out.println(oponente);
      
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
}
