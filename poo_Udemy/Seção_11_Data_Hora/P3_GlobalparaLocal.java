package poo_Udemy.Seção_11_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class P3_GlobalparaLocal {
    public static void main(String[] args) {
    
        /* =================================================================================== */ 
        //Converter DataHoraGlobal para DataHoraLocal
        //Necessario DataHoraGlobal e o timezone do sistema local
        Instant d03 = Instant.parse("2024-07-02T01:36:30Z");
        LocalDateTime r01 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        System.out.println(d03 + " => " + r01);
        LocalDateTime r02 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));
        System.out.println(d03 + " => " + r02);

        /* =================================================================================== */ 
        //Obter os dados da data usando o metodo get
        LocalDate d01 = LocalDate.parse("2024-07-02");
        System.out.println("Dia => " + d01.getDayOfMonth());
        System.out.println("MÊS(nome) => "+ d01.getMonth());
        System.out.println("MÊS => "+ d01.getMonthValue());
        System.out.println("Dia => " + d01.getYear());

        LocalDateTime d02 = LocalDateTime.parse("2024-07-02T01:36:30");
        System.out.println("Hora => " + d02.getHour());
        System.out.println("Dia => " + d02.getMinute());
    }
}
