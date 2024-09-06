package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão1;

import java.util.ArrayList;
import java.util.Iterator;

public class Instituição {
    private String nome;
    private ArrayList listaDeLivros = new ArrayList<>(); 

    public void setNome(String nome) {
        this.nome = nome;
    }public String getNome() {
        return nome;
    }public ArrayList getListaDeLivros() {
        return listaDeLivros;
    }

    public ArrayList inserirLivro(Livro livro){
        listaDeLivros.add(livro);
        return listaDeLivros;
    }

    public void imprimeRelatorioGeral(ArrayList lista){
        Iterator<Livro> elemento = lista.iterator();
        while(elemento.hasNext()){
            Livro e = elemento.next();
            if(e instanceof LivroDeBiblioteca){
                System.out.println(e.getNome() +" # "+ e.getISBN() +" # "+ e.getAno() +" # "+ ((LivroDeBiblioteca)e).getAlugado());
            }
            if(e instanceof LivroDeLivraria){
                System.out.println(e.getNome() +" # "+ e.getISBN() +" # "+ e.getAno() +" # "+ ((LivroDeLivraria)e).getVendido());
            }
        }
    }

}
