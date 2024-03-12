package poo_Udemy.Seção_8_Intro_a_POO.Problema1;

public class CalculaArea {
    double a;
    double b;
    double c;
    public double calcula() {
        double area;
        double p;
        p = (a+b+c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
