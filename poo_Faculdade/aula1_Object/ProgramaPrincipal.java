package poo_Faculdade.aula1_Object;


public class ProgramaPrincipal {
	public static void main(String []args) {
		System.out.println("Olá Mundo");
		Cachorro c;
		c = new Cachorro();
		//Primeiro é preciso criar a variavel 
        //o new cria um objeto na memoria
        //com essas duas linhas agora o c esta conectado ao objeto criado
//cachorro c = new cachorro();
        c.nome = "Popo";
        c.idade = 2;
        c.cor = "Preto e branco";
        Cachorro d = new Cachorro();
        d.nome = "Shanti";
        d.idade = 5;
        d.cor = "Preto e Branco";
        System.out.println(c.nome + " é meu cachorro e tem " + c.idade + " anos e possui as cores " + c.cor);
        System.out.println(d.nome + " é meu outro cachorro e tem " + d.idade + " anos e possui as cores " + d.cor);
	}
}
