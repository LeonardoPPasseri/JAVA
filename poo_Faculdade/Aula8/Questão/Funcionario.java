package poo_Faculdade.Aula8.Questão;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;

    Funcionario(String id){
        this.id = id;
    }
    @Override
    public String toString(){
        return id + " - " + nome + " - R$ " + salario;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Funcionario){

           Funcionario x = (Funcionario)o;
           if(x.id == id){
            return true;
           }else{
            
            return false;
           }
        }else{
            
            return false;
        }
    }
    public double getSalario() {
        return salario;
    }
}
