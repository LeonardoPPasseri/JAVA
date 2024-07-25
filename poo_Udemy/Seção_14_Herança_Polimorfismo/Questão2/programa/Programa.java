package poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2.programa;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2.Produto;
import poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2.ProdutoImportado;
import poo_Udemy.Seção_14_Herança_Polimorfismo.Questão2.ProdutoUsado;


public class Programa {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        Produto prod1 = new Produto("TV",1000.0);
        Produto prod2 = new ProdutoImportado("Celular", 850.0, 100.0);
        Produto prod3 = new ProdutoUsado("PS4",2400.0,LocalDate.parse("2019-09-23"));

        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        
        System.out.println(prod1.etiqueta());
        System.out.println(prod2.etiqueta());
        System.out.println(prod3.etiqueta());
    }

}
