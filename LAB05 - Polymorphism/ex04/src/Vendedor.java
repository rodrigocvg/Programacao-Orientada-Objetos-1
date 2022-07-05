public class Vendedor extends Funcionario{

    private int vendas;

    public Vendedor(float salario, String nome, String datanasc, int vendas){
        super((salario + (0.10f * vendas)),nome,datanasc);
        this.vendas = 0;
    }


    public void trabalhar(){
        this.vendas += 1;
        this.setSalario(this.getSalario() + (0.10f + vendas));
    }
    
}
