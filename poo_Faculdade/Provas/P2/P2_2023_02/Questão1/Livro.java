package Questão1;

public abstract class Livro {
    private String nome;
    private String autor;
    private int ano;
    private String ISBN;

    public Livro(int ano){
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o){
        Livro a = (Livro)o;
        if(ISBN.equals(a.ISBN)){
            return true;
        }else{
            return false;
        }
    }

    public int getAno() {
        return ano;
    }public void setAno(int ano) {
        this.ano = ano;
    }public String getAutor() {
        return autor;
    }public void setAutor(String autor) {
        this.autor = autor;
    }public String getNome() {
        return nome;
    }public String getISBN() {
        return ISBN;
    }public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
}
