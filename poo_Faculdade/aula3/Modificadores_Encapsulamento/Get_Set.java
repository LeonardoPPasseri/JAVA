package poo_Faculdade.aula3.Modificadores_Encapsulamento;

public class Get_Set {
    private String nome;
    private double altura;

    /*
    get(pegar) é criado um metodo "get<Nome_do_atributo>()" que serve para acessar o valor desse atributo

    set(definir) é criado um metodo "set<Nome_do_atributo>()" que serve para alterar o valor desse atributo

    A palavra this. serve para referenciar um atributo fora do metodo
    Esse this.nome por exemplo ao ser chamado coloca esse valor atribuido diretamente no objeto
    em vez de colocar na variavel
    
    */
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome; 
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    

}
