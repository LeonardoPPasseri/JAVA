package poo_Faculdade.Padroes_De_Software.Atividade1;

public class VerifDisponQuarto {
    private boolean disponibilidade = true;

    public boolean dispQuarto(String hotel, int quarto){
        if(disponibilidade){
            disponibilidade = false;
            System.out.println("Hotel "+hotel+"/quarto n°"+quarto+" reservado com sucesso!");
            return true;
        }else{
            System.out.println("Quarto indisponivel");
            return disponibilidade = false;
        }
    }
}
