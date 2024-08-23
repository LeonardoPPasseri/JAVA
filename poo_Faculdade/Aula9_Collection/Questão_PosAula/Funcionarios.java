package poo_Faculdade.Aula9_Collection.Questão_PosAula;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios {
    private String nome;
    private double salario;
    
    Funcionarios(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }public double getSalario() {
        return salario;
    }public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return ""+nome+ " - " +salario;
    }
    public static List ordena(List<Funcionarios> lista){
        Funcionarios aux1 = new Funcionarios(null, 0);
        List<Funcionarios> aux = lista;
        double maior= 0.0;
        List ordem = new ArrayList<>();
        int tamanho = lista.size();

        while(ordem.size() != tamanho){
            for (Funcionarios l : aux) {
                if(l.salario > 0 && l.salario > maior){
                    maior = l.salario;
                    aux1 = l;
                }
            }
            ordem.add(aux1);
            maior = 0.0;
            aux.remove(aux1);
        }
        
        return ordem;
    }
    
}
