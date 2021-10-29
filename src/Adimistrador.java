public class Adimistrador extends Empregado {
    
    private double ajudaDeCustos;

    public void setAjudaDeCustos(double ajudaDeCustos){
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public double getAjudaDeCustos(){
        return this.ajudaDeCustos;
    }


    @Override
    public double calculaSalario(){
        return super.calculaSalario() + this.ajudaDeCustos;
    }

}
