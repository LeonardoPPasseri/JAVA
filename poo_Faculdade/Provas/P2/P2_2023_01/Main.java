package poo_Faculdade.Provas.P2.P2_2023_01;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo do pais: ");
        String codigo = sc.nextLine();
        List<Pais> lista = CriaPaises.retornaPaises();
        Pais a = new Pais(codigo);
        if(lista.contains(a)){
            System.out.println("passou");
            System.out.println(lista.get(lista.indexOf(a)));
        }else{
            System.out.println("O pais de codigo " + a.getCodigo() + " não esta na lista");
        }
    }
}
