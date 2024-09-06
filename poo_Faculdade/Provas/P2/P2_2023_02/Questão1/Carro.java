package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String placa;
    private String cor;
    private int ano;
    private String renavan;
    private List<Acessorio>  lista = new ArrayList<>();

    public void adicionar(Acessorio a){
        lista.add(a);
    }

    public void setAno(int ano) {
        this.ano = ano;
    }public int getAno() {
        return ano;
    }public void setCor(String cor) {
        this.cor = cor;
    }public String getCor() {
        return cor;
    }public void setRenavan(String renavan) {
        this.renavan = renavan;
    }public String getRenavan() {
        return renavan;
    }
    public void setLista(List<Acessorio> lista) {
        this.lista = lista;
    }public List<Acessorio> getLista() {
        return lista;
    }public void setPlaca(String placa) {
        this.placa = placa;
    }public String getPlaca() {
        return placa;
    }
}
