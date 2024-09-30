package LendoArquivosManualmente;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivos {
    //Classes
    /*
    File
    Scanner
    IOException 
    */
    public static void main(String[] args) {
        File file = new File("C:\\ArquivoJAVAExemplos\\TextoExemplo1.txt");
        Scanner sc = null;
        
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println("ERRO: "+ e.getMessage());
            //É obrigado a prevenir a exceção "FileNotFoundException" usando a superClasse "IOException"
            //Nesse sentido, é possivel usar apenas o "FileNotFoundException" tb
        }finally{
            if(sc != null){
                sc.close();
            }
            //É necessario fechar o arquivo sempre que terminar de usa-lo
            //Caso aconteça um erro na "sc = new Scanner(file)" o Scanner ainda será null 
        }
    }
}
