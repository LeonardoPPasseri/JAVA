package poo_Faculdade.aula2_Logica.Questão4;

public class SomadorComExceção {
    int soma = 0;
    public int loop(){
        for(int c=0;c<=50000;c++){
            if(c>99 && c<138){
                continue; //Usado para pular direto para o for novamente
            }
            soma += c;
        }
        return soma;
    }
    public static void main(String[] args) {
        SomadorComExceção contador = new SomadorComExceção();
        System.out.println("A soma dos numeros de 1 a 50000 com exceção dos 100 ao 137: " + contador.loop());
    }
}
