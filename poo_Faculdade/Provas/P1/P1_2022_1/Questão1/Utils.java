package poo_Faculdade.Provas.P1.P1_2022_1.Questão1;
import java.util.ArrayList;
import java.util.List;
public class Utils {
    

    public static boolean existe(ArrayList<Planta> x, Planta y){
        return x.contains(y);
    }

    public static Planta[] ordena(List<Planta> x) {
        Planta[] plantas = new Planta[x.size()];

        x.sort((a, b) -> a.getTamanho() > b.getTamanho() ? 1 : 0);

        for (int i = 0; i < plantas.length; i++) {
            plantas[i] = x.get(i);
        }
        return plantas;
    }

    public static ArrayList<Planta> retornaDados(ArrayList<String> stringsPlantas){
        ArrayList<Planta> plantas = new ArrayList<>();
        for(String lista : stringsPlantas){
            String[] vetor = lista.split("#");

            if(vetor[3].equalsIgnoreCase("B")){
                Briofitas b = new Briofitas(vetor[0]);
                b.setNome(vetor[1]);
                b.setTamanho(Double.parseDouble(vetor[2]));
                plantas.add(b);
            }

            if(vetor[3].equalsIgnoreCase("P")){
                Pteridofitas p = new Pteridofitas(vetor[0]);
                p.setNome(vetor[1]);
                p.setTamanho(Double.parseDouble(vetor[2]));
                plantas.add(p);
            }
        }
        return plantas;
    }

}

