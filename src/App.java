public class App {
    public static void main(String[] args){

        Empregado empregado = new Empregado();

        empregado.setNome("Joanir da Silva Sauro");
        empregado.setCodigoSetor("123456789");
        empregado.setTelefone("123123123");
        empregado.setEndereco("Omar Leite da Cunha 458");
        empregado.setSalarioBase(1500.00);
        empregado.setImposto(100.00);
        System.out.println("O salario do: " + empregado.getNome() + "é: " + empregado.calculaSalario() + " reais");

        System.out.println("----------------------------------------");

        Adimistrador adm = new Adimistrador();

        adm.setNome("Jocilmar das Neves Gomes Pinto");
        adm.setCodigoSetor("3123213423423423");
        adm.setEndereco("Capoeira Quente bloco A4 245");
        adm.setSalarioBase(3000.00);
        adm.setImposto(300.00);
        adm.setAjudaDeCustos(1000.00);
        

        System.out.println("O salario do: " + adm.getNome() + "é: " + adm.calculaSalario() + " reais");

        
        System.out.println("----------------------------------------");

    }
}
