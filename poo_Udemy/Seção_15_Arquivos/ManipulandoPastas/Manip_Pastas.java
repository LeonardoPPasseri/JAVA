package ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Manip_Pastas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho para a pasta: ");
        //File path = sc.nextLine();
        
        File path = new File("C:\\ArquivoJAVAExemplos");

        File[] folders = path.listFiles(File::isDirectory);
        //Cria um vetor de File que recebe pelo filtro apenas o caminho para pastas(isDirectory)
        for (File folder : folders) {
            System.out.println("Caminho/nome da pasta: "+folder);//printa o caminho da pasta
            System.out.println("Apenas nome da pasta: "+folder.getName());//Printa apenas o nome da pasta
            System.out.println("Apenas caminho: "+folder.getParent());//Printa apenas o caminho
            System.out.println("==========");
        }


        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        //Criar pastas
        // new File("path" + "\\Nome_da_Pasta_Nova");
        boolean success = new File("C:\\ArquivoJAVAExemplos" + "\\subPasta").mkdir();
        //.mkdir() retorna true se a pasta foi criada e false se não
        System.out.println("Criada com sucesso: " + success);
        sc.close();
    }
}