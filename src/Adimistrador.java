public class Adimistrador extends Empregado {
    
    private double ajudaDeCustos;

    public void setAjudaDeCustos(double ajudaDeCustos){
        this.ajudaDeCustos = ajudaDeCustos;
    }


    public double getAjudaDeCustos(){
        return this.ajudaDeCustos;
    }

    public double calcularSalario(){
        return this.salarioBase + this.imposto + this.ajudaDeCustos; 
    }


}
