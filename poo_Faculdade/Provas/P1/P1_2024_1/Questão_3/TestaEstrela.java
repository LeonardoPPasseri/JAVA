package poo_Faculdade.Provas.P1.P1_2024_1.Questão_3;

public class TestaEstrela {
    public static void main(String[] args) {
        Estrela v1 = new Estrela();
        v1.setNome("Antares");
        Estrela v2 = new Estrela();
        Estrela v3 = new Estrela();
        v2.setNome("Sirius");
        teste1(v1, v2);
        System.out.println(v1.getNome());
        System.out.println(v2.getNome());
        int x = 81;
        v1.p1=11;
        v1.p1 = v2.p1;
        System.out.println(x);
        teste2(v1.p1, x, v1);
        System.out.println(v1.getNome());
        System.out.println(x);
        System.out.println(v1.p1);
        System.out.println(v1.p2);
        teste3(v2);
        System.out.println(v2.getNome());
        System.out.println(v2.p1);
        v3 = teste3(v2);
        v3.setNome("Altair");
        System.out.println(v2.getNome());
    }

    public static void teste1(Estrela v2, Estrela v1) {
        v1.setNome("Rigel");
        v1 = v2;
        v1.setNome("Alfa");
        v2=v1;
        v2.setNome("Pollux");
    }
    public static void teste2(int x, int a, Estrela arv) {
        a = 12;
        x=18;
        arv.setNome("Beta");
        arv = new Estrela();
        arv.p1=46;
        arv.p2=33;
    }
    public static Estrela teste3(Estrela v2) {
        v2 = new Estrela();
        v2.setNome("Canopus");
        return v2;
    }
}
/*
Pollux
Rigel
81
Beta
81
1
33
Rigel
1
Rigel
*/