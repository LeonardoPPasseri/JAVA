package poo_Faculdade.aula1_Object.Questão6;

public class TesteCasaJanela {
    public static void main(String[]args){
        Janela janela = new Janela();
        Casa casa = new Casa();

        janela.cor = "verde";
        janela.material = "madeira";

        casa.cor = "Branco";
        casa.numero = 181;
        casa.janela.cor = "dourado";
        casa.janela.material = "Porcelana";
        
    }
}
