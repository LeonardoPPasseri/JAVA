package Padroes_De_Software.Atividade4.Composite;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas implements InterfaceTarefa {
    private String descricao;
    private EstadoTarefa estado = new EstadoTarefa();
    private List<InterfaceTarefa> tarefas = new ArrayList<>();
    private ListaTarefas listaPai;

    public ListaTarefas(String descricao) {
        this.descricao = descricao;
    }

    protected void atualizarEstado() {
        if (!isconcluida()) {
            estado.cancelar();
        } else {
            estado.concluir();
        }
        if (listaPai != null) {
            listaPai.atualizarEstado();
        }
    }

    public void concluir() {
        for (InterfaceTarefa tarefa : tarefas) {
            tarefa.concluir();
        }
        if (isconcluida()) {
            estado.concluir();
            System.out.println("Lista (" + descricao + "): " + getEstado());
        }
    }
    public void cancelar() {
        estado.cancelar();
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
            ((Tarefa) tarefa).setlista(this);
        } else if (tarefa instanceof ListaTarefas) {
            ((ListaTarefas) tarefa).setlista(this);
        }
    }
    public void remove(InterfaceTarefa tarefa) {
        tarefas.remove(tarefa);
    }

    protected boolean isconcluida() {
        for (InterfaceTarefa t : tarefas) {
            if (t.getEstado().toString().equals("nao concluida")) {
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

    public EstadoTarefa getEstado() {
        return estado;
    }
    private void setlista(ListaTarefas l) {
        this.listaPai = l;
    }

}