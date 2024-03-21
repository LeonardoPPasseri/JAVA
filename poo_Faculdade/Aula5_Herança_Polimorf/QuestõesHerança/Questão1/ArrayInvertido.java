package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão1;

public class ArrayInvertido {
    
    public static void main(String[] args) {
        Integer[] vetor = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("=====================");
        inverter(vetor);
    }

    public static void inverter(Integer vetor[]){
        for(int i=9;i>=0;i--){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("=====================");
    }
}
