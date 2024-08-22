package poo_Faculdade.Aula7_Interface_Collection.Equals;

public class String_string {    
    public static void main(String[] args) {
        String a = "xy";
        String b = "xy";

        if(a == b){
            System.out.println("ok");
        }else{
            System.out.println("falso");
        }
        System.out.println("=================");
        String c = new String("xy");
        String d = new String("xy");
        if(c == d){
            System.out.println("ok");
        }else{
            System.out.println("falso");
        }
    }
}
