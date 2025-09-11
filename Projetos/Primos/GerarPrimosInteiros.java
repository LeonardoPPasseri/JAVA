package Projetos.Primos;
import java.security.SecureRandom;


public class GerarPrimosInteiros {
    public static boolean isPrimo(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static Integer[] gerarInteiros(){
        SecureRandom secureRandom = new SecureRandom();
        Integer[] inteiros = new Integer[2];
        for (int i = 0; i < inteiros.length; i++) {
            do {
                inteiros[i] = secureRandom.nextInt(100);
            } while (!isPrimo(inteiros[i]));
        }
        return inteiros;
    }

    public static void main(String[] args) {
        Integer[] primos = gerarInteiros();
        System.out.println("Primos gerados: " + primos[0] + " e " + primos[1]);
    }
}
