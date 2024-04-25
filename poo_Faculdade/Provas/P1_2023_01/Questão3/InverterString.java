package poo_Faculdade.Provas.P1_2023_01.Questão3;

public class InverterString {
   
    public static void main(String[] args){
        String frase = "LeonardO";
        System.out.println(inverterString(frase));
    }
    public static String inverterString(String frase){
        int i = 0;
        char x[] = frase.toCharArray();
        char[] charInvertido = new char[x.length];
    for(int c=x.length-1;c>=0;c--){
        charInvertido[i] = x[c];
        i++;
    }
    return String.valueOf(charInvertido);
    }
}
