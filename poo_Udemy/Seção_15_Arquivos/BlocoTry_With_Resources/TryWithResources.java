package BlocoTry_With_Resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String path = "C:\\ArquivoJAVAExemplos\\TextoExemplo1.txt";
        
//Usando o bloco try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {         
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

