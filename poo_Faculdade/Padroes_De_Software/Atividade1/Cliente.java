package poo_Faculdade.Padroes_De_Software.Atividade1;

public class Cliente{
    public static void main(String[] args){
        ReservaFacade reserva = new ReservaFacade();
        reserva.Reservar("José Carlos","Rio de janeiro","Lisboa",5000,"Mirante",402);
    }
}