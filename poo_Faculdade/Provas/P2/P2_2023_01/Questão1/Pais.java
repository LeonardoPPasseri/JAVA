package poo_Faculdade.Provas.P2.P2_2023_01.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigo;
    private String nome;
    private int população;
    private double dimenção;
    private List<String> fronteira = new ArrayList<>();

    public Pais(String codigo){
        this.codigo = codigo.toUpperCase();
    }
    public Pais(String codigo, String nome, double dimensão){
        this(codigo);
        this.nome = nome;
        this.dimenção = dimensão;
    }
    @Override
    public String toString(){
        return "Codigo: " + codigo + " - Nome: "+ nome + " - população: " + população + " - dimensão: " + dimenção + " - Fronteira: "+ fronteira;
    }
    @Override
    public boolean equals(Object o){
        Pais a = (Pais)o;
        if(codigo.equals(a.codigo)){ //SEMPRE USE EQUALS PARA COMPARAR STRINGS
            return true;
        }else{
            return false;
        }
    }
    
    public static double densidade(int população,double dimensão){
        return população/dimensão;
    }

    public boolean existeFronteira(Pais pais){
        return fronteira.contains(pais);
    }

    public void fronteira(Pais paisF){
        if(!existeFronteira(paisF)){
            fronteira.add(paisF.getNome());
        }else{
            System.out.println("[" + paisF + "] já inserido como fronteira");
        }
    }

    public void setPopulação(int população) {
        this.população = população;
    }public int getPopulação() {
        return população;
    }public void setDimenção(double dimenção) {
        this.dimenção = dimenção;
    }public double getDimenção() {
        return dimenção;
    }public String getCodigo() {
        return codigo;
    }public List<String> getFronteira() {
        return fronteira;
    }public void setNome(String nome) {
        this.nome = nome;
    }public String getNome() {
        return nome;
    }
}
