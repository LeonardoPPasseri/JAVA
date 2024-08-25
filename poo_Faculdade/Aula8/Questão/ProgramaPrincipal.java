package poo_Faculdade.Aula8.Questão;

import java.util.ArrayList;
import java.util.List;

import poo_Faculdade.Provas.P1.P1_2024_1.Questão_2.Produto;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        String a = "154-3#Simba Silva#3200#A";
        String b = "553-2#Juju Juba#10000.0#P";
        String[] array = new String[2];
        array[0] = a;
        array[1] = b;
        List<Funcionario> listaF = Utils.retornaDados(array);
        for (Funcionario l : listaF) {
            System.out.println("=========");
            System.out.println(l);
        }

        System.out.println("=================================");
        Utils.mediaSalario(listaF);
        System.out.println("=================================");

        List<Object> x = new ArrayList<>();
        Funcionario c = new Funcionario("123");
        Funcionario d = new Funcionario("1234");
        x.add(new Produto("312"));
        x.add(c);
        x.add(d);
        System.out.println(Utils.existe(x, d));
    }

    
}
