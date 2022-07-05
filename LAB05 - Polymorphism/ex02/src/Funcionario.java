public class Funcionario extends Pessoa{
    
    protected int matricula;
    protected float salarioBase;

    public Funcionario(String nome, String cPF, String rG, int idade, int matricula) {
        super(nome, cPF, rG, idade);
        this.matricula = matricula;
        this.salarioBase = 1000;
    }

    public float calculaSalario(){
        return salarioBase;
    }
    
}
