public class Atendente extends Funcionario{
    private float comissao;
    private int numVendas;


    public Atendente(String nome, String cPF, String rG, int idade, int matricula) {
        super(nome, cPF, rG, idade, matricula);
        this.comissao = 0.45f;
        this.numVendas = 0;
    }
    public void computaVenda(){
        this.numVendas++;
    }

    public float calculaSalario(){
        return(salarioBase + (numVendas*comissao));
    }


}
