package poo_Faculdade.Padroes_De_Software.Atividade1;

public class ReservaFacade {
    private ProcesPag procesPag;
    private VerifDisponVoo verifDisponVoo;
    private VerifDisponQuarto verifDisponQuarto;
    private VerifDisponCarro reservaCarro;
    
    ReservaFacade(){
        this.procesPag = new ProcesPag();
        this.verifDisponVoo = new VerifDisponVoo();
        this.verifDisponQuarto = new VerifDisponQuarto();
        this.reservaCarro = new VerifDisponCarro();
    }

    public void Reservar(String nome, String origem, String destino, float valor, String hotel, int quarto){
        System.out.println("==================================");
        System.out.println("==== Iniciando Reserva ====");

        if(procesPag.VerificacaoPag(valor) && verifDisponVoo.dispVoo(origem, destino) && verifDisponQuarto.dispQuarto(hotel,quarto) && reservaCarro.ReservarCarro(destino)){
            System.out.println("==== Reserva Completa ====");
            System.out.println("==================================");
        }else{
            System.out.println("Falha na reserva da viagem");
            System.out.println("==================================");
        }
    }
}
