package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        Carro a = new Carro();
        Carro b = new Carro();
        Acessorio som = new Som("", 500);
        Acessorio vidroEletrico = new VidroEletrico("", 200);

        a.adicionar(som);
        a.adicionar(vidroEletrico);
        b.adicionar(som);
        b.adicionar(vidroEletrico);

        listaCarros.add(a);
        listaCarros.add(b);

        Utils2.imprimirCustos(listaCarros);
    }
}
