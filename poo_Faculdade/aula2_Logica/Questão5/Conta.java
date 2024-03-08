package poo_Faculdade.aula2_Logica.Questão5;

public class Conta {
    double saldo;
    public void calcula() { //calcula é um metodo, então letra minuscula na inicial
        double testeSaldo = saldo; /* O erro se encontra na falta de incialização da variavel testeSaldo
 que nao possuia valor*/
        if (saldo < 1000) {
            testeSaldo = saldo*0.1;
        }   
        System.out.println(testeSaldo);
    }
}

/*
public class Conta {
    double saldo;
    public void calcula () {
                             O erro se encontra na falta de incialização da variavel testeSaldo
 que nao possuia valor
        if (saldo < 1000) {
        double testeSaldo = saldo*0.1;
        }   
    System.out.println(testeSaldo);
    }
}
*/