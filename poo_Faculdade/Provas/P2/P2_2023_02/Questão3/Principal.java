package Questão3;

public class Principal {
    public static void main(String[] args) {
        Caneta c = new Caneta(); // -> print (F) // -> print (X)
        c.setCor("azul"); 
        Caneta c2 = new Caneta(); // -> print (F) // -> print (X)
        c2.setCor("preta");
        c2.setQuantidade(3); //qtd = 3
        metodoCan1(c);
        metodoCan2(c2);
        int i=15;
        Integer j = i++; // j= 15 e i = 16
        qtd(i);
        ++i; //i = 17
        qtd2(j); // O j não recebe esse valor retornado
        System.out.println(i);  // -> print (17)
        System.out.println(j); // -> print (15)
        System.out.println(c.getQuantidade());  // -> print (2)
        System.out.println(c2.getQuantidade()); // -> print (2)
        System.out.println(c.getCor());  // -> print (vermelho)
        System.out.println(c2.getCor());  // -> print (preta)
    }
    public static void metodoCan1(Caneta c) {
        c.setCor("vermelho");
        c.setQuantidade(9); //qtd = 9
    }
    public static void metodoCan2(Caneta c) {
        c.setQuantidade(2); //qtd = 2
        c = new Caneta(); // -> print (F) // -> print (X)
        c.setCor("lilas");
    }
    public static void qtd(int i) {
        i = 19;
    }
    public static Integer qtd2(Integer i) {
        return i+15;
    }
}
/*
F
X       
F       
X       
F       
X       
17      
15      
2       
2       
vermelho
preta
*/