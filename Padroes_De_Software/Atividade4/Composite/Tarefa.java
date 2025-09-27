package Padroes_De_Software.Atividade4.Composite;

public class Tarefa implements InterfaceTarefa {
    private String descricao;
    private Estado estado = Estado.NAO_CONCLUIDA;
    private ListaTarefas listaPai;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    protected void setLista(ListaTarefas l) {
        this.listaPai = l;
    }

    public void consultar() {
        System.out.println("Tarefa (" + descricao + "): " + estado);
    }

    public void concluir() {
        estado = Estado.CONCLUIDA;
        System.out.println("Executando " + descricao + ".... "+  estado);
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public void cancelar() {
        estado = Estado.NAO_CONCLUIDA;
        System.out.println("Cancelando " + descricao + ".... "+  estado);
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public Estado getEstado() {
        return estado;
    }
}
