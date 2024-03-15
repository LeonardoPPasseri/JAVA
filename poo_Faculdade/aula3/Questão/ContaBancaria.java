package poo_Faculdade.aula3.Questão;

public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;

    ContaBancaria(){
        dataAbertura = new Data(); //Necessario iniciar a classe
        dataAbertura.dia();
        dataAbertura.mes();
        dataAbertura.ano();
        System.out.println("Data de criação da conta: " + getDataAberturaFormatada());
    }

    public void depositar(double valor){
        setSaldo(valor + getSaldo());
    }

    public void sacar(double valor){
        if(getSaldo() < valor){
            System.out.println("ERRO! Saldo insuficiente");
        }else{
            setSaldo(getSaldo() - valor);
        }
    }

//============================= get set
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Data getDataAbertura(){
        return dataAbertura;
    }
    public void setDataAbertura(Data dataAbertura){
        this.dataAbertura = dataAbertura;
    }
    
    public String getDataAberturaFormatada(){
        int d = dataAbertura.getDia();
        int m =dataAbertura.getMes();
        if(d > 0 && d < 10 && m > 0 && m < 10 ){
            return ("0"+dataAbertura.getDia() + "/" + "0" + dataAbertura.getMes() + "/" + dataAbertura.getAno());
        }if(d > 0 && d < 10){
            return ("0" + dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno());
        }if(m > 0 && m < 10){
            return (dataAbertura.getDia() + "/" + "0" + dataAbertura.getMes() + "/" + dataAbertura.getAno());
        }
        return (dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno());
    }

    public String getSaldoFormatado(){
        return (String.format("%.2f", getSaldo()) );
    }

    
}
