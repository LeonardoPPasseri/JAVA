package poo_Faculdade.Aula1_Object.Questão2;

public class Principal {
    public static void main(String[]args){
        Gato a = new Gato();
        Gato b = new Gato();
        Gato c = new Gato();

        a.cor = "Branco";
        a.idade = 3;
        a.nome = "alex";

        b.cor = "Amarelo";
        b.idade = 2;
        b.nome = "bruno";

        c.cor = "Preto";
        c.idade = 6;
        c.nome = "carlos";

        System.out.println(a.nome + " " + a.cor + " " + a.idade);
        System.out.println(b.nome + " " + b.cor + " " + b.idade);
        System.out.println(c.nome + " " + c.cor + " " + c.idade);
    }
}
