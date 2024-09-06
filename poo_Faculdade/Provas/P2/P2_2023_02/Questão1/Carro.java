package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String placa;
    private String cor;
    private int ano;
    private String renavan;
    private List<Acessorio> lista = new ArrayList<>();

    public List<Acessorio> adicionar(Acessorio acessorio){
        lista.add(acessorio);
        return lista;
    }

    public int getAno() {
        return ano;
    }public void setAno(int ano) {
        this.ano = ano;
    }public String getCor() {
        return cor;
    }public void setCor(String cor) {
        this.cor = cor;
    }public String getPlaca() {
        return placa;
    }public void setPlaca(String placa) {
        this.placa = placa;
    }public String getRenavan() {
        return renavan;
    }
    public List<Acessorio> getLista() {
        return lista;
    }
}
