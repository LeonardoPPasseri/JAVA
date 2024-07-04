package poo_Udemy.Seção_11_Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class P4_Calculos {
    public static void main(String[]args){
        /* =================================================================================== */ 
        //Aumentando ou diminuindo datas
        LocalDate d01 = LocalDate.now();
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        System.out.println(d01 + " - 7 dias => " + pastWeekLocalDate);//Diminui 7 dias

        LocalDateTime d02 = LocalDateTime.now();
        LocalDateTime horaAdiantadaLocalDateTime = d02.plusHours(12);
        System.out.println(d02 + " + 12 horas => " + horaAdiantadaLocalDateTime);

        Instant d03 = Instant.now();
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        System.out.println(d03 + " - 7 dias => " + pastWeekInstant);

        /* =================================================================================== */ 
        //Duração
        Duration t1 = Duration.between(d03, pastWeekInstant);
        System.out.println("Diferença entre d03 e pastWeekInstant: " + t1.toDays());

        Duration t2 = Duration.between(d02, horaAdiantadaLocalDateTime);
        System.out.println("Diferença entre d02 e horaAdiantadaLocalDateTime: " + t2.toMillis());

    }
}
