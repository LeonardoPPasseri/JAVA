package poo_Udemy.Seção_15_TratamentoDeExceções.Exceções_Personalizadas.Demo_App_Boa.Exception;

public class DomainException extends Exception {
    //Criando uma exceção
    //Se usar o "extends RunTimeException" significa que não sera preciso tratar a exceção.
    public DomainException(String msg){
        super(msg);
    }
}
