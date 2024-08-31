package poo_Faculdade.Aula11_Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    //O sort é um metodo da classe Collections e usado junto ao compareTo()
    //Usado para organizar uma lista de forma personalizada
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 2500.00));
        funcionarios.add(new Funcionario("Maria", 3000.00));
        funcionarios.add(new Funcionario("Pedro", 2800.00));
        funcionarios.add(new Funcionario("Ana", 3500.00));
        System.out.println(funcionarios);

        Collections.sort(funcionarios);

        System.out.println(funcionarios);

    }

}
