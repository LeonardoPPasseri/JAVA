package poo_Udemy.Seção_11_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploData {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        System.out.println("localData d01: " + d01);
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("localDataTime d02: " + d02);
        Instant d03 = Instant.now();
        System.out.println("Instant d03: " + d03);

    }
}
