package SegurançaDaInformação.Java_security;
import java.security.SecureRandom;

public class RNG {
    public static boolean isPrimo(int teste){
        if(teste < 2) return false;
        if(teste == 2 || teste == 3) return true;
        if(teste % 2 == 0 || teste % 3 == 0) return false;

        for(int i = 5; i*i <= teste;i+=6){
            if(teste % i == 0 || teste % i+2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int teste;
        do{
            teste = secureRandom.nextInt(100);
        }while(!isPrimo(teste));
        System.out.println("================");
        System.out.println(teste);
    }
}
