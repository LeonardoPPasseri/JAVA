package Padroes_De_Software.Atividade1.Facade;

import Padroes_De_Software.Atividade1.Subsistemas.ProcesPag;
import Padroes_De_Software.Atividade1.Subsistemas.VerifDisponCarro;
import Padroes_De_Software.Atividade1.Subsistemas.VerifDisponQuarto;
import Padroes_De_Software.Atividade1.Subsistemas.VerifDisponVoo;

public class ReservaFacade {
    private VerifDisponVoo voo;
    private VerifDisponQuarto hotelQuarto;
    private VerifDisponCarro carro;
    private ProcesPag pagamento;

    public ReservaFacade() {
        this.voo = new VerifDisponVoo();
        this.hotelQuarto = new VerifDisponQuarto();
        this.carro = new VerifDisponCarro();
        this.pagamento = new ProcesPag();
    }

    public void reservarViagem(String origem, String destino,double valor, String hotel, int quarto) {
        System.out.println("Iniciando reserva...");

        if (voo.isDisponivel(origem,destino) && hotelQuarto.isDisponivel(hotel,quarto) && carro.isDisponivel(destino) && pagamento.verificarPagamento(valor)) {
            voo.reservarVoo();
            hotelQuarto.reservarQuarto();
            carro.ReservarCarro();
            pagamento.realizarPagamento();

            System.out.println("Viagem concluída com sucesso!");
        } else {
            System.out.println("Falha na reserva da viagem.");
        }
    }
}

