package Padroes_De_Software.Atividade1.Subsistemas;

public class VerifDisponQuarto {
    private boolean disponibilidade = true;
    private String hotel;
    private int quarto;

    public boolean isDisponivel(String hotel, int quarto) {
        if(disponibilidade){
            this.hotel = hotel;
            this.quarto = quarto;
            return true;
        }else{
            System.out.println("Quarto indisponivel");
            return disponibilidade = false;
        }
    }

    public void reservarQuarto() {
        System.out.println("Hotel "+ hotel +"/quarto n°"+quarto+" reservado com sucesso!");
    }
}
