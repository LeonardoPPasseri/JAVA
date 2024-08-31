package poo_Faculdade.Aula9_Iterator_Set_Map.Questão_PosAula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Funcionarios> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionarios("João Silva", 2500.00));
        funcionarios.add(new Funcionarios("Maria Santos", 3000.00));
        funcionarios.add(new Funcionarios("Pedro Oliveira", 2800.00));
        funcionarios.add(new Funcionarios("Ana Souza", 3500.00));
        funcionarios.add(new Funcionarios("Carlos Pereira", 2200.00));
        funcionarios.add(new Funcionarios("Fernanda Alves", 2200.00));
        funcionarios.add(new Funcionarios("Gabriel Lima", 3200.00));
        funcionarios.add(new Funcionarios("Isabela Rodrigues", 2700.00));
        funcionarios.add(new Funcionarios("Lucas Costa", 3100.00));
        funcionarios.add(new Funcionarios("Rafaela Martins", 2600.00));

        List<Funcionarios> ordenado = Funcionarios.ordena(funcionarios);
        Iterator elementos = ordenado.iterator();
        while(elementos.hasNext()){
            System.out.println(elementos.next());
        }
    }
}
