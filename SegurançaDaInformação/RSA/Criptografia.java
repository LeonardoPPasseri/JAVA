package SegurançaDaInformação.RSA;

public class Criptografia {
    public Integer[] gerarCript(){
        Integer[] senha = GeradoraSenha.gerarInteiros();
        int p = senha[0];
        int q = senha[1];
        int n = p*q;
        int phi = (p - 1) * (q - 1); //φ(n) = (p-1)*(q-1)
        
        return senha;
    }
}
