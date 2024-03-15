package poo_Faculdade.aula2_Logica_Array;

public class Argumento_Parametro {
    int a;
    int b;
    public static int soma(int a, int b){ //Parametro
        return a + b;
    }
    public static void main(String[]args){
        Argumento_Parametro.soma(4, 3);//Argumento
        System.out.println(Argumento_Parametro.soma(10,5)); 
    }
}

/*

 public static int soma(PARAMETRO){
    return 
 }
 ...main(){
    soma(ARGUMENTO);
 }
  
 */