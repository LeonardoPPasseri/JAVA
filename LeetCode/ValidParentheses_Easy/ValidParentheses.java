package LeetCode.ValidParentheses_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidParentheses {
    //ERRADA
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        String[] arr = s.split("");
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            lista.add(arr[i]);
        }
        List<String> listaPoss = new ArrayList<>();
        listaPoss.add("[");
        listaPoss.add("]");
        listaPoss.add("{");
        listaPoss.add("}");
        listaPoss.add("(");
        listaPoss.add(")");

        int[] lf = new int[6];
        int controle = 0;
        for (String lp : listaPoss) {
            lf[controle] = Collections.frequency(lista, lp);
            controle += 1;
        }
        if(lf[0] != lf[1] || lf[2] != lf[3] || lf[4] != lf[5]){
            return false;
        }else{
            return true;
        }

    }
}
//usar split para separa em arrays
//passar para uma lista
//usar o frequency para cada tipo possivel(use uma lista talvez)
//se for 1/3/5 erro
//se for 0/2/4 correto
