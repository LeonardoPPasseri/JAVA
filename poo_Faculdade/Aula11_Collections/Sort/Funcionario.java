package poo_Faculdade.Aula11_Collections.Sort;

class Funcionario implements Comparable<Funcionario>{
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return nome+"/"+salario;
    }

    public int compareTo(Funcionario f){
        //return nome.compareTo(f.nome); 
        //Compara duas strings e retorna (se nome>f.nome 1 , se nome<f.nome -1)

        if(salario > f.salario){
            return 1;
        }
        if(salario < f.salario){
            return -1;
        }
        else{
            return 0;
        }

    }

}
