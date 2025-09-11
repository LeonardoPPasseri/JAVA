package Projetos.RSA;
import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
    private BigInteger e, d, n;
    private int bitlen = 1024;
    
    //Criptografia/Descriptografia de numeros inteiros usando o RSA 
    public RSA(){ 
        SecureRandom r = new SecureRandom();
        BigInteger p = BigInteger.probablePrime(bitlen / 2, r);
        BigInteger q = BigInteger.probablePrime(bitlen / 2, r);
        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.valueOf(65537);
        d = e.modInverse(phi);
    }
    public BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    public BigInteger decrypt(BigInteger cipher) {
        return cipher.modPow(d, n);
    }

    public static void main(String[] args) {
        RSA rsa = new RSA();
        BigInteger message = new BigInteger("12345");
        BigInteger cipher = rsa.encrypt(message);
        BigInteger decrypted = rsa.decrypt(cipher);
        System.out.println();
        System.out.println("Mensagem: " + message);
        System.out.println("Criptografada: " + cipher);
        System.out.println("Descriptografada: " + decrypted);
    }
}
