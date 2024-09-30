package FileWriter_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    //new FileWriter(path) --> Cria/Recria um arquivo
    //new FileWriter(path,true) --> Acrescenta ao arquivo existente
    //BufferedWriter é uma otimização
    public static void main(String[] args) {
        String[] linhas = new String[] {"Bom dia","Boa tarde","Criado manualmente em codigo"};
        String path = "C:\\ArquivoJAVAExemplos\\TextoCriado.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
      //try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){   
            for(String linha : linhas){
                bw.write(linha);
                bw.newLine();//Esse modo não faz a quebra de linha por padrão
            }
            System.out.println("Criado com sucesso!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
