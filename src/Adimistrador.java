public class Adimistrador extends Empregado {
    
    private double ajudaDeCustos;

    //get set


    @Override
    public double calculaSalario(){
        return super.calculaSalario() + this.ajudaDeCustos;
    }

}
