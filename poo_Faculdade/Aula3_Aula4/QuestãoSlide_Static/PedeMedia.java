package poo_Faculdade.Aula3_Aula4.QuestãoSlide_Static;

public class PedeMedia {
    public static void main(String[] args) {
        System.out.println("A media é: " 
            + String.format("%.2f",  Util.calculaMedia(5.5, 4.5)));

        System.out.println("A media é: " 
            + String.format("%.2f", Util.calculaMedia(88.25, 10.4, 6.7)));

        System.out.println("A media é: " 
            + String.format("%.2f", Util.calculaMedia(2, 4, 6, 100.4)));

        //Não é preciso instanciar(criar um objeto) para que seja possivel chamar os metodos staticos
        //Usando o Nome_da_Classe.nome_do_metodo(argumentos) já funciona
    }
}
