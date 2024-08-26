package poo_Faculdade.Aula8.SistemaOrientadoAObjetos;

public class Imovel {
    private String nomeProp;
    private String endereço;
    private String status;
    private double valor;
    private int id;

    public Imovel(int id){
        this.id = id;
    }
    public Imovel(){
    }
    public Imovel(String status){
        this.status = status;
    }
    public Imovel(String nomeProp, String endereço, String status, double valor, int id) {
        this.nomeProp = nomeProp;
        this.endereço = endereço;
        this.status = status;
        this.valor = valor;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Endereço: " + endereço + " - Status: " + status + " - Valor: R$" + valor + " - ID: " + id;
    }
    @Override
    public boolean equals(Object o){
        Imovel a = (Imovel) o;
        if(a.getId() != 0){
            System.out.println("Uso do equals com id");
            if(id == (a.id)){
            return true;
            }else{
                return false;
            }
        }else{
            System.out.println("Uso do equals com venda");
            if(status.equals(a.getStatus())){
                return true;
            }else{
                return false;
            }
        }
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }public String getEndereço() {
        return endereço;
    }public void setId(int id) {
        this.id = id;
    }public int getId() {
        return id;
    }public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }public String getNomeProp() {
        return nomeProp;
    }public void setStatus(String status) {
        this.status = status;
    }public String getStatus() {
        return status;
    }public void setValor(double valor) {
        this.valor = valor;
    }public double getValor() {
        return valor;
    }
}
