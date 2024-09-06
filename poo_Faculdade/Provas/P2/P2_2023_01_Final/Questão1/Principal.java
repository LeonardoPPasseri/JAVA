package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LivroDeBiblioteca livroB1 = new LivroDeBiblioteca(1999, false);
        LivroDeBiblioteca livroB2 = new LivroDeBiblioteca(1953, false);
        LivroDeLivraria livroL1 = new LivroDeLivraria(2015, false);
        LivroDeLivraria livroL2 = new LivroDeLivraria(2022, false);

        //teste
        livroB1.setISBN("qwe");
        livroB2.setISBN("hjk");
        livroL1.setISBN("zxc");
        livroL2.setISBN("asd");
        //=======

        Instituição inst = new Instituição();
        inst.inserirLivro(livroB1);
        inst.inserirLivro(livroB2);
        inst.inserirLivro(livroL1);
        inst.inserirLivro(livroL2);

        inst.imprimeRelatorioGeral(inst.getListaDeLivros());

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o ISBN do livro a ser consultado: ");
        String ISBN = sc.nextLine();
        Livro teste = new LivroDeBiblioteca(0, false);
        teste.setISBN(ISBN); 
        if(inst.getListaDeLivros().contains(teste)){
            Livro a = (Livro)(inst.getListaDeLivros()).get(inst.getListaDeLivros().indexOf(teste));
            //q locura pprt
            System.out.println(a.getNome() + a.getAutor() + a.getAno());
        }else{
            System.out.println("Não está nessa instituição");
        }
    }
}
