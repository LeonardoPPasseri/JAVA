package poo_Faculdade.String;

public class StringImplements {
    public static void main(String[] args) {
        
        String str = "  PaRaLeLiSmO";
        System.out.println("String:  PaRaLeLiSmO");
        System.out.println("toUpperCase:  "+str.toUpperCase());
        System.out.println("toLowerCase:  "+str.toLowerCase());
        System.out.println("CharAt(3) [Quarta letra]:  "+str.charAt(3));
        System.out.println("replace(a,4):  "+str.replace("a","4"));
        System.out.println("trim():"+str.trim()); //Remove o espaço no inicio da string
    }
}
