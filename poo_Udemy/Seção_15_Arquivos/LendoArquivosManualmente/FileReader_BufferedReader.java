package poo_Udemy.Seção_15_Arquivos.LendoArquivosManualmente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {
    /*
    FileReader ->Fluxo de leitura de caracteres a partir de arquivos
    BufferedReader ->Otimização do FileReader usando buffer
    */
    public static void main(String[] args) {
        String path = "C:\\\\ArquivoJAVAExemplos\\\\TextoExemplo1.txt";
        FileReader fr = null;
        BufferedReader br = null;
        //O BufferedReader pode usar, em seu construtor, qualquer tipo de leitor
        //O BufferedReader lê um fluxo de entrada de um reader e armazena em um buffer para 
        //propocionar uma leitura mais eficiênte
        try {
            fr = new FileReader(path);
            //System.out.println(fr); //"java.io.FileReader@24d46ca6"
                                
            br = new BufferedReader(fr);
           //System.out.println(br);  //"java.io.BufferedReader@372f7a8d"
            String line = br.readLine();
            //System.out.println(line);  "bom dia"
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally{

            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }  
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
