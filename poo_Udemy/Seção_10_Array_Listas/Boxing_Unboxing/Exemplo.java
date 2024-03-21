package poo_Udemy.Seção_10_Array_Listas.Boxing_Unboxing;

public class Exemplo {
    
    public static void main(String[] args) { //Boxing
        int x = 20; //variavel x que está na stack
        Object obj = x; //Criação de um obj na stack que aponta para o valor 20 que foi criado no heap
        System.out.println(obj);


        int y = (int) obj;
        //Criação de uma variavel e valor 20 no stack em que esse valor estava encaixotado(no heap) foi DESENCAIXOTADO (UNBOXING)
        System.out.println(y);
    }
    
}
