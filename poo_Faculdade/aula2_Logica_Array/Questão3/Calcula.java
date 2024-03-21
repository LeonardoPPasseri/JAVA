package poo_Faculdade.Aula2_Logica_Array.Questão3;

public class Calcula {
    int soma = 0;
    public int loop(){
        for(int c=0;c<10000;c++){
            if(c % 2 == 1){
                soma += c;
            }
        }
        return soma;
        //System.out.println("A soma dos numeros impares de 1 a 10000 é igual a: " + soma);
    }
    public static void imprimir(String[]args){
       Calcula impar = new Calcula();
       System.out.println("A soma dos numeros impares de 1 a 10000 é igual a: " + impar.loop());
    }
}
