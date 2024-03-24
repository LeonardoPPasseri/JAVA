package poo_Udemy.Seção_10_Array_Listas.Matriz;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        int N = 2;
        Integer[][] matriz = new Integer[N][N];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("==============");
        System.out.println(matriz[0][0]+ "  " + matriz[0][1]);
        System.out.println(matriz[1][0] + "  " + matriz[1][1]); 
        System.out.println("==============");
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(i == j){
                    System.out.print(matriz[i][j]+ " "); 
                }
            }       
        }    
        sc.close();    
    }
}   
