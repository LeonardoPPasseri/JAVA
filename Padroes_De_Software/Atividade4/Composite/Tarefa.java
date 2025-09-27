package Padroes_De_Software.Atividade4.Composite;

public class Tarefa implements InterfaceTarefa {
    private String descricao;
    private EstadoTarefa estado = new EstadoTarefa();
    private ListaTarefas listaPai;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    protected void setlista(ListaTarefas l) {
        this.listaPai = l;
    }

    public void consultar() {
        System.out.println("Tarefa (" + descricao + "): " + estado);
    }

    public void concluir() {
        System.out.println("Executando " + descricao + ".... Concluida!");
        estado.concluir();
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public void cancelar() {
        estado.cancelar();
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public EstadoTarefa getEstado(){
        return estado;
    }
}
