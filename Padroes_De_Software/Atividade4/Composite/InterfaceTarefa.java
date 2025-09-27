package Padroes_De_Software.Atividade4.Composite;

public interface InterfaceTarefa {
    void consultar();
    Estado getEstado();
    void concluir();
    void cancelar();
}
