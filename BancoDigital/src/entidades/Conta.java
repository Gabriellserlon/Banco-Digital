package entidades;

public class Conta {
    private double numeroConta;
    private double saldo;
    private Usuario usuario;
    private double saldoPoupanca;
    private Cartao cartao;


    public Conta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            this.saldo += valor;
            System.out.println("Valor depositado!");
            System.out.println("Novo saldo: "+this.saldo);
        }else{
            System.out.println("Digite um valor válido!");
        }
    }

    public void sacar(double valor){
        //Banco cobra 6,00 para saques
        if (valor<=this.saldo+6){
            this.saldo -= valor;
            this.saldo -= 6;
            System.out.println("Valor sacado!");
            System.out.println("Novo saldo: "+this.saldo);
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
    public void guardarPoupanca(double valor){
        if (valor <= this.saldo){
            this.saldoPoupanca += valor;
            this.saldo -= valor;
        }else{
            System.out.println("Digite um valor válido");
        }
    }
    public void resgatarPoupanca(double valor){
        if (valor <= this.saldoPoupanca){
            this.saldoPoupanca -= valor;
            this.saldo += valor;
        }
    }
}
