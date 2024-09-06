package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão4;

public class MeuNumero {
    
    public static double media(String str)throws NumeroNegativoException{
        //numero#numero#...
        String[] array = str.split("#");
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if(Integer.parseInt(array[i]) < 0){
                throw new NumeroNegativoException("Numero negativo detectado: " + array[i]);
            }
            total += Integer.parseInt(array[i]);
        }
        return (double)total/(array.length);
    }
}
/*
    Crie uma classe chamada MeuNumero com um método estático chamado media
    . Esse método deve
    receber um argumento do tipo String
    . Essa String sempre será no formato número#número#... (ex:
    15#14#3...). 
    Você não sabe quantos caracteres ‘#’ virão na String, mas sabe que um número está
    sempre entre eles.
     Se algum dos números dessa String for negativo, esse método deve lançar uma
    exceção checked chamada NumeroNegativoException (crie a classe da exceção).
     Nesse caso, você deve passar para o construtor desta classe uma String que informa o primeiro número negativo
    passado, caso haja algum.
     Se todos forem positivos, o método deve retornar a média dos números.
    Crie a classe e o método de forma que tudo compile. Crie uma nova classe que contenha o método
    main e que receba um número do console a partir da seguinte mensagem: “Insira uma String que
    contenha números separados pelo caractere ‘#”:”. Caso o usuário digite apenas números positivos na
    String, deve ser apresentada a mensagem: “A média é: [xxx]”, em que [xxx] é a média de todos os
    números. Caso a exceção seja lançada, imprima no console: “O número [yyy] é negativo, insira
    apenas números positivos.”, em que [yyy] é o número passado no construtor da exceção lançada.
 */