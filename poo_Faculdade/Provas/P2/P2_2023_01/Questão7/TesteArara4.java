package poo_Faculdade.Provas.P2.P2_2023_01.Questão7;

public class TesteArara4 {
    public static void main(String[] args) {
        Arara x = new Arara();
        Arara y = x;
        x.setCor("Azul");
        System.out.println(y.getCor()); // -> Print 1 = (Azul)
        y.setCor("Lilás");
        y = new Arara();
        System.out.println(y.getCor()); // -> Print 2 = (null)
        y.setIdade(25);
        new Arara(); // teste = 3
        y.teste = y.teste + 23; //teste = 26
        System.out.println(x.teste); // -> Print 3 = (26)
        teste1(x, y);
        System.out.println(x.getCor()); // -> Print 5 = (dourado)
        System.out.println(y.getCor()); // -> Print 6 = (prata)
        int k = 9;
        teste2(k, x.getIdade(), x, y);
        System.out.println(x.teste); // -> Print 8 = (44)
        y.teste = y.teste + 93; // teste = 137
        System.out.println(x.teste); // -> Print 9 = (137)
        System.out.println(k); // -> Print 10 = (9)
        System.out.println(x.getCor()); // -> Print 11 = (dourado)
        System.out.println(x.getIdade()); // -> Print 12 = (0)
    }

    public static void teste1(Arara x, Arara y) {
        x.setCor("Dourada");
        x = new Arara(); //teste = 27
        x.setCor("Creme");
        y.setCor("Prata");
        y = x;
        x = y;
        System.out.println(x.getCor()); // -> Print 4 = (creme)
    }

    public static Arara teste2(int a, int b, Arara y, Arara x) {
        a = 8;
        b=11;
        x.setCor("Verde");
        x.teste = x.teste + 17; // teste = 44
        System.out.println("resultado: " + a + a); // -> Print 7 = (resultado: 88)
        y=x;
        return x;
    }
}

/*
Azul
null
26
Creme        
Dourada      
Prata        
resultado: 88
44
137
9
Dourada      
0
*/