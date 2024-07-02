package poo_Udemy.Seção_11_Data_Hora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P2_FormatData {
    public static void main(String[] args) {
        /* =================================================================================== */
        //Formatar dataHora para texto customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 => " + d01.format(fmt1));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 => " + d02.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        //Objeto fmt3 formata a hora de modo personalizado mas como o instant precisa saber qual é o fuso horario, devemos 
        //colocar o .withZone, e para finalizar colocamos o .sistemDefalt() para usar o fuso padrão do sistema.
        Instant d03 = Instant.parse("1999-09-17T01:00:00Z"); //A classe Instant não possui o metodo format
        System.out.println("d03 => " + fmt3.format(d03)); //Mas como usamos a classe DateTimeFormat podemos usar o metodo
        //OBS => Ao formatar é possivel trocar o fuso tambem!!!
        
        


    }
}
