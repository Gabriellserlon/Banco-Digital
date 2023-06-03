package entidades;

import java.util.ArrayList;

public class Poupanca extends Conta {
    private double saldoPoupanca;
    private Conta conta;
    public Poupanca(double numeroConta, Conta conta) {
        super(numeroConta);
        this.saldoPoupanca = saldoPoupanca;
        this.conta = conta;
    }
    public void guardarPoupanca(double valor){
        if (valor <= this.conta.getSaldoConta()){
            this.saldoPoupanca += valor;
            this.conta.setSaldoConta(this.conta.getSaldoConta() - valor);
            System.out.println("Valor guardado!");
            setExtrato("Valor guardado: "+valor);
        }else{
            System.out.println("Digite um valor válido");
        }
    }
    public void resgatarPoupanca(double valor){
        if (valor <= this.saldoPoupanca){
            this.saldoPoupanca -= valor;
            this.conta.setSaldoConta(this.conta.getSaldoConta() + valor);
            System.out.println("Valor resgatado!");
            setExtrato("Valor resgatado: "+valor);
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
    public double verificarSaldoPoupanca(){
        return this.saldoPoupanca;
    }

    public void rendimentoPoupanca(){
        this.saldoPoupanca = this.saldoPoupanca*1.02;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
