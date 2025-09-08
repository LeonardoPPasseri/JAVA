package SegurançaDaInformação.RSA;

public class Main {
    public static void main(String[] args) {
        Criptografia teste = new Criptografia();
        System.out.println("");
        System.out.println("=============");

        Integer[] x = teste.gerarCript();
        
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("=============");
    }
}
