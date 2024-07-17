package poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC;

import java.util.ArrayList;
import java.util.List;

public abstract class Lutador {
    private String nome;
    private int idade;
    private double peso;
    int ID;

    public Lutador(String nome,int idade,double peso){
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    public static void possiveisLutas(Lutador lutadores[], int lutador){
        int IDEscolhido = lutadores[lutador].getID();
        System.out.println();
        System.out.println("Esse(s) lutador(es) pode(m) ser oponente: ");
        for (int i = 0;i<lutadores.length;i++) {
            if(lutadores[i].getNome() == lutadores[lutador].getNome()){
            }else if(IDEscolhido == lutadores[i].getID()){
                System.out.println(lutadores[i].getNome());
            }
        }
        System.out.println();
    }

    public static void sorteioLutas(Lutador lutadores[], int lutador){
        int IDEscolhido = lutadores[lutador].getID();
        Lutador lutPrincipal = lutadores[lutador];
       // List <Lutador> todosLut = new ArrayList<>(); //Criação da lista de todos os lutadores
        List <Lutador> qualificados = new ArrayList<>(); //Criação da lista dos qualificados a oponente
        for (int i = 0;i<lutadores.length;i++) {
          //  todosLut.add(lutadores[i]); //adiciona os lutadores a lista
            if(lutadores[i].getNome() == lutadores[lutador].getNome()){
            }else if(IDEscolhido == lutadores[i].getID()){
                qualificados.add(lutadores[i]); //adiciona os lutadores de msm categoria a lista de oponente
            }
        }
        if(qualificados.size() == 0){
            System.out.println("Não possui oponentes para criar a luta");
        }else{
            int escolhido = (int)(Math.random() * qualificados.size());
            Lutador oponente = qualificados.get(escolhido); 
            System.out.println("===========================");
            System.out.println(lutPrincipal);
            System.out.println("----------- vs -------------");
            System.out.println(oponente);
            System.out.println("===========================");
        }
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
    public int getID() {
        return ID;
    }

    public String toString(){
        return (getNome() + "/" + getIdade() + "/" + getPeso());
    }
}
