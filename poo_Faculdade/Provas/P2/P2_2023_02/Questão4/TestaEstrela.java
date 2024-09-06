package poo_Faculdade.Provas.P2.P2_2023_02.Questão4;

public class TestaEstrela {
    public static void main(String[] args) {
        Estrela v1 = new Estrela();
        v1.setNome("Rigel");
        Estrela v2 = new Estrela();
        Estrela v3 = new Estrela();
        v2.setNome("Sirius");
        teste1(v1, v2);
        System.out.println(v1.getNome()); //1- antares
        System.out.println(v2.getNome()); //2- canopus
        int x = 81;
        v1.p1=17;
        v1.p1 = v2.p1;
        System.out.println(x); //3- 81
        teste2(v1.p1, x, v1);
        System.out.println(v1.getNome()); //4- sol
        System.out.println(x); //5- 81
        System.out.println(v1.p1); //6- 1
        System.out.println(v1.p2);//7 - 33
        teste3(v2);
        System.out.println(v2.getNome()); //8- canopus
        System.out.println(v2.p1);//9- 1
        v3 = teste3(v2);
        System.out.println(v2.getNome()); //10- canopus
        v3.setNome("Altair");
        System.out.println(v2.getNome());//11- canopus
    }

    public static void teste1(Estrela v2, Estrela v1) {
        v1.setNome("Canopus");
        v1 = v2;
        v1.setNome("Antares");
        v2=v1;
    }
    public static void teste2(int x, int a, Estrela arv) {
        a = 87;
        x=19;
        arv.setNome("Sol");
        arv = new Estrela();
        arv.p1=46;
        arv.p2=33;
    }
    public static Estrela teste3(Estrela v2) {
        v2 = new Estrela();
        v2.setNome("Vega");
        return v2;
    }
}
/*
Antares
Canopus
81     
Sol    
81     
1      
33     
Canopus
1      
Canopus
Canopus
*/
