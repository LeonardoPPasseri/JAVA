package poo_Faculdade.Aula8.SistemaOrientadoAObjetos;

public class Apto extends Imovel{
    private String andar;
    private String numero;

    Apto(String nomeProp, String endereço, String status, double valor, int id,String andar,String numero){
        super(nomeProp,endereço,status,valor,id);
        this.andar = andar;
        this.numero = numero;
    }
    public void setAndar(String andar) {
        this.andar = andar;
    }public String getAndar() {
        return andar;
    }public void setNumero(String numero) {
        this.numero = numero;
    }public String getNumero() {
        return numero;
    }
}
