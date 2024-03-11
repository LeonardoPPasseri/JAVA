package poo_Faculdade.aula2_Logica;

public class Moldagem {
    short a,b;
    short soma( short a, short b){
        //return a + b; ERRO!
        return (short) (a + b); // Quando somamos a+b torna esse numero um INT. O que nao pode acontecer já que um short é menor que um int.
    }
    public static void main(String[] args) {
        Moldagem x = new Moldagem();
        x.a = 12;
        x.b = 16;
        System.out.println(x.soma(x.a,x.b));
    }
}
