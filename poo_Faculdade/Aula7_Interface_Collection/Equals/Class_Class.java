package poo_Faculdade.Aula7_Interface_Collection.Equals;

import java.util.ArrayList;
import java.util.List;

public class Class_Class {
    public static void main(String[] args) {
        Aluno a = new Aluno("Gustavo",13414);
        Aluno b = new Aluno("Gustavo", 13414);
        if(a.equals(b)){
            System.out.println("ok");
        }else{
            System.out.println("falso");
        }

        System.out.println("=========================");

        Aluno c = new Aluno("Raph",13314);
        Aluno d = new Aluno("Mario", 13444);
        List<Aluno> e = new ArrayList<>();
        e.add(c);
        e.add(d);
        System.out.println(e);
        Aluno f = new Aluno("Mario", 0);//Gabiarra usada pra achar o nome "Mario" em uma lista
        if(e.contains(f)){
            System.out.println("ok");//o print de dois "passou" significa que o contains usa o equals modificado
            int local = e.indexOf(f);
            System.out.println(local);
            
        }else{
            System.out.println("falso");
        }

    }
}