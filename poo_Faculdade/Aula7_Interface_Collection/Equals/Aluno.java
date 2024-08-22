package poo_Faculdade.Aula7_Interface_Collection.Equals;

public class Aluno {
    String nome;
    int cpf;

    Aluno(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Aluno){
            System.out.println("passou");
            Aluno a = (Aluno)o;
            return a.nome == nome;
        }else{
            
            Aluno a = new Aluno(((String)o), 123);
            return a.nome == nome;
        }
    }
    @Override
    public String toString(){
        return "" + nome + cpf;
    }
}
