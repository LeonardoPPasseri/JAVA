package poo_Faculdade.Provas.P1.P1_2024_1.Questão_1;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {

            List<String> func = new ArrayList<>();
            //List<String> func = Utils.getFuncionarios();
            Funcionario[] x = Utils.parseFuncionarios(func);
            System.out.println(Utils.calcularMediaSalarios(x));
        }
}
