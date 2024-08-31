package poo_Faculdade.Provas.P2.P2_2022_01.Questão3;


public class TestaCaneta {
    public static void main(String[] args) {
        Caneta c = new Caneta();
        c.setCor("rosa");
        Caneta c2 = new Caneta();
        c2.setCor("verde");
        c2.setQuantidade(3);
        Caneta c3 = new Caneta();
        c3.setCor("dourado");
        metodoCan1(c2);
        metodoCan2(c3);
        metodoCan3(c); 
        c.x = 20;
        c2.x = 15;
        c3.x = 10; 
        System.out.println(c.x+c2.x+c3.x); //->Print 1 = (30)
        int i = c3.getQuantidade();
        System.out.println(i); // -> Print 2 = (2)
        System.out.println(c.getQuantidade()); //-> Print 3 = (0)
        System.out.println(c2.getQuantidade()); //-> Print 4 = (9)
        System.out.println(c3.getQuantidade()); //-> Print 5 = (2)
        System.out.println(c.getCor()); //-> Print 6 = (Rosa)
        System.out.println(c2.getCor()); //-> Print 7 = (vermelho)
        System.out.println(c3.getCor()); //-> Print 8 = (dourado)
        int y = 11;
        c = metodoCan4(c, y); //
        System.out.println(c.getCor()); //-> Print 9 = (prata)
        System.out.println(c.getQuantidade()); //-> Print 10 = (0)
        System.out.println(c.x); //-> Print 11 = (10)
        System.out.println(y); //-> Print 12 = (11)
    }

    public static void metodoCan1(Caneta c) {
        c.setCor("vermelho");
        c.setQuantidade(9);
        c=null;
    }
    public static void metodoCan2(Caneta c) {
        c.setQuantidade(2);
        c = new Caneta();
        c.setCor("azul");
    }
    public static void metodoCan3(Caneta c) {
        c = new Caneta();
        c.setCor("preto");
        c.setQuantidade(1);
    }
    public static Caneta metodoCan4(Caneta c, int u) {
        c=new Caneta();
        c.setCor("prata");
        u = u + 15;
        return c;
    }
} 

/*
30
2       
0       
9       
2       
rosa    
vermelho
dourado 
prata   
0       
10      
11  
*/

