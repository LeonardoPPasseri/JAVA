package Padroes_De_Software.Atividade1.Cliente;

import Padroes_De_Software.Atividade1.Facade.ReservaFacade;

public class Cliente{
    public static void main(String[] args){
        ReservaFacade reserva = new ReservaFacade();
        reserva.reservarViagem("Rio de janeiro","Lisboa",5000,"Mirante",402);
    }
}