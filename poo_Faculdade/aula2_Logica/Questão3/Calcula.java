package poo_Faculdade.aula2_Logica.Questão3;

public class Calcula {
    int soma;
    public void loop(){
        soma = 0;
        for(int c=1;c<1000;c++){
            if(c % 2 == 1){
                soma += c;
            }
        }
            System.out.println("A soma dos numeros impares de 1 a 10000 é igual a: " + soma);
    }
}
