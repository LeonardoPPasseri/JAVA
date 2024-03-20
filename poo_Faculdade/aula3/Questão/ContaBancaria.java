package poo_Faculdade.aula3.Questão;

public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;

    ContaBancaria(){
        dataAbertura = new Data(); //Necessario iniciar a classe
        dataAbertura.dia();
        dataAbertura.mes();
        dataAbertura.ano();
        System.out.println("Data de criação da conta: " + getDataFormatada());
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

    public String getDataFormatada(){
        String stringData = "";
        if(dataAbertura.getDia() < 10){
            stringData += "0"+dataAbertura.getDia()+"/";
        }else{
            stringData += dataAbertura.getDia() + "/";
        }
        if(dataAbertura.getMes() < 10 ){
            stringData += "0"+dataAbertura.getMes()+"/";
        }else{
            stringData += dataAbertura.getMes() + "/";
        }
        return stringData + dataAbertura.getAno();
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

    public String getSaldoFormatado(){
        return (String.format("%.2f", getSaldo()) );
    }

    
}
