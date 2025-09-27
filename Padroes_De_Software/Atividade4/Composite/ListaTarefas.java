package Padroes_De_Software.Atividade4.Composite;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefas implements InterfaceTarefa {
    private String descricao;
    private Estado estado = Estado.NAO_CONCLUIDA;
    private List<InterfaceTarefa> tarefas = new ArrayList<>();
    private ListaTarefas listaPai;

    public ListaTarefas(String descricao) {
        this.descricao = descricao;
    }

    protected void atualizarEstado() {
        if (isConcluida()) {
            estado = Estado.CONCLUIDA;
        } else {
            estado = Estado.NAO_CONCLUIDA;
        }
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public void concluir() {
        for (InterfaceTarefa tarefa : tarefas) {
            tarefa.concluir();
        }
        atualizarEstado();
        System.out.println("Lista (" + descricao + "): " + getEstado());
    }

    public void cancelar() {
        estado = Estado.NAO_CONCLUIDA;
        for (InterfaceTarefa tarefa : tarefas) {
            tarefa.cancelar();
        }
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public void add(InterfaceTarefa tarefa) {
        tarefas.add(tarefa);
        if (tarefa instanceof Tarefa) {
            ((Tarefa) tarefa).setLista(this);
        } else if (tarefa instanceof ListaTarefas) {
            ((ListaTarefas) tarefa).setLista(this);
        }
        atualizarEstado();
    }

    public void remove(InterfaceTarefa tarefa) {
        tarefas.remove(tarefa);
        atualizarEstado();
    }

    protected boolean isConcluida() {
        for (InterfaceTarefa t : tarefas) {
            if (t.getEstado() == Estado.NAO_CONCLUIDA) {
                return false;
            }
        }
        return true;
    }

    public void consultar() {
        for (InterfaceTarefa t : tarefas) {
            t.consultar();
        }
        System.out.println("Lista (" + descricao + "): " + getEstado());
    }

    public Estado getEstado() {
        return estado;
    }

    private void setLista(ListaTarefas l) {
        this.listaPai = l;
    }
}
