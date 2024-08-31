package poo_Faculdade.Provas.P2.P2_2023_01.Questão1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = {
            "BRA#Brasil#8503523#214546843",
            "ARG#Argentina#28534386#45564523",
            "CHN#China#9600253#1425338453"
        };
        List<Pais> listaAll = new ArrayList<>();
        List<Pais> lista = CriaPaises.retornaPaises();

        try{
            listaAll = CriaPaises.retornaList(paises);
        }catch(FormatoIncorretoException e){
            System.out.println(e.getMessage());
        }

        for (Pais l1 : lista) {
            listaAll.add(l1);
        }
        System.out.print("Digite o codigo do pais: ");
        String codigo = sc.nextLine();
        Pais a = new Pais(codigo);
        if(listaAll.contains(a)){
            System.out.println(listaAll.get(listaAll.indexOf(a)));
        }else{
            System.out.println("O pais de codigo " + a.getCodigo() + " não esta na lista");
        }
    }
}
