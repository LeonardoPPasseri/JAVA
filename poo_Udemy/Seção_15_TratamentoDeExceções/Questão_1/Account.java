package poo_Udemy.Seção_15_TratamentoDeExceções.Questão_1;

public class Account {

	private Integer numero;
	private String nome;
	protected Double saldo;
	private Double limite;
	
	public Account() {
	}
	
	public Account(Integer numero, String nome, Double saldo,Double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void depositar(Double quantia){
		saldo += quantia;
	}
	public void sacar(Double quantia){
		if(saldo == 0.0){
			throw new Exception("Saldo Zero");
		}
		if(quantia > limite){
			throw new Exception("Limite de saque ultrapassado");
		}
		if(quantia > saldo){
			throw new Exception("Saldo insuficiente");
		}
		saldo -= quantia;
	}


	public void setLimite(Double limite) {
		this.limite = limite;
	}public Double getLimite() {
		return limite;
	}public void setNome(String nome) {
		this.nome = nome;
	}public String getNome() {
		return nome;
	}public void setNumero(Integer numero) {
		this.numero = numero;
	}public Integer getNumero() {
		return numero;
	}public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}public Double getSaldo() {
		return saldo;
	}
	
	
}