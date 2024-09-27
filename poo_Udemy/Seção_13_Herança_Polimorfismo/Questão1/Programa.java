package poo_Udemy.Seção_13_Herança_Polimorfismo.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){

        List<Funcionarios> lista = new ArrayList<>();
        Funcionarios func1 = new Funcionarios("bob", 100, 15.0);
        Funcionarios func2 = new FuncionariosTerceirizados("Jose", 100, 15.0, 200.0);
        lista.add(func1);
        lista.add(func2);

        System.out.println("PAGAMENTO");
        for (Funcionarios f : lista) {
            System.out.println(f);
        }
    }       
}
