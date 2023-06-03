package entidades;

import java.util.ArrayList;

public class Conta{
    private double numeroConta;
    private double saldoConta;
    private ArrayList extrato;

    public Conta(double numeroConta){
        this.numeroConta = numeroConta;
        ArrayList extrato = new ArrayList<>();
        this.extrato = extrato;
    }

    public double getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(double valor){
        this.saldoConta = valor;
    }
    public void setExtrato(String valor){
        this.extrato.add(valor);
    }

    public double verificarSaldoConta(){
        return this.saldoConta;
    }
    public void verificarExtrato(){
        System.out.println(this.extrato);
    }

    public void depositar(double valor){
        if (valor>0){
            this.saldoConta += valor;
            System.out.println("Valor depositado!");
            System.out.println("Novo saldo: "+this.saldoConta);
            this.extrato.add("Valor depositado: "+valor);
        }else{
            System.out.println("Digite um valor válido!");
        }
    }

    public void sacar(double valor){
        //Banco cobra 6,00 para saques
        if (valor<=this.saldoConta+6){
            this.saldoConta -= valor;
            this.saldoConta -= 6;
            System.out.println("Valor sacado!");
            System.out.println("Novo saldo: "+this.saldoConta);
            this.extrato.add("Valor sacado: "+valor);
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
}
