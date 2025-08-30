package poo_Faculdade.Padroes_De_Software.Atividade1;

public class VerifDisponCarro {
    private boolean disponibilidade = true;

    public boolean ReservarCarro(String cidade){
        if(disponibilidade){
            disponibilidade = false;
            System.out.println("Carro alugado em " + cidade);
            return true;
        }else{
            System.out.println("Carro indisponivel");
            return disponibilidade = false;
        }
    }
}
