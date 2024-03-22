package poo_Udemy.Seção_10_Array_Listas.Listas.QuestãoProposta;
public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;


    public Funcionario(){
      /* Scanner sc = new Scanner(System.in);
        System.out.print("Id: ");
        id = sc.nextInt();
        System.out.print("Nome: ");

        System.out.print("Salario: ");
        */
    }
    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void incrementarSalario(double porcentagem){
        setSalario(salario*(1+(porcentagem/100)));
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    
}
