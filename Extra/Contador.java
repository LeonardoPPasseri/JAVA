package Extra;

public class Contador{
    public void loop(){
        for(int c=0;c<=10;c++){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Contador a = new Contador();
        a.loop();
    }
}
