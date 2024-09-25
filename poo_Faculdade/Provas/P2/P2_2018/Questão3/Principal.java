package poo_Faculdade.Provas.P2.P2_2018.Questão3;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        Livro l1 = new Livro("123");
        Livro l2 = new Livro("123");
        Livro l3 = new Livro("321");
        c.adicionar(l1);
        c.adicionar(l2);
        c.adicionar(l3);
        Utils.frequecia(c);
    }
}
