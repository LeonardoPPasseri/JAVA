package poo_Faculdade.Aula8.Questão;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    
    public static boolean existe (List x, Funcionario y){
        if(x.contains(y)){
            return true;
        }else{
            return false;
        }
    }

    public static List retornaDados(String[] array_funcionarios){
        List<Funcionario> lista = new ArrayList<>();
        for (int i = 0; i < array_funcionarios.length; i++) {
            String[] s = array_funcionarios[i].split("#");
            if(s[3].equals("P")){ 
                //Para comparar uma referencia(s[3]) é melhor usar o equals()
                //Para comparar valores é melhor usar ==
                lista.add(new Programador(s[0]));
            }else{
                lista.add(new AnalistaSistemas(s[0]));
            }
        }
        return lista;
    }

    public static void mediaSalario(List<Funcionario> lista){
        double salarioP = 0.0;
        double salarioA = 0.0;
        int p = 0;
        int a = 0;
        for (Funcionario c : lista) {
            if(c instanceof Programador){
                salarioP += c.getSalario();
                p += 1;
            }else{
                salarioA += c.getSalario();
                a += 1;
            }
        }
        System.out.println("Salario Prog => R$" + salarioP/p);
        System.out.println("Salario Analis => R$" + salarioA/a);
    }
}
