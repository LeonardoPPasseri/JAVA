package poo_Faculdade.Provas.P1.P1_2024_1.Questão_3;

public class Estrela {
    private String nome;
    public int p1;
    public static int p2;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Estrela() {
        p1++;
        ++p2;
    }
}
