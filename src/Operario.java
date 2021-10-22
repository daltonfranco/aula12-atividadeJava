public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public void setValorProducao(double valorProducao){
        this.valorProducao = valorProducao;
    }

    public double getValorProducao(){
        return this.valorProducao;
    }

    public void setComissao(){
        this.comissao = comissao + valorProducao;
    }

    public double calcularSalario(){
        return this.salarioBase + this.imposto + this.comissao;
    }
    
}
