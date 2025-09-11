package Padroes_De_Software.Atividade1.Subsistemas;

public class VerifDisponCarro {
    private boolean disponibilidade = true;
    private String cidade;

    public void ReservarCarro(){
        System.out.println("Carro alugado em " + cidade);
    }

    public boolean isDisponivel(String cidade) {
        if(disponibilidade){
            this.cidade = cidade;
            return true;
        }else{
            System.out.println("Carro indisponivel");
            return false;
        }
    }
}
