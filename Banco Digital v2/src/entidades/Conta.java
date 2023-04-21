package entidades;

public class Conta extends Transferencia{
    private double numeroConta;
    protected double saldoConta;
    private double saldoPoupanca;

    public Conta(double numeroConta){
        this.numeroConta = numeroConta;
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

    public double verificarSaldoConta(){
        return this.saldoConta;
    }

    public double verificarSaldoPoupanca(){
        return this.saldoPoupanca;
    }

    public void depositar(double valor){
        if (valor>0){
            this.saldoConta += valor;
            System.out.println("Valor depositado!");
            System.out.println("Novo saldo: "+this.saldoConta);
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
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
    public void guardarPoupanca(double valor){
        if (valor <= this.saldoConta){
            this.saldoPoupanca += valor;
            this.saldoConta -= valor;
            System.out.println("Valor guardado!");
        }else{
            System.out.println("Digite um valor válido");
        }
    }
    public void resgatarPoupanca(double valor){
        if (valor <= this.saldoPoupanca){
            this.saldoPoupanca -= valor;
            this.saldoConta += valor;
            System.out.println("Valor resgatado!");
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
}
