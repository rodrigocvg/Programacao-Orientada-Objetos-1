public class Piloto extends Funcionario{
    private int numHoras;

    public Piloto(String nome, String cPF, String rG, int idade, int matricula, int numHoras) {
        super(nome, cPF, rG, idade, matricula);
        this.numHoras = numHoras;
    }

    public float calculaSalario(){
        return(salarioBase + numHoras *4);
    }
    
}
