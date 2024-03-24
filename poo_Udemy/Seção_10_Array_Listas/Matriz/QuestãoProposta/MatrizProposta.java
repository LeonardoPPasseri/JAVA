package poo_Udemy.Seção_10_Array_Listas.Matriz.QuestãoProposta;
import java.util.Scanner;
public class MatrizProposta {
    
    public static void main(String[] args) {
        int M = 2;int N = 3;
        Integer[][] matriz = new Integer[M][N];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores: ");
        for(int i = 0; i<M;i++){
            for(int j = 0;j<N;j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println(matriz[0][0]+ "  " + matriz[0][1] + "  " + matriz[0][2]);
        System.out.println(matriz[1][0] + "  " + matriz[1][1] + "  " + matriz[1][2]); 

        System.out.print("Digite um valor da matriz: ");
        int valor = sc.nextInt();
        for(int i = 0; i<M;i++){
            for(int j = 0;j<N;j++){
                if(matriz[i][j] == valor){
                    System.out.println("Posição: (" + i + "," + j + ")");
                    if((i-1) >= 0){
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    if((i+1) < M){
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                    if((j-1) >= 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if((j+1) < N){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                }
            }
        }
        sc.close();
    }
}
