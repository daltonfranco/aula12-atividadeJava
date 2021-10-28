public class Empregado extends Pessoa {
    
    private String codigoSetor;
    private double salarioBase;
    private double imposto;

    public void setCodigoSetor(String codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public String getCodigoSetor(){
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

    
    public double calculaSalario(){
        double salarioTotal = 0;
        salarioTotal = this.salarioBase - this.imposto;
        return salarioTotal;
    }

}
