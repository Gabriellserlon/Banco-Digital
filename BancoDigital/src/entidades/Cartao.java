package entidades;

import java.util.ArrayList;

public class Cartao{
    private Usuario titular;
    private double limiteCredito;
    private ArrayList historico;
    private double fatura;

    public Cartao(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public ArrayList getHistorico() {
        return historico;
    }

    public void setHistorico(double valor) {
        historico.add(valor);
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double valor) {
        this.fatura += valor;
    }

    public void compra(double valor, int parcelamento){
        if (valor > this.limiteCredito){
            System.out.println("Você não possui limite disponível");
        }else{
            this.limiteCredito -= valor;
            setHistorico(valor);
            setFatura(valor);
        }
    }
    public double consultarFatura(){
        return  this.fatura;
    }
    public ArrayList consultarHistorico(){
        return historico;
    }
    public double cosultarLimite(){
        return this.limiteCredito;
    }
}

