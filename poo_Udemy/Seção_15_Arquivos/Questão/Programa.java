package Questão;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade).
*/
public class Programa {
    public static void main(String[] args) {
        String path = "C:\\ArquivoJAVAExemplos\\Questão";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: NPQ.csv");
        String nomeArq = "NPQ.csv";
        
        boolean success = new File(path + "\\out").mkdir();
        System.out.println("Pasta criada: " + success);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path + "\\out" + "\\summary.csv")))){
            try(BufferedReader br = new BufferedReader(new FileReader(new File(path + "\\" + nomeArq)))){
                String line = br.readLine();
                while(line != null){
                    String[] arr = line.split(",");
                    double preçoUn = Double.parseDouble(arr[1]);
                    int quant = Integer.parseInt(arr[2]);
                    bw.write(arr[0]+","+(preçoUn*quant));
                    bw.newLine();
                    line = br.readLine();
                }
            }catch(IOException e){
                e.printStackTrace();
            } 
        }catch(IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
