package poo_Faculdade.aula3.Construtores;

public class Casa { 
    Casa(){ //Isso é um "construtor"
        System.out.println("Construtor de casas criado :3");
    }
    public static void main(String[] args) {

        Casa[] casa = new Casa[10];

        for(int i = 0;i<casa.length;i++){
            casa[i] = new Casa();
        } 
    }
    /*
    Sempre que vc criar um novo objeto usando a class (Casa) que possui esse construtor, o 
    print será mostrado na tela;
    Pode ser usado para colocar parametros nesse objeto sempre que um novo for criado.
    */
}
