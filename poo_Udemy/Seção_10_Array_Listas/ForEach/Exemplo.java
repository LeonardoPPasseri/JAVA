package poo_Udemy.Seção_10_Array_Listas.ForEach;

public class Exemplo {
    
    public static void main(String[] args) {
        /*
         for(<tipo> apelido : coleção){
            <comando 1>
            <comando 2>
         }
         */
        String[] vect  = new String[] {"Maria","bob","alex"};

        for ( String nomes : vect) { // Para cada Objeto "nomes" contido em "vect" faça...
            //Percorre todo o vetor
            System.out.println(nomes);
        }
    }
}
