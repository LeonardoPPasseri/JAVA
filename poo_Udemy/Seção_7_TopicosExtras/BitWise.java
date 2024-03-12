package poo_Udemy.Seção_7_TopicosExtras;

public class BitWise {
    public static void main(String[] args) {
        int X = 89;
        int Y = 64;
        int mascara = 32; //100 000 SextoDigito é 1
        int resultado;
        System.out.println(X | Y);
        System.out.println(X & Y);
        System.out.println(X ^ Y);

        System.out.println(resultado = Y ^ mascara);//Verifica se o SextoBit do Y é 1 ou 0
        
        if(resultado == 32){
            System.out.println("O sextobit de Y é 0");
        }else{
            System.out.println("O sextobit de Y é 1");
        }
        //Essa estratégia é usada para verificar se um espaço de bit em um numero é 1 ou 0
    }
}


/*
    1 - Verdadeiro e 0 - Falso

    | verifica bit a bit e se um dos bits nas duas sequencias X Y for 1 ele transfere esse 1 para o resultado;

    & verifica bit a bit e se os dois dos bits forem 1 ele transfere esse 1 para o resultado;

    ^ mesma coisa que o | mas se os dois forem verdadeiro, trasfere o resultado 0(falso);
 */