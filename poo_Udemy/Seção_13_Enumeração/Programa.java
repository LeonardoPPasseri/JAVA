package poo_Udemy.Seção_13_Enumeração;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Pedido teste = new Pedido(1000, new Date(), OrdemDeStatus.PAGAMENTO_PENDENTE);
        System.out.println(teste);

        OrdemDeStatus os1 = OrdemDeStatus.ENVIADO;
        OrdemDeStatus os2 = OrdemDeStatus.valueOf("ENVIADO"); //O método valueOf() vai checar se o objeto é nulo e, se ele for, é retornada a string "null", caso contrário será feita a chamada de .toString() do objeto.
        System.out.println(os1);
        System.out.println(os2);
        
    }
}
