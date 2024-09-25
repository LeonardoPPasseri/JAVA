package poo_Faculdade.Provas.P2.P2_2018.Questão3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List lista = new ArrayList<>();   

    public void adicionar(Object o){
        lista.add(o);
    }
    
    public List getLista() {
        return lista;
    }
}
