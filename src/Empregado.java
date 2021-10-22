public class Empregado extends Pessoa {
    
    private int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor(){
        return this.codigoSetor;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double getImposto(){
        return this.imposto;
    }

    public double calcularSalario(){
        return this.salarioBase + this.imposto;
    }

}
