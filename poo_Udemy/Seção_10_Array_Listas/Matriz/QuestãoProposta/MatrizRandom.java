package poo_Udemy.Seção_10_Array_Listas.Matriz.QuestãoProposta;
import java.util.Scanner;

public class MatrizRandom {
    public static void main(String[] args) {

        int N = (int) (Math.random() * 7) + 3; // entre 3 e 10
        int M = (int) (Math.random() * 7) + 3; 
        Integer[][] matriz = new Integer[M][N];

        Scanner sc = new Scanner(System.in);
        int aux=0;

        for(int i = 0; i<M;i++){
            for(int j = 0;j<N;j++){
                matriz[i][j] = (int) (Math.random() * 90) + 10 ; //Mantem os numeros entre 10 - 99
            }
        }
        
        for(int i = 0; i<M;i++){
            for(int j = 0;j<N;j++){
                if(i > aux){
                    System.out.print(matriz[i][j] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
            aux = i - 1;
        }
       
        System.out.print("Digite um valor da matriz: ");
        int valor = sc.nextInt();
        System.out.println("=======================");
        for(int i = 0; i<M;i++){
            for(int j = 0;j<N;j++){
                if(matriz[i][j] == valor){
                    System.out.println("Posição: (" + i + "," + j + ")");
                    if((i-1) >= 0){
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    if((j-1) >= 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if((j+1) < N){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if((i+1) < M){
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                    System.out.println("=======================");
                }
            }
        }
        sc.close();
    }
}
