package poo_Faculdade.Aula7_Interface_Collection.Split;

public class Split {
    public static void main(String[] args) {
        String a = "Roberto#34#1.8";
        String[] b = a.split("#");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
