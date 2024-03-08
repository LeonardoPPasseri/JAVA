package poo_Faculdade.aula1_Object;

public class VariaveisApontamParaOMesmoObjeto {
	public static void main(String []args){
		Cachorro e = new Cachorro();
		Cachorro d = e;
		e.nome = "Pluto";
		d.nome = "Rex";
		System.out.println(e.nome);
		//As duas variaveis apontam para o msm objeto.Isso faz com que ao mudar o nome...
		// do Pluto para Rex no d.nome, alterará novamente o mesmo objeto apontado.(Rex)
	}
}
