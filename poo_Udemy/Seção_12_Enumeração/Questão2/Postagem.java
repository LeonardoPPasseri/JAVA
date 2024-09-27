package poo_Udemy.Seção_12_Enumeração.Questão2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
    
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentarios> listaComentarios = new ArrayList<>();

    Postagem(){
    }

    Postagem(LocalDateTime momento, String titulo, String conteudo, Integer likes){
        this.titulo = titulo;
        this.momento = momento;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes + " likes - " + momento.format(fmt) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for(Comentarios c : listaComentarios){
            sb.append(c.getComentario());
            sb.append("\n");
        }
        //System.out.print(titulo + "\n" + likes + " likes - " + momento.format(fmt) + "\n" + conteudo + "\n" + "Comentarios:");
        return sb.toString();
    }

    public void addComentario(Comentarios comentario){
        listaComentarios.add(comentario);
    }

    public List<Comentarios> getComentarios() {
        return listaComentarios;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public LocalDateTime getMomento() {
        return momento;
    }
    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
