package Padroes_De_Software.Atividade4.Composite;

class EstadoTarefa {
    private String estado = "nao concluida";

    protected void concluir() {
        estado = "concluida";
    }

    protected void cancelar() {
        estado = "nao concluida";
    }

    @Override
    public String toString() {
        return "" + estado;
    }
}