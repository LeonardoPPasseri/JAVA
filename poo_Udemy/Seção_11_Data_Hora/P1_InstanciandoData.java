package poo_Udemy.Seção_11_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P1_InstanciandoData {
    public static void main(String[] args) {
        /* =================================================================================== */
        //Como instanciar a data atual e/ou com fuso GMT

        LocalDate d01 = LocalDate.now(); //Instancia a data atual
        System.out.println(d01); //2024-06-27

        LocalDateTime d02 = LocalDateTime.now();//Instancia a data e o horario atual
        System.out.println(d02); //2024-06-27T10:01:34.985294400

        Instant d03 = Instant.now();//Instancia a data e hora atual mas no fuso GMT
        System.out.println(d03); //2024-06-27T13:04:43.325874400Z
        // Z significa que o horario esta no fuso (+0) GMT

        /* =================================================================================== */ 
        //PADRÃO ISO 8601 ( LocalDate => yyyy-MM-dd // LocalDateTime => yyyy-MM-ddTHH:mm:ss )
        // Instant => yyyy-MM-ddTHH:mm:ssZ ou yyyy-MM-ddTHH:mm:ss-03:00 por exemplo

        LocalDate d04 = LocalDate.parse("1999-09-16"); //Passa um texto no padrão para objeto LocalDate
        System.out.println(d04);// 1999-09-16

        LocalDateTime d05 = LocalDateTime.parse("1999-09-16T23:00:00");//Passa um texto no padrão para LocalDateTime
        System.out.println(d05); // 1999-09-16T23:00

        Instant d06 = Instant.parse("1999-09-16T23:00:00Z");//Passa um texto no padrão para Instant (Horario GMT)
        System.out.println(d06); // 1999-09-16T23:00:00Z

        Instant d07 = Instant.parse("1999-09-16T23:00:00-03:00"); //Texto com horario em fuso -3 é colocado para GMT
        System.out.println(d07); // 1999-09-17T02:00:00Z

        LocalDate d010 = LocalDate.of(1999,9,16);//Passa a data como parametro
        System.out.println(d010);// 1999-09-16

        /* =================================================================================== */
        //DateTimeFormmatter -> Criar uma forma especifica para enviar a data ou data/hora

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("16/09/1999",fmt01); //No objeto LocalDate tem sobrecargas para um formato
        System.out.println(d08); // 1999-09-16

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
        LocalDateTime d09 = LocalDateTime.parse("16/09/1999 23:00",fmt02); 
        System.out.println(d09); // 1999-09-16 23:00


    }
}
