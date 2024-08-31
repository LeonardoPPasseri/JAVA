package poo_Faculdade.Provas.P2.P2_2023_01.Questão1;

import java.util.ArrayList;
import java.util.List;

public class CriaPaises {
    
    public static List retornaPaises(){
        Pais eua = new Pais("eua", "EstadosUnidosDaAmerica", 1230441);
        Pais canada = new Pais("can", "Canadá", 1234502);
        Pais mexico = new Pais("MEX", "México", 700568);
        (mexico.getFronteira()).add(eua.getNome());
        (eua.getFronteira()).add(mexico.getNome());
        (eua.getFronteira()).add(canada.getNome());
        (canada.getFronteira()).add(eua.getNome());
        List<Pais> lista = new ArrayList<>();
        lista.add(mexico);
        lista.add(eua);
        lista.add(canada);
        
        return lista;
    }
    public static List retornaList(String[] aStr) throws FormatoIncorretoException{
        String codigo;
        String nome;
        double dimensão = 0.0;
        int população = 0;
        int b = 0;
        List<Pais> lista = new ArrayList<>();
        Pais a = new Pais("0");
        for (int i = 0; i < aStr.length; i++) {
            String[] lstr = aStr[i].split("#");
            b = lstr.length;
            if(b < 4 || b > 4){
                throw new FormatoIncorretoException("A string: [" + aStr[i] + "] esta incorreta. O numero de # é " + (b-1));
            }
            for (int j = 0; j < lstr.length; j++) {
                codigo = lstr[0];
                nome = lstr[1];
                dimensão = Double.parseDouble(lstr[2]);
                população = Integer.parseInt(lstr[3]);
                a = new Pais(codigo, nome, dimensão);
                a.setPopulação(população);
            } 
            lista.add(a);
        }
        return lista;
    }

}

/*]

 */
