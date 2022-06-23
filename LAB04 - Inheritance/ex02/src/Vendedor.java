public class Vendedor extends Funcionario{

    private int vendas;

    public Vendedor(float salario, String nome, String datanasc, int vendas){
        super((salario + (0.10f * vendas)),nome,datanasc);
    }
    public void vender(){
        this.vendas += 1;
    }
    
}
