package Desafios.Map_Notas_lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Desafio1 {
    public static void main(String[] args) {
        Map<String, List<Double>> alunosNotas = new HashMap<>();

        List<Double> notasJoao = new ArrayList<>();
        notasJoao.add(8.5);
        notasJoao.add(7.0);
        alunosNotas.put("João", notasJoao);

        List<Double> notasMaria = new ArrayList<>();
        notasMaria.add(2.0);
        notasMaria.add(9.5);
        alunosNotas.put("Maria", notasMaria);

        Map<String,Boolean> lista2 = retornaSituação(alunosNotas);
        Iterator<String> e = (lista2.keySet()).iterator();
        while(e.hasNext()){
            String aluno = e.next();
            System.out.println(aluno+"//"+lista2.get(aluno));
        }
    }

    public static Map<String,Boolean> retornaSituação(Map<String,List<Double>> lista){
        Iterator<String> e = (lista.keySet()).iterator();
        Map<String,Boolean> lista3 = new HashMap<>();
        List<Double> notas;
        while(e.hasNext()){
            double total = 0.0;
            String aluno = e.next();
            notas = lista.get(aluno);
            for (Double d : notas) {
                total += d;
            }
            double media = total/2;
            if(media >= 7){
                lista3.put(aluno,true);
            }else{
                lista3.put(aluno,false);
            }
        }
        return lista3;
    }
}
//Um metodo que recebe um map com nome e nota de alunos, esse metodo deve devolver uma lista com os nomes e a situação de aprovação dos alunos.

