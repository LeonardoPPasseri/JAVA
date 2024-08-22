package poo_Faculdade.Aula7_Interface_Collection.Parse;

public class Parse {
    public static void main(String[] args) {
        String a = "24";
        String b = "1";
        String c = "0.1312";
        String d = "0.5984";
        System.out.println(a + b);
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        System.out.println(c + d);
        System.out.println(Double.parseDouble(c) + Double.parseDouble(d));
    }
}
