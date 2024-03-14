package poo_Faculdade.aula2_Logica_Array;
//Aqui veremos como add um novo array a outro ja existente.

public class AddNewArray {
    int idade;
    public static void main(String[] args) {
        AddNewArray[] x = new AddNewArray[5]; //Cria o array
        for(int i=0;i<5;i++){ //Usa esse for para cololocar a class em cada espaço do array
            x[i] = new AddNewArray();
            x[i].idade = 10; //adiciona um  valor no array
            System.out.println(x[i].idade);
        }

        System.out.println("========================");

        AddNewArray[] y = new AddNewArray[10];//Cria 10 espaços
        for(int c=0;c<10;c++){
            y[c] = new AddNewArray();//Dá a class para os 10 espaços
            if(c<5){ //Para que o valor do outro array seja adicionado ao novo
                y[c] = x[c];
            }else{ //Da o valor ao resto do array
                y[c].idade = 20;
            }
            System.out.println(y[c].idade);
        }
        y[3].idade = 55; //Se quisermos podemos alterar o antigo array(x) com valores novos no novo(y)
        for(int c=0;c<10;c++){
            System.out.println(x[c].idade);//Mostra o antigo array antigo com a alteração
        }

        //Com isso, mantemos o valor do antigo array e criamos um com mais espaço.
    }
}
