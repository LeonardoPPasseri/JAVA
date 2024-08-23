package poo_Faculdade.Aula8.SistemaOrientadoAObjetos;

public class Casa extends Imovel {
    private boolean piscina;

    public Casa(boolean piscina, String nomeProp, String endereço, String status, double valor, int id){
        super(nomeProp,endereço,status,valor,id);
        this.piscina = piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }public boolean getPiscina(){
        return piscina;
    }
}
