package entidades;

public class Emprestimo extends Transferencia {
    private double valorEmprestimo;
//    prazo em meses
    private double prazo;
//    juros calculado de acordo com o prazo
    private double juros;

    public Emprestimo(double valorEmprestimo, double prazo){
        this.juros = (0.015 * prazo);
        this.valorEmprestimo += ((valorEmprestimo)*(1+this.juros)/prazo);
        System.out.println("Empréstimo realizado!");
    }
    public double consultarEmprestimo(){
        return this.valorEmprestimo;
    }
    public double getValorEmprestimo(){
        return valorEmprestimo;
    }
    public void setValorEmprestimo(double valor){
        this.valorEmprestimo = valor;
    }
}
