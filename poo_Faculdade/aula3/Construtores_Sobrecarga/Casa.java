package poo_Faculdade.aula3.Construtores_Sobrecarga;

public class Casa { 
    int x;
    int y;
    Casa(){//"Construtor" Padrão
        System.out.println("Construtor padrão - não precisa de argumentos");
    }
    Casa(int x, int y){ //Isso é um "construtor"

        System.out.println("Construtor de casas criado com x e y :3");
    }
    Casa(int x){ //Isso é uma "sobrecarga" A diferença é a lista de parametros
        
    System.out.println("Construtor de casas criado mas apenas com x:3");
    }
    public static void main(String[] args) {

        Casa[] casa = new Casa[10];

        for(int i = 8;i<casa.length;i++){
            casa[i] = new Casa();
            
        } 
        for(int i = 6;i<8;i++){
            casa[i] = new Casa(10,5);
            
        } 
        for(int i = 4;i>=0;i--){
            casa[i] = new Casa(10);
            
        } 
    }
    /*
    Sempre que vc criar um novo objeto usando a class (Casa) que possui esse construtor, o 
    print será mostrado na tela;
    Pode ser usado para colocar parametros nesse objeto sempre que um novo for criado.
    */
}
