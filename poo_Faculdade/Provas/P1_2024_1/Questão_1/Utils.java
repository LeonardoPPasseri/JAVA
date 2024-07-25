package poo_Faculdade.Provas.P1_2024_1.Questão_1;

import java.util.List;

public class Utils {
    
    /*
    public static List<String> getFuncionarios(){
        Retorna uma lista de funcionarios nome#salario => "Maria#3000"
    }
    */

    public static Funcionario[] parseFuncionarios(List<String> dados){
        int qtd = dados.size();
        int i = 0;
        Funcionario[] lista = new Funcionario[qtd];
        
        for (String funcString : dados) {
            String[] stringlista = funcString.split("#");
            lista[i] = new Funcionario(stringlista[0], Double.parseDouble(stringlista[1]));
            i += 1;
        }
        return lista;
    }
    public static double calcularMediaSalarios(Funcionario[] funcionarios){
        double total = 0.0;
        for (int i = 0; i < funcionarios.length; i++) {
            total += funcionarios[i].getSalario();
        }
        return total/funcionarios.length;
    }
}
