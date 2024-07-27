package poo_Udemy.Seção_15_TratamentoDeExceções.Questão_1;

public class Programa {
    public static void main(String[] args) {
        try{
            System.out.println("****Entre com os dados da conta****");
            System.out.println("Numero: 8021");
            int numero = 8021;
            System.out.println("Nome: Bob Brown");
            String nome = "Bob Brown";
            System.out.println("Saldo inicial: 500.00");
            double saldo = 500.00;
            System.out.println("Saque limite: 300.00");
            double limite = 300.00;
            System.out.println("Quantia para saque: 100.00");
            double quantia = 100.00;
            Account acc = new Account(numero,nome,saldo,limite);
            acc.sacar(quantia);
            System.out.println("Saldo atual: " + acc.getSaldo());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Erro inexperado");
        }
    }    
}
