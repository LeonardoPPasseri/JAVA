package Padroes_De_Software.Atividade1.Subsistemas_Facade;

public class VerifDisponCarro {
    private boolean disponibilidade = true;
    private String cidade;

    protected void ReservarCarro(){
        System.out.println("Carro alugado em " + cidade);
    }

    protected boolean isDisponivel(String cidade) {
        if(disponibilidade){
            this.cidade = cidade;
            return true;
        }else{
            System.out.println("Carro indisponivel");
            return false;
        }
    }
}
