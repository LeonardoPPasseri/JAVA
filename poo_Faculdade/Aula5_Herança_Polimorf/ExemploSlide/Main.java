package poo_Faculdade.Aula5_Herança_Polimorf.ExemploSlide;

public class Main {
    
    public static void main(String[] args) {
        Animal a = new Gato();
        // não é possivel chamar esse metodo dessa forma a.miar(); 
        a.emitirSom();
        //Um dos usos da herança com polimorfismo é a sobreposição de metodos
        //No caso esse metodo "emitirSom()" esta presente na class animal e na classe gato.
        //Objeto do tipo Animal mas com caracteristicas de Gato();
    }
}
