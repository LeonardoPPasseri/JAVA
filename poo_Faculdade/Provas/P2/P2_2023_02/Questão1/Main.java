package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> lista = new ArrayList<>();
        Carro a = new Carro();
        Carro b = new Carro();
        lista.add(a);
        lista.add(b);
        
        Acessorio som = new Som("", 500);
        Acessorio VidroEletrico = new VidroEletrico("", 250);

        a.adicionar(som);
        a.adicionar(VidroEletrico);
        b.adicionar(som);
        b.adicionar(VidroEletrico);

        Utils2.imprimirCustos(lista);

    }
}
