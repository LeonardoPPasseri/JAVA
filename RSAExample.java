import java.security.*;
import java.security.spec.*;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSAExample {
    public static void main(String[] args) throws Exception {
        // 1. Gerar par de chaves
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair pair = keyGen.generateKeyPair();

        PublicKey chavePublica = pair.getPublic();
        PrivateKey chavePrivada = pair.getPrivate();

        // 2. Converter chaves para strings Base64
        String chavePublicaStr = Base64.getEncoder().encodeToString(chavePublica.getEncoded());
        String chavePrivadaStr = Base64.getEncoder().encodeToString(chavePrivada.getEncoded());

        System.out.println("Chave Pública (Base64): " + chavePublicaStr);
        System.out.println("Chave Privada (Base64): " + chavePrivadaStr);

        // 3. Reconstruir as chaves a partir das strings
        byte[] chavePublicaBytes = Base64.getDecoder().decode(chavePublicaStr);
        byte[] chavePrivadaBytes = Base64.getDecoder().decode(chavePrivadaStr);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey chavePublicaRecuperada = keyFactory.generatePublic(new X509EncodedKeySpec(chavePublicaBytes));
        PrivateKey chavePrivadaRecuperada = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(chavePrivadaBytes));

        // 4. Criptografar com a chave pública reconstruída
        String mensagemOriginal = "Hello RSA";
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, chavePublicaRecuperada);
        byte[] dadosCriptografados = cipher.doFinal(mensagemOriginal.getBytes());
        System.out.println("Mensagem criptografada: " + new String(dadosCriptografados));

        // 5. Descriptografar com a chave privada reconstruída
        cipher.init(Cipher.DECRYPT_MODE, chavePrivadaRecuperada);
        byte[] dadosDescriptografados = cipher.doFinal(dadosCriptografados);

        System.out.println("Mensagem descriptografada: " + new String(dadosDescriptografados));
    }
}

