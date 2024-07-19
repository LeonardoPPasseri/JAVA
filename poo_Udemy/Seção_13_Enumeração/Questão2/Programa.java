package poo_Udemy.Seção_13_Enumeração.Questão2;
import java.time.LocalDateTime;

public class Programa {
    
    public static void main(String[]args){
        Postagem a = new Postagem(LocalDateTime.now(),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
        Comentarios c1 = new Comentarios("Have a nice trip");
        Comentarios c2 = new Comentarios("Wow that's awesome!");
        a.addComentario(c1);
        a.addComentario(c2);
        
        Postagem b = new Postagem(LocalDateTime.now(),"Good night guys","See you tomorrow",5);
        Comentarios c3 = new Comentarios("Good night");
        Comentarios c4 = new Comentarios("May the Force be with you");
        b.addComentario(c3);
        b.addComentario(c4);

        System.out.println(a);
        System.out.println();
        System.out.println(b);
    }
}