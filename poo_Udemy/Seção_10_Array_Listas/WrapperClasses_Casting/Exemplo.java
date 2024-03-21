package poo_Udemy.Seção_10_Array_Listas.WrapperClasses_Casting;

public class Exemplo {
    //Uso dos wrapperClasses
    public Integer preço;
    public Boolean estoque;
    //As wrapperClasses podem receber valor null, os primitivos não
    
    public static void main(String[] args) {
        int x = 20; 
        Object obj = x; //Essa classe Object é uma WrapperClasse de um obejeto
        System.out.println(obj);


        int y = (int) obj; //Esse (int) é um casting, no caso, do tipo objeto para int
        System.out.println(y);
        //No caso acima, se em vez de ser Object for Integer não seria necessario usar o casting(int)
    }
    
}
/*
 O casting é o processo de converter o valor de um tipo de dado primitivo para outro tipo. Em Java, existem dois tipos de casting: Widening Casting (automaticamente) e Narrowing Casting (explicitamente). O Widening Casting é quando um tipo de dado menor é atribuído a um tipo de dado maior. Por exemplo, um int pode ser atribuído a um long. O Narrowing Casting é quando um tipo de dado maior é atribuído a um tipo de dado menor. Por exemplo, um long não pode ser atribuído a um int. 
 */

 /*
  WrapperClasses são Classes equivalentes aos tipos primitivos
  Possuem o objetivo de tratar os tipos primitivos como classes so que de uma forma trasparente ao compilador

  Object{
    Boolean(boolean);
    Character(char);
    Number{
        Byte(byte)
        Short(short)
        Integer(int)
        Long(long)
        Float(float)
        Double(double)
    }
  }

  */