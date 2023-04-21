package entidades;

public class Cartao extends Transferencia{
    private double limiteCredito;
    private double fatura;

    public Cartao(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getFatura() {
        return this.fatura;
    }

    public void setFatura(double valor) {
        this.fatura = valor;
    }

    public void compraCredito(double valor, int parcelamento){
        if (valor > this.limiteCredito){
            System.out.println("Você não possui limite disponível");
        }else{
            this.limiteCredito -= valor;
            setFatura(valor/parcelamento);
            System.out.println("Compra finalizada");
        }
    }
    public double consultarFatura(){
        return this.fatura;
    }

    public double cosultarLimite(){
        return this.limiteCredito;
    }
    public void modificarLimite(double novoLimite){
        if (novoLimite > this.limiteCredito){
            System.out.println("Não é possível aumentar o limite");
        }else{
            this.limiteCredito = novoLimite;
            System.out.println("Limite disponível: "+this.limiteCredito);
        }
    }
}